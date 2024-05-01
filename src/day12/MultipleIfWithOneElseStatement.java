package day12;

public class MultipleIfWithOneElseStatement
{
    public static void main(String[] args) {
        int score = 45;
        if (score >= 90)
        {
            System.out.println("Excellent! You got an A.");
        }
        if (score < 90 && score >= 80)
        {
            System.out.println("Very Good! You got a B.");
        }
        if (score < 80 && score >= 70)
        {
            System.out.println("Good! You got a C.");
        }
        if(score<70 && score>=60)
        {
            System.out.println("Fair! You got a D.");
        }
        if(score<60 && score>=50)
        {
            System.out.println("Work Hard! You got an E.");
        }
        else
        {
            System.out.println("Sorry...you got a F");
        }
    }
}
