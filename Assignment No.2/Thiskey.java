class Thiskey
{
   int mob;
   String Name;
   int roll_no;
public Thiskey(int mob,String Name,int roll_no)
{
this.mob = mob;
this.Name = Name;
this.roll_no = roll_no;
}
publc void display()
{
 System.out.println(" Mobile no : " +mob);
System.out.println("Name : "+Name)
System.out.println(" Roll no "+roll_no);
}
public static void main(String args[])
{
Thiskey tk = new Thiskey( 8788130738,"Parth Nandre",06)
tk.display();
}

}
