package bai1_dequy;

import java.util.Scanner;

public class Bai11 {
    public static int tinhX(int n) {
        if (n == 0) {
            return 1;
        }
        return tinhX(n - 1) + tinhY(n - 1);
    }

    public static int tinhY(int n) {
        if (n == 0) {
            return 0;
        }
        return 3 * tinhX(n - 1) + tinhY(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int x = tinhX(arr[i]);
                int y = tinhY(arr[i]);
                System.out.printf("%s %s%n", x, y);
            }
        } catch (Exception e) {
            System.out.println("Da co loi xay ra vui long thu lai");
        }
    }
}
