package trip.model.service;

import static common.JDBCTemp.*;

import java.sql.Connection;
import java.util.ArrayList;

import trip.model.dao.DiaryDao;
import trip.model.vo.Diary;

public class DiaryService {
	private DiaryDao ddao = new DiaryDao();
	
	public ArrayList<Diary> selectTop3(){
		Connection conn = getConnection();
		ArrayList<Diary> list = ddao.selectTop3(conn);
		close(conn);
		return list;
	}
	
	public Diary selectDiary(int diaryNum) {
		Connection conn = getConnection();
		Diary diary = ddao.selectdiary(conn, diaryNum);
		close(conn);
		return diary;
	}
	
	public void addReadCount(int diaryNum) {
		Connection conn = getConnection();
		int result = ddao.updateReadCount(conn, diaryNum);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
	}

	public int getListCount() {
		Connection conn = getConnection();
		int listCount = ddao.getListCount(conn);
		close(conn);
		return listCount;
	}

	public ArrayList<Diary> selectList(int startRow, int endRow) {
		Connection conn = getConnection();
		ArrayList<Diary> list = ddao.selectList(conn, startRow, endRow);
		close(conn);
		return list;
	}

	public int insertOriginDiary(Diary diary) {
		Connection conn = getConnection();
		int result = ddao.insertOriginDiary(conn, diary);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int updateOrigin(Diary diary) {
		Connection conn = getConnection();
		int result = ddao.updateOrigin(conn, diary);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public int updateReply(Diary diary) {
		Connection conn = getConnection();
		int result = ddao.updateReply(conn, diary);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public void updateReplySeq(Diary reply) {
		Connection conn = getConnection();
		int result = ddao.updateReplySeq(conn, reply);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);		
	}

	public int insertReplyDiary(Diary reply) {
		Connection conn = getConnection();
		int result = ddao.insertReplyDiary(conn, reply);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int deleteDiary(int diaryNum, int diaryLevel) {
		Connection conn = getConnection();
		int result = ddao.deleteDiary(conn, diaryNum, diaryLevel);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
}










