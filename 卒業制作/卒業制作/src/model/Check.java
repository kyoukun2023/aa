package model;

public class Check {
	private String SenseID;
	private String SenseName;
	private int yakuwari;

	public Check() {}

	public Check(String SenseID,String SenseName,int yakuwari) {
		this.SenseID=SenseID;
		this.SenseName=SenseName;
		this.yakuwari=yakuwari;
	}

	public String getSenseID() {
		return SenseID;
	}

	public void setSenseID(String senseID) {
		SenseID = senseID;
	}

	public String getSenseName() {
		return SenseName;
	}

	public void setSenseName(String senseName) {
		SenseName = senseName;
	}

	public int getYakuwari() {
		return yakuwari;
	}

	public void setYakuwari(int yakuwari) {
		this.yakuwari = yakuwari;
	}


}
