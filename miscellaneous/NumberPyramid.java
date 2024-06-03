package miscellaneous;

public class NumberPyramid {
    public static void main(String[] args) {
        nopy(5);

    }

    public static void nopy(int a){
        int b = a * 2 - 1;
        int amid = b/2;
        int m = b/2;
        int n = m;
        for (int i = 0; i < a; i++) {
            int iv = 1;
            int ev = a;
            for (int j = 0; j < b; j++) {
                if(j >= m && j <= amid) {
                    System.out.print(iv + " ");
                    iv++;
                    ev = iv - 2;
                }
                else if(j > amid && j <= n) {
                    System.out.print(ev + " ");
                    ev--;
                } else {
                    System.out.print("  ");
                }
            }

            m--;
            n++;
            System.out.println();
        }
    }

}
