package java_basics_package;


public class FirstClass {

    //Learning to print Hello World and Operators in Java

    public static void main(String[] args) {
        System.out.println("Hello World");
        int A = 10;
        int B = 20;
        System.out.println(A);
        System.out.println("A");
        //Addition Operator (+)
        int SUMA = A + 20;
        System.out.println("The value of SUMA is : " +SUMA);
        int SUMB = 40 + 50 ;
        System.out.println("The value of SUMB is : " + SUMB);

        //Subtraction Operator (-)
        int SUBTRACTIONC = B - A;
        System.out.println("The value for SUBTRACTIONC is : "+ SUBTRACTIONC);

        //Multiplication Operator (*)
        int MULTD = B * A;
        System.out.println("The value for MULTD is : "+ MULTD);

        //Division Operator (/)
        int DIVE = B / A;
        System.out.println("The value for DIVE is : "+ DIVE);

        //Modulo or Remainder Operator (%)
        int MODF = B % A;
        int MOD_WITH_REMAINDER = 20/9;
        System.out.println("The value for MODF is : "+ MODF);
        System.out.println("The value for MOD_WITH_REMAINDER is : "+ MOD_WITH_REMAINDER);
    }
}
