package trial1.questions.mathDsa;

public class NewtonRaphSQRT {
    public static void main(String[] args) {
        int n = 40;
        System.out.printf("%.3f %n",nrqrt(n));
    }

    private static double nrqrt(int n) {
        double root = 0.0;

        int s = 0, e = n;
        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(mid * mid == n) {
                return mid;
            } else if (mid * mid > n) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        root = root + e + 0.5;

        root = 0.5* (root + (n / root));

        return root;
    }
}
