import java.util.Scanner;


class LetterGrade {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);




        System.out.print("Enter in your grade as an integer: ");
        int grade = scanner.nextInt();


        System.out.println("Your letter grade is: " + grade);


        if (98 <= grade && grade <= 100) {
            System.out.println("A+");
        } else if (93 <= grade && grade <= 97) {
            System.out.println("A");
        } else if (90 <= grade && grade <= 92) {
            System.out.println("A-");
        } else if (88 <= grade && grade <= 89) {
            System.out.println("B+");
        } else if (83 <= grade && grade <= 87) {
            System.out.println("B");
        } else if (80 <= grade && grade <= 82) {
            System.out.println("B-");
        } else if (78 <= grade && grade <= 79) {
            System.out.println("C+");
        } else if (73 <= grade && grade <= 77) {
            System.out.println("C");
        } else if (70 <= grade && grade <= 72) {
            System.out.println("C-");
        } else if (68 <= grade && grade <= 69) {
            System.out.println("D+");
        } else if (63 <= grade && grade <= 67) {
            System.out.println("D");
        } else if (60 <= grade && grade <= 62) {
            System.out.println("D-");
        } else if (0 <= grade && grade <= 59) {
            System.out.println("F");
        } else {
            System.out.println("Invalid Input");
        }


    }
}
