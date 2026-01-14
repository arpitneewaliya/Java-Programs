import java.util.*;

public class ArraysInJava {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
//      For each loop can be used here
        for (int num : arr) {
            System.out.println(num);
        }

        String[] actors = {"Al Pacino", "Robert De Niro", "Tom Cruise", "Kit Harrington"};
        System.out.println(Arrays.toString(actors));
    }
}

