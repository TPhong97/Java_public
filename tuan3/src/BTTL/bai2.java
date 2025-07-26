package BTTL;

import java.util.Scanner;

public class bai2 {
//    Khai báo hằng số final double PI = 3.14159265.
//            Nhập bán kính r (double) và số mũ k (int).
//    Tính và in:
//    Chu vi và diện tích hình tròn.
//    r mũ k.
//    Căn bậc hai của (r + k).
//    Giá trị tuyệt đối của (r - k).
    public static final double PI = 3.14159265;
    public static Scanner sc =new Scanner(System.in);
    public static void main(String[] agr){
        System.out.print("Nhập bán kinh r = ");
        double r= sc.nextDouble();
        System.out.print("Nhập số mũ k = ");
        int k= sc.nextInt();
        System.out.println("Chu vi hình tròn C = " + (2*r*PI));
        System.out.println("Dien tich hinh tròn S = " + (r*r*PI));
        System.out.println("r^k = " + Math.pow(r,k));
        System.out.println("Căn bậc hai của (r + k) : " + Math.sqrt(r+k));
        System.out.println("|r-k| = " + Math.abs(r-k));
    }

}
