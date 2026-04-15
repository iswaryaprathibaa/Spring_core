package Hexaware.SpringCollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class College {
	int collegeId;
	String collegeName;
	List<String> departments;
	Set<String> subjects;
	Map<Integer,Double> marks;
	
	public Map<Integer, Double> getMarks() {
		return marks;
	}
	public void setMarks(Map<Integer, Double> marks) {
		this.marks = marks;
	}
	public Set<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public List<String> getDepartments() {
		return departments;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}
	
	
	
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", departments=" + departments
				+ ", subjects=" + subjects + ", marks=" + marks + "]";
	}
	public College(int collegeId, String collegeName, List<String> departments, Set<String> subjects,
			Map<Integer, Double> marks) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.departments = departments;
		this.subjects = subjects;
		this.marks = marks;
	}
	public College() {
		super();
	}
	
}
