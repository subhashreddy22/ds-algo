package ds.search;

import java.util.Scanner;

/**
 * Complexity: O(n). Array is not required to be sorted
 *
 */
public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search");
        int x = sc.nextInt();

        int i = search(arr, x);

        if (i == -1) {
            System.out.println("Element entered is not found");
        } else {
            System.out.println("Element found at index " + i);
        }
    }

    static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                return i;
            }
        }

        return -1;
    }
}
