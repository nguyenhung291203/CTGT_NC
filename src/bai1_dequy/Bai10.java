package bai1_dequy;

import java.util.Scanner;

public class Bai10 {
    public static double giaiThua(int n) {
        if (n == 0 || n == 1) return 1;
        return n * giaiThua(n - 1);
    }

    public static double luyThua(double x, int n) {
        if (n == 0) return 1;
        return x * luyThua(x, n - 1);
    }

    public static double tinhTong(double x, int n) {
        if (n == 1) return x;
        return tinhTong(x, n - 1) + luyThua(x, n) / giaiThua(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            double x = sc.nextDouble();
            int n = sc.nextInt();
            double result = tinhTong(x, n);
            System.out.printf("%.8f\n", result);
        }
    }
}
