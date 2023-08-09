package Task1;

import java.util.Scanner;

//Create a package and class Task1 and create a main method in it (public static void main...)
// via the scanner enter your first and last name (separately) and year of birth,
// print first and last name and how old you are.
public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.println("Enter your birth year: ");
        int birthYear = input.nextInt();
        System.out.println("Enter current year: ");
        int currentYear = input.nextInt();
        int currentAge = currentYear - birthYear;

        System.out.println("Your name is " + firstName +" "+ lastName + " and you are " + currentAge + " " + " years old.");

        input.close();


    }

}
