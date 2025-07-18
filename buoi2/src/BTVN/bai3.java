package BTVN;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] agr){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] a=new int[n][n];
        int values= 1;
        int top=0,bottom=n-1;
        int left=0,right=n-1;
        while (values<=(n*n)){
            for (int i=left;i<=right;i++){
                a[top][i]=values++;
            }
            top++;
            for (int i=top;i<=bottom;i++){
                a[i][right]=values++;
            }
            right--;
            for(int i=right;i>=left;i--){
                a[bottom][i]=values++;
            }
            bottom--;
            for (int i=bottom;i>=top;i--){
                a[i][left]=values++;
            }
            left++;
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
    }
}
