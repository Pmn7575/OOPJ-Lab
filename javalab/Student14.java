public Student14
{
int roll_no;
String name;
public Student14()
{
roll_no=6;
name="Parth";
System.out.println("Student Information");
System.out.println("Student Roll No:"+roll_no);
System.out.println("Student Name:+name);
}
public Student14(int rno,String n)
{
System.out.println("Student Information");
System.out.println("Student Roll No:"+roll_no);
System.out.println("Student Name:+name");
}
public static void main(String args[])
{
Student14 s=new Student14();
Student14 s1=new Student14(6,"Parthn");
}
}