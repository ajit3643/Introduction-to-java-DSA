public class Operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println();

        // 2. Relational (Comparison) Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println();

        // 3. Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        System.out.println();

        // 4. Assignment Operators
        int c = 5;
        System.out.println("Assignment Operators:");
        c += 3; // c = c + 3
        System.out.println("c += 3: " + c);
        c -= 2; // c = c - 2
        System.out.println("c -= 2: " + c);
        c *= 4; // c = c * 4
        System.out.println("c *= 4: " + c);
        c /= 2; // c = c / 2
        System.out.println("c /= 2: " + c);
        c %= 3; // c = c % 3
        System.out.println("c %= 3: " + c);
        System.out.println();

        // 5. Unary Operators
        int d = 7;
        System.out.println("Unary Operators:");
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d)); // Pre-increment
        System.out.println("d++ = " + (d++)); // Post-increment
        System.out.println("d = " + d);
        System.out.println("--d = " + (--d)); // Pre-decrement
        System.out.println("d-- = " + (d--)); // Post-decrement
        System.out.println("d = " + d);
        System.out.println();

        // 6. Bitwise Operators
        int e = 5, f = 3;
        System.out.println("Bitwise Operators:");
        System.out.println("e & f = " + (e & f)); // AND
        System.out.println("e | f = " + (e | f)); // OR
        System.out.println("e ^ f = " + (e ^ f)); // XOR
        System.out.println("~e = " + (~e)); // NOT
        System.out.println("e << 1 = " + (e << 1)); // Left shift
        System.out.println("e >> 1 = " + (e >> 1)); // Right shift
        System.out.println();

        // 7. Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Ternary Operator:");
        System.out.println("Max of a and b: " + max);

        // Question

        int s = 50;
        s += 5 + (s) + (s);
        System.out.println(s++);

        int k = 7;
        int l = 3;
        int result1 = k << l;
        int result2 = k >> l;
        int result3 = k >>> l;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
