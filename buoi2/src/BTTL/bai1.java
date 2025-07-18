package BTTL;

import java.util.Scanner;
public class bai1 {
    public static void main(String[] agr){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name= sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int age= sc.nextInt();
        System.out.println("Nhap chieu cao: ");
        float weight= sc.nextFloat();
        System.out.printf("Ten: " + name);
        System.out.printf(" Ban: " + age +" tuoi");
        System.out.printf(" Cao: " + weight + " cm");
    }
}
