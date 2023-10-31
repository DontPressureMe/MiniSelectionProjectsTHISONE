import java.util.Scanner;
import java.util.Random;

public class RPC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter 0 for Rock, 1 for Paper, or 2 for Scissors:");
        int userChoice = scanner.nextInt();
        int computerChoice = random.nextInt(3);

        String usertext = null;
        if (userChoice == 0)
        {usertext = "Rock";}
        else if (userChoice == 1)
        {usertext = "Paper";}
        else if (userChoice == 2)
        {usertext = "Scissors";}


        String computerText = null;
        if (computerChoice == 0)
        {computerText = "Rock";}
        else if (computerChoice == 1)
        {computerText = "Paper";}
        else if (computerChoice == 2)
        {computerText = "Scissors";}


        System.out.println("You chose " + usertext + ", and the computer chose " + computerText + ".");
        if (userChoice == computerChoice) {
            System.out.println("It's a draw!");
        } else if ((userChoice == 0 && computerChoice == 2) || (userChoice == 1 && computerChoice == 0) || (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}

