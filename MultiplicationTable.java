import java.util.Scanner;

public class MultiplicationTable 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Multiplication of " + n + " is:");

        for (int i = 1; i <= 10; i++) 
        {
            int product = n * i;
            System.out.println(n + " x " + i + " = " + product);
        }

        
    }
}
