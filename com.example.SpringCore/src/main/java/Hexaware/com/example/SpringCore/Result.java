package Hexaware.com.example.SpringCore;

public class Result {
	int rank;
	double total;
	Student stuobj;
	public int getRank() {
		return rank;
	}
	public double getTotal() {
		return total;
	}
	public Student getStuobj() {
		return stuobj;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public void setStuobj(Student stuobj) {
		this.stuobj = stuobj;
	}
	@Override
	public String toString() {
		return "Result [rank=" + rank + ", total=" + total + ", stuobj=" + stuobj + "]";
	}
	public Result(int rank, double total, Student stuobj) {
		super();
		this.rank = rank;
		this.total = total;
		this.stuobj = stuobj;
	}
	public Result() {
		super();
	}
	
}
