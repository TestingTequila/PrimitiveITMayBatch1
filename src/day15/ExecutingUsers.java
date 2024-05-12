package day15;

public class ExecutingUsers {
    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "Ravi";
        u1.age = 45;
        u1.city = "LA";

        User u2 = new User();
        u2.name = "Kareem";
        u2.age = 35;
        u2.city = "Texas";

        User u3 = new User();
        u3.name = "Jason";
        u3.age = 22;
        u3.city = "Japan";

        System.out.println(u1.name + ", " + u1.age + ", " + u1.city); //Ravi, 45, LA
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city); //Kareem, 35, Texas
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city); //Jason, 22, Japan

        System.out.println("*************************u1=u2******************************");
        u1=u2; // u1 will break its original connect and will start pointing where u2 is pointing

        System.out.println(u1.name + ", " + u1.age + ", " + u1.city); //K
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city); //K
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city); //J

        u2=u3;

        System.out.println("*************************u2=u3*****************************");
        System.out.println(u1.name + ", " + u1.age + ", " + u1.city); //K
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city); //J
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city); //J

        u3=u1;

        System.out.println("*************************u3=u1*****************************");
        System.out.println(u1.name + ", " + u1.age + ", " + u1.city); //K
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city); //J
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city); //J


    }
}
