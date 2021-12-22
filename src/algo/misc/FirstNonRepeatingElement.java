package algo.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (countMap.containsKey(arr[i])) {
                countMap.put(arr[i], countMap.get(arr[i]) + 1);
            } else {
                countMap.put(arr[i], 1);
            }
        }

        boolean foundNonRepeatingElement = false;

        for (int i = 0; i < n; i++) {
            if (countMap.get(arr[i]) == 1) {
                System.out.println("First non repeating element " + arr[i]);
                foundNonRepeatingElement = true;
                break;
            }
        }

        if (!foundNonRepeatingElement) {
            System.out.println("Non repeating element not found in the array");
        }
    }
}
