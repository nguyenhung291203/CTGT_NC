package bai1_dequy;

import java.util.Scanner;

public class Bai4 {
    public static int ucln(int a, int b) {
        if (b == 0) {
            return a;
        }
        return ucln(b, a % b);
    }

    public static boolean kiemTraDauVaoSai(int a, int b) {
        return a <= 0 || b <= 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            scanner.nextLine();
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = scanner.nextInt();
                arr[i][1] = scanner.nextInt();

            }
            for (int i = 0; i < n; i++) {
                if (kiemTraDauVaoSai(arr[i][0], arr[i][1])) {
                    System.out.println("Dau vao sai");
                    return;
                }
                int ucln = ucln(arr[i][0], arr[i][1]);
                System.out.println(ucln);
            }
        } catch (Exception e) {
            System.out.println("Da co loi xay ra vui long thu lai");
        }
    }
}
