package trial1.questions.concepts.arrayList;

import java.util.ArrayList;

public class OneDimentional { // add remove set get
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("empty array list");
        System.out.println(list);

        //add
        System.out.println("adding values to list");
        list.add(5);
        list.add(22);
        list.add(4);

        System.out.println(list);

        //remove
        System.out.println("removing index 2");
        list.remove(2);
        System.out.println(list);

        //set
        System.out.println("changing index 0 to value 1");
        list.set(0,1);
        System.out.println(list);

        //get
        System.out.println("getting the index 1 value");
        System.out.println(list.get(1));
    }
}
