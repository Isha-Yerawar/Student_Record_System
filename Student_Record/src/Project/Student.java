package Project;
public class Student
{

	int rollno;
	String name;
	float marks;
	public Student(int rollno, String name, float marks) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public void display()
	{
		System.out.println("Rollno:"+rollno+"\nName:\t"+name+"\nMarks:"+marks);
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public float getMarks()
	{
		return marks;
	}
	public void setMarks(float marks) 
	{
		this.marks = marks;
	}
}