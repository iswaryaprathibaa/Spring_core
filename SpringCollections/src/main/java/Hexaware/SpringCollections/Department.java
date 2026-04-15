package Hexaware.SpringCollections;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Department {
	private int deptId;
	private String deptName;
	@PostConstruct
	void start(){
		System.out.println("starting.....");
	}
	
	@PreDestroy
	void stop() {
		System.out.println("stoppping.......");
	}
	public int getDeptId() {
		return deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public Department(int deptId, String deptName, Employee e1) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
			}
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", e1="  + "]";
	}
	
}
