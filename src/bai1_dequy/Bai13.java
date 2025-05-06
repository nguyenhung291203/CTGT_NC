package bai1_dequy;

import java.util.Scanner;

public class Bai13 {
    public static boolean kiemTraKoTM(int n) {
        return n <= 0;
    }

    public static double tinhTong(int n) {
        if (n == 1) {
            return 0.5;
        }
        return (double) n / (n + 1) + tinhTong(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            scanner.nextLine();
            if (kiemTraKoTM(x)) {
                System.out.println("Dau vao ko TM");
                return;
            }
            double kq = tinhTong(x);
            System.out.printf("%.10f\n", kq);
        }
        scanner.close();
    }
}
