package variables;

public class IntegerFamilyVariable {

    public static void main(String[] args) {
        // 1 byte = 8 bits
        // range = -128 to 127
        byte b =12;
        byte b2=-128;


        //2 byte = 2*8 =16 bits
        //range = -32768 to 32767

        short s= 128;
        short s1 =12;
        short s2= -32768;
        short s3= 32767;

        // 4 byte = 4*8 =32 bits
        // range = -21474883648 to 2147483647
        int i =32768;
        int i1= 214748364;

        // 8 byte = 8*8 =64 bits
        // range = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long l = 2147483648l;

        short b1= 32767;
        byte b3=20;

        long sum =b1+b3;
    }
}
