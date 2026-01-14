import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, -20, -50, 60, 0, 5, 100, 30, 24, 47};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n; i++) {
            swapped=false;
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped=true;
                }
            }
//            If the array is already swapped and no swaps occur then we will break from the loop.
            if(!swapped) break;
        }
    }
}
