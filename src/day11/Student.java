package day11;

public class Student{
    private int rno;
    private String sname;
    private int age;
    
    Marks marks;
    public Student() {}
	public Student(int rno, String sname, int age, Marks marks) {
		super();
		this.rno = rno;
		this.sname = sname;
		this.age = age;
		this.marks = marks;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Marks getMarks() {
		return marks;
	}

	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", age=" + age + ", marks=" + marks + "]";
	}

	
    
    
    
}
