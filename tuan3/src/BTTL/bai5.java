package BTTL;

import java.util.Scanner;

public class bai5 {

//    Nhập n và tạo ma trận n x n xoắn ốc tăng dần từ 1.
//    In ma trận.
//    Tính và in tổng các phần tử trên 2 đường chéo chính và phụ.

    public static void main(String[] agr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        int left = 0 , right = n-1;
        int top = 0 , bottom = n-1 , lenght=1;
        while (lenght <= n*n) {
            for (int i = left; i <= right; i++) {
                a[top][i] = lenght++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                a[i][right] = lenght++;
            }
            right--;
            for (int i = right; i >=left ; i--) {
                a[bottom][i] = lenght++;
            }
            bottom--;
            for (int i = bottom; i >= top ; i--) {
                a[i][left] = lenght ++;
            }
            left++;
        }

        int t1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
                if(i == j){
                  t1 += a[i][j];
                }
            }
            System.out.println();
        }

        int t2 = 0;
        for (int i = 0; i < n; i++) {
            t2 += a[i][n-i-1];
        }

        System.out.println("Tổng các phần tử trên đường chéo chính: " + t1);
        System.out.println("Tổng các phần tử trên đường chéo phụ: " + t2);

    }
}
