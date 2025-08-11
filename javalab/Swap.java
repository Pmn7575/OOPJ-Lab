import java.util.*;
public class Swap
{
  public static void main(String args[])
{
  int m,n,temp;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the first number");
  m=s.nextInt();
  System.out.println("Enter the second number");
  n=s.nextInt();
  temp=m;
  m=n;
  n=temp;
  System.out.println("After Swapping");
  System.out.println("First number:"+m);
  System.out.println("Second Number:"+n);
}
}
  
  