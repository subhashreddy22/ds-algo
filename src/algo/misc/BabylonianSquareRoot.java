package algo.misc;

import java.util.Scanner;

/**
 * 1. Start with an arbitrary positive start value x (the closer to the root, the better).
 * 2. Initialize y = 1.
 * 3. Do following until desired approximation is achieved.
 *   a) Get the next approximation for root using average of x and y
 *   b) Set y = n/x
 */
public class BabylonianSquareRoot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the square root");
        int n = sc.nextInt();

        float x = n;
        float y = 1;
        float e = 0.0000001f; // approximation

        while (x - y > e) {
            x = (x + y) / 2;
            y = n / x;
        }

        System.out.println("Square root is " + x);
    }
}
