public class Student06
{
int roll;
String name;
int marks;
public Student11(int roll,String name,int marks)
{
this.roll=roll;
this.name=name;
this.marks=marks;
}
public void display()
{
System.out.println("Roll NO:"+roll+" Name:"+name+" Marks:"+marks);
}
public static void main(String args[])
{
Student06 a1=new Student06(6,"Parth",87);
a1.display();
}
}

