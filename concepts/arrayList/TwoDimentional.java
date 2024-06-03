package concepts.arrayList;

import java.util.ArrayList;

public class TwoDimentional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(1);
            }
        }

        System.out.println(list);
    }
}
