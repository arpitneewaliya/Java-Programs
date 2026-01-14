import java.util.Arrays;

public class SwapInArray {
    public static void main(String[] args) {
        int[] list = {10, 39, 42, 12, 64};
        System.out.println(Arrays.toString(list));
        swap(list, 1, 3);
        System.out.println(Arrays.toString(list));
    }

    static void swap(int[] arr, int first_index, int second_index) {
        int temp = arr[first_index];
        arr[first_index] = arr[second_index];
        arr[second_index] = temp;
    }
}

