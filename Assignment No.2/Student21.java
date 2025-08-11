public class Student21
{
int roll;
String name;
int marks;
public Student21()
{
roll=121;
name="Sudarshan";
marks=85;
System.out.println("Roll NO:"+roll+" Name:"+name+" Marks:"+marks);
}
public Student21(int r)
{
roll=r;
System.out.println("Roll NO:"+roll);
}
public Student21(int r,String n)
{
roll=r;
name=n;
System.out.println("Roll NO:"+roll+" Name:"+name);
}
public Student21(int r,String n,int m)
{
roll=r;
name=n;
marks=m;
System.out.println("Roll NO:"+roll+" Name:"+name+" Marks:"+marks);
}
public static void main(String args[])
{
Student21 a1=new Student21();
Student21 a2=new Student21(3);
Student21 a3=new Student21(3,"SAI");
Student21 a4=new Student21(6,"PARTH",75);
}
}
