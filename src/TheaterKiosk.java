import java.util.Scanner;

public class TheaterKiosk
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash;

        int age;

        System.out.print("Enter your age: ");
        age = in.nextInt();

        if(age >= 21)
        {
            System.out.println("You get a paper wristband!");
        }
        else
        {
            System.out.println("You are too young. Come back later.");
        }
    }
}
