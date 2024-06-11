package concepts.formulas;

public class FiboFormula {
    public static void main(String[] args) {
        for (int i = 0; i < 51; i++) {
            System.out.println(i + " " + fiboFormula(i));
        }
    }

    public static long fiboFormula(int n) {
        return (long)((Math.pow(((1 + Math.sqrt(5)) / 2) , n) - Math.pow(((1 - Math.sqrt(5)) / 2) , n)) / Math.sqrt(5));
    }
}
