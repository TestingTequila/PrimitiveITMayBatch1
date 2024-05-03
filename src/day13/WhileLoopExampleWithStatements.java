package day13;

public class WhileLoopExampleWithStatements
{
    public static void main(String[] args) {

        // WAP to print numbers from 1-10;
        int number = 1;
        while(number<=10)
        {
            System.out.println(number);
            if(number==5)
            {
                System.out.println("Hi we have reached mid way");
            }
            number++;
        }


        System.out.println("=========================================================");

        // WAP to print numbers  from 10-1

        int x=10;
        while(x>=1)
        {
            System.out.println(x);
            x--;
        }

        System.out.println("=========================================================");

        //WAP to print table of 2

        int num =1;
        while (num<=10)// 10
        {
            System.out.println(2*num); //2, 4, 6, 8, 10....................20
            if((2*num)%5==0)
            {
                System.out.println(2*num + " is divisible by 5");
            }
            num++;

        }
    }
}


