import java.util.Scanner;

public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash;

        double itemPrice;
        double shippingCost = 0;
        double totalPrice = 0;
        final double INTEREST_RATE = 0.02;
        final double FREE_SHIP = 100.00;

        System.out.print("Enter the cost of your item: ");

        if (in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine();

            if(itemPrice > FREE_SHIP)
            {
                System.out.println("Shipping is free. The total cost is " + totalPrice);
            }
            else
            {
                shippingCost = itemPrice * INTEREST_RATE;
                totalPrice = itemPrice + shippingCost;
                System.out.println("The cost of shipping is " + shippingCost + " and the total cost is " + totalPrice);
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must enter a valid cost, not " + trash);
            System.out.println("Run the program again!");
        }
    }
}