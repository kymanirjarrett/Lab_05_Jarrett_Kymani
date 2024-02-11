import java.util.Scanner;

public class BirthMonth
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash;

        int birthMonth;

        System.out.print("Enter the month you were born in: [1 2 3 4 5 6 7 8 9 10 11 12]: ");

        if (in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();


            if(birthMonth >= 0 && birthMonth <= 12)
            {
                System.out.println("You said your birth month is " + birthMonth);

                switch (birthMonth)
                {
                    case 1:
                        System.out.println("January");
                        break;
                    case 2:
                        System.out.println("February");
                        break;
                }

            }
            else
            {
                System.out.println("That is not a valid month.");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must enter a valid month not " + trash);
        }
    }
}
