/* What is Type Casting in Java?
    Type casting in Java is the process of converting a variable from one data type to another.
    There are two main types:

    1. Widening (Automatic) Type Casting
    Converts a smaller type to a larger type.
    Done automatically by Java.
    No data loss.

    2. Narrowing (Manual) Type Casting
    Converts a larger type to a smaller type.
    You must do it manually using a cast operator.
    Might result in data loss.


*/

public class Implicit {
    public static void main(String[] args) {
        // 1. Widening (Automatic) Type Casting
        int num = 10;
        double d = num; // int to double (automatic)
        System.out.println(d); // Output: 10.0

        // byte → short → int → long → float → double

        // 2. Narrowing (Manual) Type Casting
        // syntax - smallType variableName = (smallType) largeValue;

        double dou = 10.5;
        int num1 = (int) dou; // Manual casting
        System.out.println(num1); // Output: 10 (decimal lost)

        int a = 10;
        double result = (double) a / 4;
        System.out.println(result);

    }
}
