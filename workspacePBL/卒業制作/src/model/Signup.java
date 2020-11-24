package model;

public class Signup {

	private String SenseName;
	private String SenseID;
	private int loginPass;
	private int kakuninpw;
	
	public Signup() {}
	
	public Signup(String SenseName,String SenseID,int loginPass,int kakuninpw ) {
		this.SenseName=SenseName;
		this.SenseID=SenseID;
		this.loginPass=loginPass;
		this.kakuninpw=kakuninpw;
	}

	
	public void setSenseName(String senseName) {
		SenseName = senseName;
	}

	public void setSenseID(String senseID) {
		SenseID = senseID;
	}

	public void setLoginPass(int loginPass) {
		this.loginPass = loginPass;
	}

	public void setKakuninpw(int kakuninpw) {
		this.kakuninpw = kakuninpw;
	}
	
	
}
