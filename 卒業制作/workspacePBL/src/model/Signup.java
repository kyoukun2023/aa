package model;

public class Signup {

	private String teacherName;
	private String teacherID;
	private String loginPass;
	private String kakupw;

	public Signup() {}

	public Signup(String teacherName,String teacherID,String loginPass,String kakupw ) {
		this.teacherName=teacherName;
		this.teacherID=teacherID;
		this.loginPass=loginPass;
		this.kakupw=kakupw;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	public String getLoginPass() {
		return loginPass;
	}

	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}

	public String getKakupw() {
		return kakupw;
	}

	public void setKakupw(String kakupw) {
		this.kakupw = kakupw;
	}





}