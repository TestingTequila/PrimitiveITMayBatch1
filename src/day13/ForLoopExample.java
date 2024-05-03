package day13;

public class ForLoopExample
{
    public static void main(String[] args) {

        // WAP to print numbers from 1-10;
        System.out.println("==============1-10 using FOR LOOP========================");
        for(int number = 1;number<=10;number++)
        {
            System.out.println(number);
        }


        System.out.println("==============10-1 using FOR LOOP========================");

        // WAP to print numbers  from 10-1


        for(int x=10;x>=1;x--)
        {
            System.out.println(x);

        }

        System.out.println("=====================Table of 2 using FOR LOOP====================================");

        //WAP to print table of 2


        for (int num =1;num<=10;num++)
        {
            System.out.println(2*num);
        }
    }
}


