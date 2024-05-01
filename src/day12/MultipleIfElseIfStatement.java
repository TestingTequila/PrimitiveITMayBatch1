package day12;

public class MultipleIfElseIfStatement
{
    public static void main(String[] args) {
        int number =5;
        if(number>20)
        {
            System.out.println("Number is greater than 20");
        }
        else if(number>10 && number<=20)
        {
            System.out.println("Number is greater than 10 but less than 20");
        }
        else if(number>5 && number<=10)
        {
            System.out.println("Number is greater than 10 but less than 5");
        }
        else if(number<=5)
        {
            System.out.println("Number is 5 or less");
        }
        else
        {
            System.out.println("Number is not less than or equal to 5");
        }
    }
}
