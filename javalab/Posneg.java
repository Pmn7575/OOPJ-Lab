import java.util.*;
public class Posneg
{
public static void main(String args[])
{
int a;
Scanner s=new Scanner(System.in);
System.out.println("Enter first num");
a=s.nextInt();
if(a>0)
{
  System.out.println("Enter num is positive");
}
else if(a==0)
{
  System.out.println("Enter num is zero");
}
else
{
 System.out.println("Enter num is negative");
}
}
}