package Task2;

import java.util.Scanner;

//Create the Task2 class within the Java1 package and convert Celsius to Fahrenheit.
// The user enters through the scanner the temperature for Celsius as an integer value
// and the program prints both in the format "31C = 87.8F", rounded Fahrenheit to one decimal place.
public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature in celsius: ");
        int tempC = input.nextInt();
        double tempF = tempC * 1.8 + 32;

        System.out.println("The temperature of " + tempC + "C = "  +  tempF+ " F");

        input.close();

    }
}
