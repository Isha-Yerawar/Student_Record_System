package Project;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentConsole {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
	StudentDB sdb;
	public StudentConsole()
	{
		sdb=new StudentDB(); 
	}
	int menu() throws NumberFormatException, IOException 
    {   int choice=0;
            System.out.println("1--->Add Student");
            System.out.println("2--->Show all Students");
            System.out.println("3--->Search a Student");
            System.out.println("4--->Exit");
            System.out.println("Enter your choice");
            
           
            choice=Integer.parseInt( br.readLine());
        
            return choice;
    }
    public void start() throws NumberFormatException, IOException    
{
    	
    while (true) {
        int rollno,i;
        String name,target;
        float marks;
        Student s;
        int choice=menu();
        switch (choice) {
            case 1: // add Student
            				System.out.println("Enter data of student (r,n,m)");	// 10 abcd 78.5
            				rollno=Integer.parseInt(br.readLine());
            				name=br.readLine();
            				marks=Float.parseFloat(br.readLine());
            				s=new Student(rollno, name, marks);
            				sdb.add(s);                
            				break;
                case 2:// Show all 
                			if(sdb.getCount()==0)
                			{
                				System.out.println("No student added");
                				break;
                			}
                         	System.out.println("Data of all students is");
                         	for ( i = 0; i < sdb.getCount(); i++) {
								s=sdb.getStudent(i);
								s.display();
							}
                break;
                    case 3: System.out.println("Enter name to be searched");
                    			target=br.readLine();
                    			boolean flag=false;
                    			for(i=0; i<sdb.getCount();i++)
                    			{
                    				s=sdb.getStudent(i);
                    				name=s.getName();
                    				if(name.equals(target))
                    				{
                    					flag=true;
                    					System.out.println("Found...Data is ");                    					
                    					s.display();
                    				}
                    			}//for
                    			if(flag==false)
                    			{
                    				System.out.println("Not Found...");           
                    			}
                break;
               case 4:System.exit(0);                
                break;
            default: System.out.println("You entered wrong choice");
                }
    }
   
    
}//start
}