import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 9, 14, 35, 42, 58, 62, 100};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int target = input.nextInt();
        int position = binarySearch(arr, target);
        if (position >= 0)
            System.out.println("Element " + target + " found at position " + position);
        else
            System.out.println("Element not found!");
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            /*
                int mid = (start + end) / 2;
                The above expression to find "mid" might generate errors in some cases
                as it can exceed the range of "int" data-type in Java.
                Therefore, it must be avoided in this code.
             */
            int mid = start + (end-start)/2;
            if (target == arr[mid])
                return mid;
            else if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
