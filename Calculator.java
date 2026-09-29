/*
 * Student Name: Kyler Krajcsovics
 * Course: CMP 129
 * Week: 3
 * Lab: 2
 * Assignment: Calculator Method Overloading
 * Date: 9/29/26
 */
public class Calculator {

    public int add(int a, int b)//accepts two integers
    //only runs if two integers are given
    {
        int iSum2 = a + b;//adds the integers
        return iSum2;//returns the sum
    }//ends int method

    public double add(double a, double b)//accepts two doubles
    //only runs if two doubles are given
    {
        double dSum = a + b;//adds the doubles
        return dSum;//returns the sum
    }//ends double method

    public int add(int a, int b, int c)//accepts three integers when method is called
    //only runs if three integers are given
    {
        int iSum3 = a + b + c;//adds the integers
        return iSum3;//returns the sum
    }//ends triple int method

    public String add(String a, String b)//accepts two strings when method is called
    //only runs if two strings are given
    {
        String sSum = a + " " + b;//concatenates the strings
        return sSum;//returns the concatenated strings
    }//ends string method
}//ends class