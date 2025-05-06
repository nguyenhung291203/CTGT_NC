package bai1_dequy;

import java.util.Scanner;

public class Bai9 {
    public static boolean kiemTraThoaMan(double n) {
        return n > 0;
    }

    public static int demSo(int index, double[] arr) {
        if (index == arr.length) {
            return 0;
        }
        int count = demSo(index + 1, arr);
        return kiemTraThoaMan(arr[index]) ? count + 1 : count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            scanner.nextLine();
            double[] arr = new double[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextDouble();
            }

            int kq = demSo(0, arr);
            System.out.println(kq);
        } catch (Exception e) {
            System.out.println();
            System.out.println("Da co loi xay ra vui long thu lai");
        }
    }
}
