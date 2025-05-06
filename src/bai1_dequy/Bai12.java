package bai1_dequy;

import java.util.Scanner;

public class Bai12 {
    public static boolean kiemTraAm(int index, double[] arr) {
        if (index == arr.length) {
            return true;
        }
        if (arr[index] >= 0) {
            return false;
        }
        return kiemTraAm(index + 1, arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            double[] arr = new double[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextDouble();
            }
            boolean kq = kiemTraAm(0, arr);
            System.out.println(kq ? "Yes" : "No");
        }
    }
}
