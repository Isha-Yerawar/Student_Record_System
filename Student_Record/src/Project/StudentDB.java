
package Project;
public class StudentDB {
	
	private Student s [];
	private int n;

	public StudentDB() {
		super();
		// TODO Auto-generated constructor stub
		s=new Student[20];
		n=0;
	}
	// add a student 
	//sdb.add(s);
	public void add(Student p)
	{
		s[n]=p;
		n++;
	}
	// get a student at specified position
	public Student getStudent(int i)
	{
		return s[i];
	}
	// get Count of students;
	public int getCount()
	{
		return n;
	}

}