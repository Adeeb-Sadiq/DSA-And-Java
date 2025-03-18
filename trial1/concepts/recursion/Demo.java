package trial1.questions.concepts.recursion;

public class Demo {
    public static void main(String[] args) {
        printNo(1);
    }

    static void printNo(int n) {
        System.out.print(n + " ");
        if(n < 5) {
            printNo(n+1);
        }
        System.out.printf("%n One job is done for %d", n);

    }
}
