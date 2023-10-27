import java.util.Scanner;


public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);




        int lottoNumber = 10 + (int)(Math.random() * 90);


        System.out.print("Enter a two-digit number: ");
        int userNumber = input.nextInt();




        if (userNumber == lottoNumber) {
            System.out.println("You win $10,000!");
        }


        else if (userNumber % 10 == lottoNumber / 10 && userNumber / 10 == lottoNumber % 10) {
            System.out.println("You win $2,000!");
        }


        else if (userNumber % 10 == lottoNumber % 10 || userNumber / 10 == lottoNumber / 10 || userNumber % 10 == lottoNumber / 10 || userNumber / 10 == lottoNumber % 10) {
            System.out.println("You win $500!");
        }


        else {
            System.out.println("You did not win anything :(");
        }


        System.out.println("The lotto number is: " + lottoNumber);
    }
}


