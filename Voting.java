import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Age:");
    int a=sc.nextInt();
    if(a>=18)
    {
      System.out.println("Eligible to vote in National Election");
    }
    else
    {
      System.out.println(" Not Eligible to vote in National Election");
    }
  }
  
}
