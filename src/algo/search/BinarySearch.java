package algo.search;

import java.util.Scanner;

/**
 * Complexity: O(log(n)). Array needs to be sorted before performing binary search.
 *
 */
public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search");
        int x = sc.nextInt();

//        int i = binarySearchRecursive(arr, x, 0, n - 1);
        int i = binarySearchIterative(arr, x);

        if (i == -1) {
            System.out.println("Element entered is not found");
        } else {
            System.out.println("Element found at index " + i);
        }
    }

    static int binarySearchRecursive(int[] arr, int x, int l, int r) {
        if (l <= r) {
            int mid = (l + r) / 2;
            if (x == arr[mid]) {
                return mid;
            } else if (x < arr[mid]) {
                return binarySearchRecursive(arr, x, l, mid - 1);
            } else {
                return binarySearchRecursive(arr, x, mid + 1, r);
            }
        }

        return -1;
    }

    static int binarySearchIterative(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (x == arr[mid]) {
                return mid;
            } else if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }
}

