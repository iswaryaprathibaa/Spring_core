package Hexaware.com.example.SpringCore;

public class Department {
	int depId;
	String deptName;
	Employee empobj;
	public Employee getEmpobj() {
		return empobj;
	}
	public void setEmpobj(Employee empobj) {
		this.empobj = empobj;
	}
	public int getDepId() {
		return depId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	@Override
	public String toString() {
		return "Department [depId=" + depId + ", deptName=" + deptName + ", empobj=" + empobj + "]";
	}
	
	public Department(int depId, String deptName, Employee empobj) {
		super();
		this.depId = depId;
		this.deptName = deptName;
		this.empobj = empobj;
	}
	public Department() {
		super();
	}
	
}
