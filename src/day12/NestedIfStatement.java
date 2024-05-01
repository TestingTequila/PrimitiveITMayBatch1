package day12;

public class NestedIfStatement
{
    public static void main(String[] args) {
        int age = 25;
        boolean hasId=true;

        if(age>=18)
        {
            System.out.println("You are eligible to enter the voting venue");
            if(hasId)
            {
                System.out.println("ID Checked, You can Vote");
            }
        }
    }
}
