/*
 * Student Name: Kyler Krajcsovics
 * Course: CMP 129
 * Week: 3
 * Lab: 2
 * Assignment: Calculator Method Overloading
 * Date: 9/29/26
 */
public class CalculatorTest {
    public static void main(String args[])
    {
        //creates calculator object:
        Calculator calc = new Calculator();
        //calls and prints add two integers method
        System.out.println("Sum of two integers: " + calc.add(13, 14));
        //calls, print, and formats add two doubles method
        System.out.printf("Sum of two doubles: %.2f%n", calc.add(5.7, 8.2));
        //calls and prints add three integers method
        System.out.println("Sum of three integers: " + calc.add(20, 15, 5));
        //calls and prints concatenate two strings method
        System.out.println("Concatenated strings: " + calc.add("What's", "up?"));
    }//ends main
}//ends class
