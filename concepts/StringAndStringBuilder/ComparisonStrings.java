package concepts.StringAndStringBuilder;

public class ComparisonStrings {
    public static void main(String[] args) {
        String a = "Adeeb";
        String b = "Adeeb";
        // stored in string pool
        // == , checks if the reference variables are pointing to same object
        System.out.println(a == b); // true : both are pointing to same object.

        a = new String("Adeeb");
        b = new String("Adeeb");

        System.out.println(a == b); // false even if value is same, 2 different objects.

        // to check values, use .equals method.
        System.out.println("-- Using .equals method");
        System.out.println(a.equals(b)); // true, if there is a single extra space - false;
    }

}
