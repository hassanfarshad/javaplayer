import java.util.Scanner;
import java.util.ArrayList;
class ep2
{
  public static void main(String args[])
  {
  Scanner d=new Scanner(System.in);
  int a=d.nextInt();
  int f=1;
  while(a>0)
  {
  	f=a*f;
  	a--;
  }
  System.out.println(f);
  }
 }
