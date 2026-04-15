package Hexaware.com.example.SpringCore;

public class Engine {
	int engineNo;
	String engineType;
	int cc;
	public int getEngineNo() {
		return engineNo;
	}
	public String getEngineType() {
		return engineType;
	}
	public int getCc() {
		return cc;
	}
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "Engine [engineNo=" + engineNo + ", engineType=" + engineType + ", cc=" + cc + "]";
	}
	public Engine(int engineNo, String engineType, int cc) {
		super();
		this.engineNo = engineNo;
		this.engineType = engineType;
		this.cc = cc;
	}
	public Engine() {
		super();
	}
	
}
