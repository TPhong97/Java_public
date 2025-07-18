package BTVN;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] agr){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] A=new int[n];
        for (int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            if(i%2!=0){
                A[i]+=Math.abs(A[i+1]-A[i-1]);
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
    }
}
