package day11;

public class MathOperations
{
    public static void main(String[] args) {
        //1. I/I = I
        System.out.println(10/2);
        System.out.println(9/2);

        //2. Decimal is in N or D = D
        System.out.println(9.0/2);//4.5
        System.out.println(9/2.0);//4.5
        System.out.println(9.0/2.0);//4.5

        //3. I/0 = AE
        //System.out.println(9/0);

        //4. I or decimal divided by 0.0
        System.out.println(9/0.0);
        System.out.println(9.0/0.0);
        System.out.println(9.0/0);

        //Modulo Operator
        System.out.println(10%2); //0
        System.out.println(9%2); //1
        System.out.println(9/2); //4

    }
}
