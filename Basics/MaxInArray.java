import java.util.*;

public class MaxInArray {
    public static void main(String[] args) {
        int[] list = {10, 99, 452, 12, 649};
        int max = maximum(list);
        System.out.println(max);
    }

    public static int maximum(int[] list) {
        int largest = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > largest)
                largest = list[i];
        }
        return largest;
    }
}

