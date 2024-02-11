import java.util.Scanner;

public class NumCompare
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash;
        boolean done = false;

        int num1;
        int num2;

        do
        {
            System.out.print("Enter the first number: ");
            num1 = in.nextInt();

            System.out.print("Enter the second number: ");
            num2 = in.nextInt();

            if(num1 == num2)
            {
                System.out.println("Both numbers are equal!");
                done = true;
            }
            else if(num1 > num2)
            {
                System.out.println("The first value is greater!");
                done = true;
            }
            else
            {
                System.out.println("The second value is greater!");
                done = true;
            }
        } while (!done);
    }
}
