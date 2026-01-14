/*
    ArrayList is similar to vectors in C++.
    It is used to create dynamic arrays i.e. there is no fixed size of the array.
 */
import java.util.ArrayList;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.set(0, 5);
        list.remove(4);
        System.out.println(list);

        for (int i=0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

