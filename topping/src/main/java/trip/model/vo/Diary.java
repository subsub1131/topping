package trip.model.vo;

import java.sql.Date;

public class Diary implements java.io.Serializable {
	private static final long serialVersionUID = 113L;
	
	private int diaryNum;  //게시글번호
	private String diaryWriter; //게시글 작성자 아이디
	private String diaryTitle;  //게시글 제목
	private String diaryContent;  //게시글 내용
	private String diaryOriginalFilename;  //첨부파일 원래이름
	private String diaryRenameFilename;  //변경된 첨부파일이름
	private int diaryRef;  //원글은 자기번호, 댓글은 원글번호
	private int diaryLevel;  //원글 1, 댓글 2, 대댓글 3
	private int diaryReplyRef;  //원글 0, 댓글은 자기번호, 대댓글은 참조하는 댓글번호
	private int diaryReplySeq;  //댓글과 대댓글의 순번, 최근 댓글을 1
	private int diaryReadCount; //읽은 조회수
	private java.sql.Date diaryDate;  //게시글 등록 날짜
	
	public Diary() {}

	public Diary(String DiaryWriter, String DiaryTitle, String DiaryContent) {
		super();
		this.diaryWriter = diaryWriter;
		this.diaryTitle  = diaryTitle;
		this.diaryContent = diaryContent;
	}

	public Diary(String diaryWriter, String diaryTitle, 
			String diaryContent, String diaryOriginalFilename,
			String diaryRenameFilename) {
		super();
		this.diaryWriter = diaryWriter;
		this.diaryTitle = diaryTitle;
		this.diaryContent = diaryContent;
		this.diaryOriginalFilename = diaryOriginalFilename;
		this.diaryRenameFilename = diaryRenameFilename;
	}

	public Diary(int DiaryNum, String DiaryWriter, String DiaryTitle, String DiaryContent, String DiaryOriginalFilename,
			String DiaryRenameFilename, int DiaryRef, int DiaryLevel, int DiaryReplyRef, int DiaryReplySeq,
			int DiaryReadCount, Date DiaryDate) {
		super();
		this.diaryNum = DiaryNum;
		this.diaryWriter = DiaryWriter;
		this.diaryTitle = DiaryTitle;
		this.diaryContent = DiaryContent;
		this.diaryOriginalFilename = DiaryOriginalFilename;
		this.diaryRenameFilename = DiaryRenameFilename;
		this.diaryRef = DiaryRef;
		this.diaryLevel = DiaryLevel;
		this.diaryReplyRef = DiaryReplyRef;
		this.diaryReplySeq = DiaryReplySeq;
		this.diaryReadCount = DiaryReadCount;
		this.diaryDate = DiaryDate;
	}

	public int getDiaryNum() {
		return diaryNum;
	}

	public void setDiaryNum(int diaryNum) {
		this.diaryNum = diaryNum;
	}

	public String getDiaryWriter() {
		return diaryWriter;
	}

	public void setDiaryWriter(String diaryWriter) {
		this.diaryWriter = diaryWriter;
	}

	public String getDiaryTitle() {
		return diaryTitle;
	}

	public void setDiaryTitle(String diaryTitle) {
		this.diaryTitle = diaryTitle;
	}

	public String getDiaryContent() {
		return diaryContent;
	}

	public void setDiaryContent(String diaryContent) {
		this.diaryContent = diaryContent;
	}

	public String getDiaryOriginalFilename() {
		return diaryOriginalFilename;
	}

	public void setDiaryOriginalFilename(String diaryOriginalFilename) {
		this.diaryOriginalFilename = diaryOriginalFilename;
	}

	public String getDiaryRenameFilename() {
		return diaryRenameFilename;
	}

	public void setDiaryRenameFilename(String diaryRenameFilename) {
		this.diaryRenameFilename = diaryRenameFilename;
	}

	public int getDiaryRef() {
		return diaryRef;
	}

	public void setDiaryRef(int diaryRef) {
		this.diaryRef = diaryRef;
	}

	public int getDiaryLevel() {
		return diaryLevel;
	}

	public void setDiaryLevel(int diaryLevel) {
		this.diaryLevel = diaryLevel;
	}

	public int getDiaryReplyRef() {
		return diaryReplyRef;
	}

	public void setDiaryReplyRef(int diaryReplyRef) {
		this.diaryReplyRef = diaryReplyRef;
	}

	public int getdiaryReplySeq() {
		return diaryReplySeq;
	}

	public void setDiaryReplySeq(int diaryReplySeq) {
		this.diaryReplySeq = diaryReplySeq;
	}

	public int getDiaryReadCount() {
		return diaryReadCount;
	}

	public void setDiaryReadCount(int diaryReadCount) {
		this.diaryReadCount = diaryReadCount;
	}

	public java.sql.Date getDiaryDate() {
		return diaryDate;
	}

	public void setDiaryDate(java.sql.Date diaryDate) {
		this.diaryDate = diaryDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Diary [DiaryNum=" + diaryNum + ", DiaryWriter=" + diaryWriter + ", DiaryTitle=" + diaryTitle
				+ ", DiaryContent=" + diaryContent + ", DiaryOriginalFilename=" + diaryOriginalFilename
				+ ", DiaryRenameFilename=" + diaryRenameFilename + ", DiaryRef=" + diaryRef + ", DiaryLevel="
				+ diaryLevel + ", DiaryReplyRef=" + diaryReplyRef + ", DiaryReplySeq=" + diaryReplySeq
				+ ", DiaryReadCount=" + diaryReadCount + ", DiaryDate=" + diaryDate + "]";
	}
	
}

