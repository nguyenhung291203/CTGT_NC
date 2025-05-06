package bai1_dequy;

import java.util.Scanner;

public class Bai5 {
    public static String chuyenTuThapPhanSangNhiPhan(int n) {
        if (n == 0) {
            return "";
        }
        return chuyenTuThapPhanSangNhiPhan(n / 2) + n % 2;
    }

    public static boolean ktDauVaoSai(int n) {
        return n < 0;
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
                if (ktDauVaoSai(arr[i])) {
                    System.out.println("Dau vao sai");
                    return;
                }
                String kq = chuyenTuThapPhanSangNhiPhan(arr[i]);
                System.out.println(kq);
            }
        } catch (Exception e) {
            System.out.println("Da co loi xay ra vui long thu lai");
        }
    }
}
