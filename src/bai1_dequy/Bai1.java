package bai1_dequy;

import java.util.Scanner;

public class Bai1 {
    public static int giaiThua(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * giaiThua(n - 1);
    }

    public static boolean kiemTraDauVaoSai(int n) {
        return n < 0 || n > 12;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            if (kiemTraDauVaoSai(n)) {
                System.out.println("Du lieu dau vao sai");
                return;
            }
            int kq = giaiThua(n);
            System.out.println(kq);
        } catch (Exception e) {
            System.out.println("Da co loi xay ra vui long thu lai");
        }
    }
}
