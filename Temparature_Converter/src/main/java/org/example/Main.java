package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        boolean quit = true;
        Scanner input = new Scanner(System.in);
        while (quit){
            try {
                System.out.print("Enter F to convert celsius to fahrenheit or C to convert fahrenheit to celsius: ");
                String letter1 = input.nextLine().trim();

                if (letter1.equalsIgnoreCase("f")) {
                    System.out.print("Enter temperature in Celsius: ");
                    if (input.hasNextInt()) {
                        int input1 = input.nextInt();
                        System.out.println(input1 + "°C is " + celsiusToFahrenheit(input1) + "°F");
                    } else {
                        System.out.println("Invalid input! Please enter a valid number");
                        input.nextLine();
                    }

                } else if (letter1.equalsIgnoreCase("c")) {
                    System.out.println("Enter temperature in Fahrenheit: ");
                    if (input.hasNextInt()) {
                        int input2 = input.nextInt();
                        System.out.println(input2 + "°F is " + fahrenheitToCelsius(input2) + "°C");
                    } else {
                        System.out.println("Invalid input! Please enter a valid number. ");
                        input.nextLine();
                    }

                } else if (letter1.equalsIgnoreCase("q")) {
                    System.out.println("Goodbye! ");
                    quit = false;
                } else {
                    System.out.println("Invalid choice! Please enter F, C or Q");
                }

            }catch (Exception e){
                System.out.println("An unexpected error occurred: "+e.getMessage());
                input.nextLine();
            }

        }
        input.close();



    }

    public static Integer celsiusToFahrenheit(int number){
        int fahrenheit =  (int) (number * (9.0/5) + 32);
        return fahrenheit;
    }
    public static Integer fahrenheitToCelsius(int number){
        int celsius = (number - 32) * 5/9;
        
        return celsius;
    }
}