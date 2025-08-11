import java.util.*;
public class Prime 
{
public static void main(String args[])
{
int a;
int found=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter first num");
a=s.nextInt();
for(int i=2;i<a;i++)
{
if(a%i==0)
{
 found = 1;
System.out.println("Enter num is not prime");
break;
}
}
if(found==0)
{
System.out.println("Enter num is prime");
}
}
}




