import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] list = {10, 39, 42, 12, 64, 20};
        System.out.println(Arrays.toString(list));
        reverse(list);
        System.out.println(Arrays.toString(list));
    }

    public static void reverse(int[] list) {
        int start = 0;
        int end = list.length - 1;
        while(start < end) {
            int temp = list[start];
            list[start] = list[end];
            list[end] = temp;
            start++;
            end--;
        }
    }
}

