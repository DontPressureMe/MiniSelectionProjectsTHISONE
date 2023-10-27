import java.util.Scanner;


public class IP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter the first octet: ");
        int octet1 = scanner.nextInt();


        System.out.print("Please enter the second octet: ");
        int octet2 = scanner.nextInt();


        System.out.print("Please enter the third octet: ");
        int octet3 = scanner.nextInt();


        System.out.print("Please enter the fourth octet: ");
        int octet4 = scanner.nextInt();


        if (octet1 >= 0 && octet1 <= 255 && octet2 >= 0 && octet2 <= 255 &&
                octet3 >= 0 && octet3 <= 255 && octet4 >= 0 && octet4 <= 255) {
            System.out.println("IP Address: " + octet1 + "." + octet2 + "." + octet3 + "." + octet4);
        } else {
            System.out.println("Invalid IP Address");
        }
    }
}


