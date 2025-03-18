package trial1.questions.concepts.StringAndStringBuilder;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // mutable

        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            sb.append(ch);
        } // O(N)

        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb.reverse());
    }
}
