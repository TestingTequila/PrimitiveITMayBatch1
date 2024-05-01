package day12;

public class SwitchRealTimeExample
{
    public static void main(String[] args) {
        String tabValue = "XYZ";
        switch (tabValue)
        {
            case "Home":
                System.out.println("Click on Home Tab");
                break;
            case "GIFT CERTIFICATES":
                System.out.println("Click On Gift Certificates Tab");
                break;
            case "BRANDS":
                System.out.println("Click On BrandsTab");
                break;
            case "BLOGS":
                System.out.println("Click On Blogs");
                break;
            case "Contact Us":
                System.out.println("Click On Contact Us");
                break;
            default:
                System.out.println("No such Tab Exists");
                break;
            case "Product":
                System.out.println("Click On Product Tab");
                break;
        }
    }
}
