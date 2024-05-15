package day17;

public class MathsCalculationsParameters {
    // WAP to add two numbers 12,8

    public void addition(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Addition of " + num1 + " and " + num2 + " is : " + sum);
    }

    public void subtraction(int num1, int num2) {
        int diff = num1 - num2;
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is : " + diff);
    }

    public void multiplication(int num1, int num2)
    {
        int product = num1 * num2;
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is : " + product);
    }

    public void division(int num1, int num2)
    {
        int div = num1/ num2;
        System.out.println("Division of " + num1 + " and " + num2 + " is : " + div);
    }
}
