package trial1.questions.concepts.StringAndStringBuilder;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // converted to ASCII value then added.
        System.out.println((char)('a' + 3)); //d
        System.out.println('a' + 3); //100

        System.out.println("a" + "b"); // ab
        System.out.println("a" + 3); // a3
        // integer is converted to Integer that will call toString()

        System.out.println("Adeeb" + new ArrayList<>()); // again return toString()

//      System.out.println(56 + new ArrayList<>()); //error
        // + used with primitives and String, for complex objects one should be string

        System.out.println(56 + " " + new ArrayList<>()); // with strings
        System.out.println("a" + 'b');
    }
}
