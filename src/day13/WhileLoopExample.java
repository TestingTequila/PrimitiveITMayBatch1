package day13;

public class WhileLoopExample
{
    public static void main(String[] args) {

        // WAP to print numbers from 1-10;
        int number = 1;
        while(number<=10)
        {
            System.out.println(number);
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
        while (num<=10)
        {
            System.out.println(2*num);
            num++;

        }


        String  name ="Tarik Farid";
        while (name=="Tarik Farid")
        {
            System.out.println("Keep Scrolling");
            {
                if(name=="Tarik Farid")
                {
                    System.out.println("Click on the name");
                }
            }
            //Keep Scrollong

        }
    }
}


