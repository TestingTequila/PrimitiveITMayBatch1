package day12;

public class SwitchExample2
{
    public static void main(String[] args) {

        String browser = "XYZ";
        switch (browser)
        {
            case "Edge":
                System.out.println("Launch Edge Browser");
                break;
            case "Chrome":
                System.out.println("Launch Chrome browser");
                break;
            case "IE":
                System.out.println("Launch IE Browser");
                break;
            case "Safari":
                System.out.println("Launch Safari browser");
                break;
            case "Firefox":
                System.out.println("Launch Firefox browser");
                break;
            default:
                System.out.println("Please enter a valid browser name: " + browser + " is invalid browser Type");
        }
    }

    // Write the same program using if-else if statement

}
