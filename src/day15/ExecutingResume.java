package day15;

public class ExecutingResume {
    public static void main(String[] args) {
        Resume jasonsResume = new Resume();
        jasonsResume= null;
        jasonsResume.firstName = "Jason";
        jasonsResume.lastName = "Roger";
        jasonsResume.age = 29;
        jasonsResume.gender = 'M';

        Resume kerrieResume = new Resume();
        kerrieResume.firstName = "Kerrie";
        kerrieResume.lastName = "Wright";
        kerrieResume.age = 24;
        kerrieResume.gender = 'F';

        Resume leesResume = new Resume();
        leesResume.firstName = "Lee";
        leesResume.lastName = "Hill";
        leesResume.gender = 'M';
        leesResume.age = 45;

        new Resume();

        Employee e1 = new Employee();
        e1.firstName = "Raheem";
        e1.designation = "QA";
        e1.salary = 8000;
        e1.city = "NY";

        Employee e2 = new Employee();
        e2.firstName = "Rohit";
        e2.designation = "Director";
        e2.salary = 100000;
        e2.city = "NJ";

        new Employee().firstName = "Ashish";
        new Employee().designation = "CEO";
        new Employee().salary = 100000;
        new Employee().city = "NY";

        System.gc();


    }
}
