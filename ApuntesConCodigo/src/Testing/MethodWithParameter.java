package Testing;

import java.util.Scanner;

public class MethodWithParameter {

    public void loadValues() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value:");
        int value = sc.nextInt();
        System.out.print("Enter the second value:");
        int value2 = sc.nextInt();
        System.out.print("Enter the third value:");
        int value3 = sc.nextInt();
        sc.close();
        int bigger = calculateBigger(value, value2, value3);
        System.out.println("\nThe bigger is: " + bigger);
        int smaller = calculateSmaller(value, value2, value3);
        System.out.println("\nThe smaller is:" + smaller);
    }

    public int calculateBigger(int v1, int v2, int v3) {
        if (v1 > v2 && v1 > v3) {
            return v1;
        } else if (v2 > v3) {
            return v2;
        } else {
            return v3;
        }
    }

    public int calculateSmaller(int v1, int v2, int v3) {
        if (v1 < v2 && v1 < v3) {
            return v1;
        } else if (v2 < v1 && v2 < v3) {
            return v2;
        } else {
            return v3;
        }
    }

    public static void main(String[] args) {
        MethodWithParameter ex = new MethodWithParameter();
        ex.loadValues();
    }

}
