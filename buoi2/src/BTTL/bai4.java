package BTTL;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] agr){

//        Bài tập: Nhập 5 số nguyên từ bàn phím, lưu vào mảng, rồi in ra:
//        Các phần tử vừa nhập
//        Tổng của các phần tử
//        Giá trị lớn nhất trong mảng

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("A["+i+"]=");
            a[i]=sc.nextInt();
        }
        int t=0;
        int max=a[0];
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
            t+=i;
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("Tổng các phần tủ: "+t);
        System.out.println("Số lớn nhất là:" +max);
    }
}
