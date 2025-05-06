package bai1_dequy;

import java.util.Scanner;

public class Bai2 {
    public static int timSoLonNhat(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int max = timSoLonNhat(arr, index + 1);
        return Math.max(max, arr[index]);
    }

    public static boolean kiemTraDKSai(int[] arr) {
        for (int j : arr) {
            if (j < 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean kiemTraChuoiCoKTLa(String s) {
        if (s == null || s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }


    public static int[] chuyenTuChuoiThanhMang(String s) {
        int[] kq = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            kq[i] = Character.getNumericValue(s.charAt(i));
        }
        return kq;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            scanner.nextLine();
            String[] input = new String[n];
            for (int i = 0; i < n; i++) {
                input[i] = scanner.nextLine();
            }

            for (String item : input) {
                if (kiemTraChuoiCoKTLa(item)) {
                    System.out.println("Input sai");
                    return;
                }
                int[] arr = chuyenTuChuoiThanhMang(item);
                if (kiemTraDKSai(arr)) {
                    System.out.println("Input sai");
                }

                int max = timSoLonNhat(arr, 0);
                System.out.printf("%s: %s%n", item, max);
            }

        } catch (Exception e) {
            System.out.println("Da co loi xay ra vui long thu lai");
        }

    }
}
