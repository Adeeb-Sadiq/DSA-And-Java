package trial1.questions.concepts.StringAndStringBuilder;

public class PerformanceString {
    public static void main(String[] args) {
        // issue with this
        String series = "";
        for (int i = 0; i < 26; i++) {
            series = series + (char)('a' + i) + " ";
        } //O(N^2)
        System.out.println(series);
        // strings are immutable
        // its creating a new object in each iteration and copying the old value to new

    }
}
