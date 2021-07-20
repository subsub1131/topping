package trip.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import board.model.vo.diary;
import trip.model.vo.Diary;

public class DiaryDao {

	public ArrayList<Diary> selectTop3(Connection conn) {
		ArrayList<Diary> list = new ArrayList<Diary>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "SELECT * "
				+ "FROM (SELECT ROWNUM RNUM, diary_NUM, diary_TITLE, diary_READCOUNT "
				+ "        FROM (SELECT * FROM diary "
				+ "                WHERE diary_LEVEL = 1 "
				+ "                ORDER BY diary_READCOUNT DESC)) "
				+ "WHERE RNUM >= 1 AND RNUM <= 3";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				Diary diary = new Diary();
				
				diary.setDiaryNum(rset.getInt("diary_num"));
				diary.setDiaryTitle(rset.getString("diary_title"));
				diary.setDiaryReadCount(rset.getInt("diary_readcount"));
				
				list.add(diary);
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}		
		
		return list;
	}

	public Diary selectdiary(Connection conn, int diaryNum) {
		Diary diary = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from diary "
				+ "where diary_num = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, diaryNum);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				diary = new Diary();
				
				diary.setDiaryNum(diaryNum);
				diary.setDiaryTitle(rset.getString("diary_title"));
				diary.setDiaryWriter(rset.getString("diary_writer"));
				diary.setDiaryContent(rset.getString("diary_content"));
				diary.setDiaryOriginalFilename(rset.getString("diary_original_filename"));
				diary.setDiaryRenameFilename(rset.getString("diary_rename_filename"));
				diary.setDiaryDate(rset.getDate("diary_date"));
				diary.setDiaryLevel(rset.getInt("diary_level"));
				diary.setDiaryRef(rset.getInt("diary_ref"));
				diary.setDiaryReplyRef(rset.getInt("diary_reply_ref"));
				diary.setDiaryReplySeq(rset.getInt("diary_reply_seq"));
				diary.setDiaryReadCount(rset.getInt("diary_readcount"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return diary;
	}

	public int updateReadCount(Connection conn, int diaryNum) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update diary set "
				+ "diary_readcount = diary_readcount + 1 "
				+ "where diary_num = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, diaryNum);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int getListCount(Connection conn) {
		int listCount = 0;
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from diary";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			 
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return listCount;
	}

	public ArrayList<Diary> selectList(Connection conn, 
			int startRow, int endRow) {
		ArrayList<Diary> list = new ArrayList<Diary>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "SELECT * "
				+ "FROM (SELECT ROWNUM RNUM, DIARY_NUM, DIARY_TITLE, DIARY_WRITER,  "
				+ "                DIARY_ORIGINAL_FILENAME, DIARY_RENAME_FILENAME,  "
				+ "                DIARY_DATE, diary_LEVEL, diary_REF, DIARY_REPLY_REF,  "
				+ "                DIARY_REPLY_SEQ, DIARY_READCOUNT, diary_content "
				+ "        FROM (SELECT * FROM Diary "
				+ "                ORDER BY DIARY_REF DESC, DIARY_REPLY_REF DESC, "
				+ "                         DIARY_LEVEL ASC, DIARY_REPLY_SEQ ASC)) "
				+ "WHERE RNUM >= ? AND RNUM <= ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Diary diary  = new Diary();
				
				diary.setDiaryNum(rset.getInt("diary_num"));
				diary.setDiaryTitle(rset.getString("diary_title"));
				diary.setDiaryWriter(rset.getString("diary_writer"));
				diary.setDiaryContent(rset.getString("diary_content"));				diary.setdiaryDate(rset.getDate("diary_date"));
				diary.setDiaryOriginalFilename(rset.getString("diary_original_filename"));
				diary.setDiaryRenameFilename(rset.getString("diary_rename_filename"));
				diary.setDiaryRef(rset.getInt("diary_ref"));
				diary.setDiaryLevel(rset.getInt("diary_level"));
				diary.setDiaryReplyRef(rset.getInt("diary_reply_ref"));
				diary.setDiaryReplySeq(rset.getInt("diary_reply_seq"));
				diary.setDiaryReadCount(rset.getInt("diary_readcount"));
				
				list.add(diary);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public int insertOriginDiary(Connection conn, Diary diary) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "insert into diary values ("
				+ "(select max(diary_num) + 1 from diary), "
				+ "?, ?, ?, ?, ?, sysdate, 1, "
				+ "(select max(diary_num) + 1 from diary), "
				+ "null, default, default)";		
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, diary.getDiaryTitle());
			pstmt.setString(2, diary.getDiaryWriter());
			pstmt.setString(3, diary.getDiaryContent());
			pstmt.setString(4, diary.getDiaryOriginalFilename());
			pstmt.setString(5, diary.getDiaryRenameFilename());
						
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int updateOrigin(Connection conn, Diary origin) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update diary set "
				+ "diary_title = ?, "
				+ "diary_content = ?, "
				+ "diary_original_filename = ?, "
				+ "diary_rename_filename = ? "
				+ "where diary_num = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, origin.getDiaryTitle());
			pstmt.setString(2, origin.getDiaryContent());
			pstmt.setString(3, origin.getDiaryOriginalFilename());
			pstmt.setString(4, origin.getDiaryRenameFilename());
			pstmt.setInt(5, origin.getDiaryNum());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
	public int updateReply(Connection conn, Diary reply) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update diary set "
				+ "diary_title = ?, "
				+ "diary_content = ? "
				+ "where diary_num = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, reply.getDiaryTitle());
			pstmt.setString(2, reply.getDiaryContent());
			pstmt.setInt(3, reply.getDiaryNum());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int updateReplySeq(Connection conn, Diary reply) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = null;
		
		//새로 등록할 댓글이 원글의 댓글일 때
		if(reply.getDiaryLevel() == 2) {
			query = "update diary set "
				+ "diary_reply_seq = diary_reply_seq + 1 "
				+ "where diary_ref = ? and diary_level = ?";
		}
		
		//새로 등록할 댓글이 댓글의 댓글일 때
		if(reply.getDiaryLevel() == 3) {
			query = "update diary set "
					+ "diary_reply_seq = diary_reply_seq + 1 "
					+ "where diary_ref = ? and diary_level = ? "
					+ "and diary_reply_ref = ?";
		}
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, reply.getDiaryRef());
			pstmt.setInt(2, reply.getDiaryLevel());
			
			if(reply.getDiaryLevel() == 3) {
				pstmt.setInt(3, reply.getDiaryReplyRef());
			}
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int insertReplyDiary(Connection conn, Diary reply) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = null;
		
		if(reply.getDiaryLevel()  == 2) {
			query = "insert into diary values ("
				+ "(select max(diary_num) + 1 from diary), "
				+ "?, ?, ?, null, null, sysdate, 2, ?, "
				+ "(select max(diary_num) + 1 from diary), "
				+ "?, default)";
		}		
		
		if(reply.getDiaryLevel()  == 3) {
			query = "insert into diary values ("
					+ "(select max(diary_num) + 1 from diary), "
					+ "?, ?, ?, null, null, sysdate, 3, ?, "
					+ "?, ?, default)";
		}
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, reply.getDiaryTitle());
			pstmt.setString(2, reply.getDiaryWriter());
			pstmt.setString(3, reply.getDiaryContent());
			pstmt.setInt(4, reply.getDiaryRef());
			
			if(reply.getDiaryLevel() == 2) {
				pstmt.setInt(5, reply.getdiaryReplySeq());
			}
			
			if(reply.getDiaryLevel() == 3) {
				pstmt.setInt(5, reply.getDiaryReplyRef());
				pstmt.setInt(6, reply.getdiaryReplySeq());
			}
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int deleteDiary(Connection conn, 
			int diaryNum, int diaryLevel) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "delete from diary ";
		
		if(diaryLevel == 1) {
			//원글 삭제시에는 원글, 댓글, 대댓글 모두 삭제됨
			query += "where diary_ref = ?";
		}
		
		if(diaryLevel == 2) {
			//원글에 대한 댓글 삭제시, 대댓글 같이 삭제
			query += "where diary_reply_ref = ?";
		}
		
		if(diaryLevel == 3) {
			//대댓글은 자기글만 삭제
			query += "where diary_num = ?";
		}
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, diaryNum);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

}











