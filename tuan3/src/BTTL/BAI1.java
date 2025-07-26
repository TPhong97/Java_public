package BTTL;

import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class BAI1 {
//    Nhập n (số phần tử), sau đó nhập n số nguyên vào mảng.
//    Đếm và in ra:
//    Tổng các số chẵn.
//    Tổng các số lẻ.
//    Số lượng số nguyên tố trong mảng.
    public static Scanner sc= new Scanner(System.in);

    public static void nhap(int []a, int n){
        System.out.println("Nhap mang: ");
        for (int i=0 ; i<n ;i++){
            a[i]=sc.nextInt();
        }
    }

    public static void xuat( int []a, int n){
        System.out.println("-----Mảng------");
        for (int i=0 ; i<n ; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static int tongchan( int []a , int n){
        int t=0;
        for (int i=0 ; i<n ; i++){
            if(a[i] % 2 == 0){
                t+=a[i];
            }
        }
        return t;
    }

    public static int tongle( int []a , int n){
        int t=0;
        for (int i=0 ; i<n ; i++){
            if(a[i] % 2 != 0){
                t+=a[i];
            }
        }
        return t;
    }

    public static boolean testprime(int b){
        if(b<=2)
            return false;
        for (int i = 2; i<= Math.sqrt(b) ; i++){
            if(b % i == 0)
                return true;
        }
        return false;
    }

    public static int dem(int []a ){
        int sl=0;
        for (int i : a){
            if(!testprime(i))
                sl++;
        }
        return sl;
    }
    public static void main (String[] agr){
        System.out.println("Nhập n:");
        int n = sc.nextInt();
        int[] a = new int[n];
        nhap(a,n);
        xuat(a,n);
        System.out.println();
        System.out.print("Tổng các số chẵn: " + tongchan(a,n) + "\n");
        System.out.print("Tổng các số lẻ: " + tongle(a,n) + "\n");
        System.out.println("Số số nguyên tố: " + dem(a));
        for (int i : a)
            if(!testprime(i))
                System.out.println(i);
    }
}
