package trial1.questions.mathDsa;

public class SQRT {
    public static void main(String[] args) {
        int n = 40;
        int precision = 3;
        System.out.println(sroot(n, precision));
    }

    private static double sroot(int n, int p) {
        double root = 0.0;

        int s = 0;
        int e = n;

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

        root += e;

        double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += inc;
            }
            root -= inc;
            inc /= 10;
        }

        return root;
    }

}
