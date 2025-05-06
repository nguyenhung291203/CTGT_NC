package bai1_dequy;

import java.util.Scanner;

public class Bai7 {
    public static double tinhHam(int index, int n) {
        if (index == n) {
            return Math.sqrt(n);
        }
        return Math.sqrt(index + tinhHam(index + 1, n));
    }

    public static boolean kiemTraDVSai(int n) {
        return n <= 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            scanner.nextLine();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (kiemTraDVSai(arr[i])) {
                    System.out.println("Dau vao sai");
                    return;
                }
                double kq = tinhHam(1, arr[i]);
                System.out.printf("%.10f\n", kq);
            }
        } catch (Exception e) {
            System.out.println("Da co loi xay ra vui long thu lai");
        }
    }
}
