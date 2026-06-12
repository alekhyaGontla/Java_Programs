class Employee
{
	int eid;
	double ctc;
	void work()
	{
		System.out.println("Working...");
	}
	void meeting()
	{
		System.out.println("Meeting....");
	}
}
public class EmployeeMain
{
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.eid=101;
		e1.ctc=3.5;
		e1.work();
		e1.meeting
		
		Employee e2=new Employee();
		e2.eid=121;
		e2.ctc=6.5;
		e2.work();
		e2.meeting();
		
		Employee e3=new Employee();
		e3.eid=102;
		e3.ctc=6.5;
		e3.work();
		e3.meeting();
	}
}