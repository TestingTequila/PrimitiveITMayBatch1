package variables;

public class CharacterValueFamilyVariable {

    public static void main(String[] args) {

        // 2 bytes = 2*8 = 16 bits
        // range = 1 character
        char c1 = 'y';
        System.out.println(c1);//y
        char c11= 'b';
        System.out.println(c11);//b
        char c2= '1';
        System.out.println(c2);//1
        char c4='$';
        System.out.println(c4);//$

        char male= 'm';
        char female= 'f';

        char c22= 'a'; //97
        char c33 ='b'; //98
        System.out.println(c22+c33); //195

        char r1='0';
        char r2='9';
        System.out.println(r1); //48
        System.out.println(r2); //57
        System.out.println(r1+r2); //105
        System.out.println(r1*r2); //2736

        char u1='a';
        char u2='b';
        System.out.println((int)u1);
        System.out.println((int)u2);
        System.out.println((int)u1+ (int)u2); //195
        System.out.println(u1+u2);// ab, 195
        System.out.println((int)u1); //97
        System.out.println(u1); //a
        System.out.println(u1+0); //a0, 97, a
        System.out.println(u1+'0'); //97+ 48




    }
}
