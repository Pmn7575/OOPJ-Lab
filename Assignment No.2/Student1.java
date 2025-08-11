import java.util.*;
public class Student1
{
	int rollno;
	String name;
	public Student1()//
	{
		System.out.println("1st info");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rollno:");
		rollno=sc.nextInt();
		System.out.print("Enter the name:");
		name=sc.next();
		System.out.println("name:"+name);
		System.out.println("Roll no:"+rollno);
		System.out.println("name:"+name);
	}
	public Student1(int rollno,String name)
	{
		System.out.println("2nd info");
		this.rollno=rollno;
		this.name=name;
		System.out.println("Roll no:"+rollno);
		System.out.println("name:"+name);

	}
	public static void main(String args[])
	{
		Student1 s=new Student1();
		Scanner st=new Scanner(System.in);
		System.out.print("Enter the rollno:");
		int rollno=st.nextInt();
		System.out.print("Enter the name:");
		String name=st.next();
		Student1 s1=new Student1(rollno,name);
	}
}