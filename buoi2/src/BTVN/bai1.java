package BTVN;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] agr){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập bán kinh: ");
        int r=sc.nextInt();
        double C= (2*r*Math.PI);
        double S= r*r*Math.PI;
        System.out.printf(" %.3f %.3f\n",C,S);

    }
}
