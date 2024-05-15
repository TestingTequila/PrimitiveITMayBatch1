package day17;

public class ThisKeywordConcept
{
    String fName;
    String lName;
    public  void printFullName(String fName, String lName)
    {
        this.fName=fName;
        this.lName=lName;
        String completeName=fName + " " + lName;
        System.out.println(completeName);
    }

    public void generateMySSN()
    {
        String ssn= fName +lName +"2423423";
        System.out.println("My SSN is: " + ssn);
    }
}
