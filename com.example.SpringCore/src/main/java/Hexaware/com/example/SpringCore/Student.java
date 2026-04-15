package Hexaware.com.example.SpringCore;

public class Student {
	int stuId;
	String stuName;
	double marks;
	
	public Student() {
		super();
	}

	public Student(int stuId, String stuName, double marks) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.marks = marks;
	}

	public int getStuId() {
		return stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public double getMarks() {
		return marks;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", marks=" + marks + "]";
	}
	
	
}
