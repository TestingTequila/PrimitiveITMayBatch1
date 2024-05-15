package day17;

public class MathsCalculationsThis {
    // WAP to add two numbers 12,8

    int num1; // Global or class level variables
    int num2; // Global or class level variables

    public void addition(int num1, int num2) {
        this.num1=num1;
        this.num2=num2;
        int sum = num1 + num2;
        System.out.println("Addition of " + num1 + " and " + num2 + " is : " + sum);
    }

    public void subtraction()
    {
        int diff = num1 - num2;
        System.out.println("Difference of " + num1 + " and " + num2 + " is : " + diff);
    }
}


//Global variables and Parameters have same name and
// you want to assign the parameters value to global variable, we will use 'this' keyword