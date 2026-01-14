import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number you want to search: ");
        int target = input.nextInt();

        int[] arr = {4, 50, 10, 25, 89, 145, 48};
        System.out.println(Arrays.toString(arr));

        int position = linearSearch(arr, target);

        if (position >= 0)
            System.out.println("Element found at position " + position);
        else
            System.out.println("Element not found");
    }

    public static int linearSearch(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
