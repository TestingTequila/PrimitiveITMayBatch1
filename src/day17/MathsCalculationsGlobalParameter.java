
package day17;

public class MathsCalculationsGlobalParameter {
    // WAP to add two numbers 12,8

    int num1; // Global or class level variables
    int num2; // Global or class level variables

    public void addition(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Addition of " + num1 + " and " + num2 + " is : " + sum);
    }

    public void subtraction() {
        int diff = num1 - num2;
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is : " + diff);
    }

    public void multiplication()
    {
        int product = num1 * num2;
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is : " + product);
    }

    public void division()
    {
        int div = num1/ num2;
        System.out.println("Division of " + num1 + " and " + num2 + " is : " + div);
    }
}
