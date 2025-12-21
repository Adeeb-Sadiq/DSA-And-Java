package trial1.questions.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class SmallestNextLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char[] let2 = {'e','e','e','e','e','e','n','n','n','n'};
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println(Arrays.toString(let2));
            char target = s.next().charAt(0);
            System.out.println(snl(let2, target));
        }
    }

    private static char snl(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        if(target >= letters[end]) {
            return letters[start];
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start];
    }
}
