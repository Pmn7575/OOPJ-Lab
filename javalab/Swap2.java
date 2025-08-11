import java.util.*;
public class Swap2
{
public static void main(String args[])
{
int a,b;
Scanner s=new Scanner(System.in);
System.out.println("Enter first num");
a=s.nextInt();
System.out.println("Enter second num");
b=s.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping");
System.out.println("First num is:"+a);
System.out.println("Second nm is:"+b);
}
}


