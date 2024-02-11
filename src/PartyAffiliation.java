import java.util.Scanner;

public class PartyAffiliation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash;

        String party;

        System.out.print("State the party you are affiliated with [D R I]: ");
        party = in.nextLine();

        if(party.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey!");
        }
        else if(party.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant!");
        }
        else if(party.equalsIgnoreCase("I"))
        {
            System.out.println("You're an Independent Person!");
        }
        else
        {
            System.out.println("You chose a different affiliation.");
        }
    }
}
