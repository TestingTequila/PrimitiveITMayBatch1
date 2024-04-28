package day11;

public class StringConcatenationExamples {
    public static void main(String[] args) {
        String x = "Hello";
        String y = "World";
        int a = 100;
        int b = 200;

        System.out.println(x); //Hello
        System.out.println(y); // world
        System.out.println(x + y); // Hello World
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + b); //300

        System.out.println(x + a); //Hello100
        System.out.println(a + b + x);//300Hello
        System.out.println(a + b + x + y); //300HelloWorld
        System.out.println(a + x + b + y); //100Hello200World
        System.out.println(x + y + a + b); //HelloWorld100200
        System.out.println(a + a + b + x + y + b);//400HelloWorld200


        double d1 = 12.33;
        double d2 = 23.44;

        System.out.println(d1 + d2); //35.77
        System.out.println(d1 + a); //112.33

        System.out.println(d1 + a + x);// 12.33+100+World

        System.out.println(x + y + d1 + d2);//HelloWorld12.3323.44

        System.out.println(x + y + (d1 + d2)); //HelloWorld35.77

        System.out.println(x + y + (a + b)); //HelloWorld300

        char c1 ='a';
        char c2 ='b';

        System.out.println(c1+""+c2); //ab
        System.out.println(x+(a+b)+y+(d1+d2)+a+b); //Hello300World35.77100200

    }
}
