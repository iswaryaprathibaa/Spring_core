package Hexaware.com.example.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;

public class College {
	int c_id;
	String c_name;
	Student studentobj;
	public College(int c_id, String c_name, Student studentobj) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.studentobj = studentobj;
	}
	public College() {
		super();
	}
	@Autowired
	Student s1;
	
	public Student getS1() {
		return s1;
	}
	public void setS1(Student s1) {
		this.s1 = s1;
	}
	public int getC_id() {
		return c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public Student getStudentobj() {
		return studentobj;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public void setStudentobj(Student studentobj) {
		this.studentobj = studentobj;
	}
	@Override
	public String toString() {
		return "College [c_id=" + c_id + ", c_name=" + c_name + ", studentobj=" + studentobj + "]";
	}
	
}
