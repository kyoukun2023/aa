package model;

public class Teacher {
	private String userId;
	private String pass;
	private int yakuwari;


	public Teacher(String userId,String pass,int yakuwari) {
		this.userId=userId;
		this.pass=pass;
		this.yakuwari=yakuwari;
	}

	public Teacher(String userId,int yakuwari) {
		this.userId=userId;
		this.yakuwari=yakuwari;
	}


	public String getUserId() {
		return userId;
	}

	public String getPass() {
		return pass;
	}

	public int getyakuwari() {
		return yakuwari;
	}



}
