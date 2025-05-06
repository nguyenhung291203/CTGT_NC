package bai1_dequy;

import java.util.Scanner;

public class Bai8 {
    public static boolean kiemTraNguyenChan(int n) {
        return n % 2 == 0 && n > 0;
    }

    public static int tinhTongChan(int index, int[] arr) {
        if (index == arr.length - 1) {
            return 0;
        }
        return kiemTraNguyenChan(arr[index]) ? arr[index] + tinhTongChan(index + 1, arr) : tinhTongChan(index + 1, arr);
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

            int kq = tinhTongChan(0, arr);
            System.out.println(kq);

        } catch (Exception e) {
            System.out.println("Da co loi xay ra vui long thu lai");
        }
    }
}
