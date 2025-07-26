package BTTL;

import java.util.Scanner;

public class bai4 {

//    Viết phương thức public static int fibonacci(int n) trả về số Fibonacci thứ n (F0=0, F1=1).
//    Trong main, nhập n rồi:
//    In dãy Fibonacci từ 0 đến n.
//    Tính tổng các số Fibonacci lẻ trong dãy.

    public static Scanner sc = new Scanner(System.in);
    public static int fibinacci(int n){
        int f0=0,f1=1,fn=0;
        for (int i=0; i<n ; i++){
            fn= f0 + f1;
            f0=f1;
            f1=fn;
        }
    return fn;
    }

    public static void main (String[] agr){
        System.out.println("Nhập n: ");
        int n = sc.nextInt();

        int t=0;
        System.out.println("Dãy Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibinacci(i) + " ");

            if (fibinacci(i) % 2 != 0)
                t+=fibinacci(i);
        }
        System.out.println();
        System.out.println("Tổng các số Fibinacci lẻ trong dãy là: " + t);

    }
}
