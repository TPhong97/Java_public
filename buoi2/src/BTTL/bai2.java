package BTTL;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] agr){
//        Khai báo các biến sau với tên phù hợp: tên học sinh, tuổi, lớp học, điểm trung bình.
    Scanner sc= new Scanner(System.in);
    System.out.println("Nhap ten hoc sinh: ");
    String name = sc.nextLine();
    System.out.println("Nhap tuoi hoc sinh: ");
    int age = sc.nextInt();
    sc.nextLine();
    System.out.println("Nhap lop hoc : ");
    String Class = sc.nextLine();
    System.out.println("Nhap diem trung binh: ");
    float dtb = sc.nextFloat();
    System.out.print("Ten: "+name);
    System.out.print(" - Tuoi: "+age);
    System.out.print(" - Lop: "+Class);
    System.out.print(" - GPA: "+dtb);


}
}
