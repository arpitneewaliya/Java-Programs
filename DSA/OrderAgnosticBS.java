/*
 Order Agnostic Binary Search is used when we don't know whether
 the array is ascending or descending order.
*/

import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr_asc = {2, 9, 14, 35, 42, 58, 62, 100};
        int[] arr_dsc = {100, 80, 76, 32, 0, -19};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int target = input.nextInt();
        int position = orderAgnosticBS(arr_dsc, target);
        if (position >= 0)
            System.out.println("Element " + target + " found at position " + position);
        else
            System.out.println("Element not found!");
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target == arr[mid])
                    return mid;
                else if (target > arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target == arr[mid])
                    return mid;
                else if (target < arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
