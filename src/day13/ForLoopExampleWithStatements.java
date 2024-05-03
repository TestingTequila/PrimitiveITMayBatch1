package day13;

public class ForLoopExampleWithStatements
{
    public static void main(String[] args) {

        // WAP to print numbers from 1-10;

        for(int number = 1;number<=10;number++)
        {
            System.out.println(number);
            if(number==5)
            {
                System.out.println("Hi we have reached mid way");
            }

        }


        System.out.println("=========================================================");

        // WAP to print numbers  from 10-1


        for(int x=10;x>=1;x--)
        {
            System.out.println(x);

        }

        System.out.println("=========================================================");

        //WAP to print table of 2


        for (int num =1;num<=10;num++)// 10
        {
            System.out.println(2*num); //2, 4, 6, 8, 10....................20
            if((2*num)%5==0)
            {
                System.out.println(2*num + " is divisible by 5");
            }


        }
    }
}


