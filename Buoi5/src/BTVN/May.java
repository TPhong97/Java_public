package BTVN;

import java.util.Scanner;

public class May {
    private String maMay;
    private String tenMay;
    private String tinhTrang;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã máy: ");
        maMay = sc.nextLine();
        System.out.print("Nhập tên máy: ");
        tenMay = sc.nextLine();
        System.out.print("Nhập tình trạng: ");
        tinhTrang = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Mã máy: " + maMay);
        System.out.println("Tên máy: " + tenMay);
        System.out.println("Tình trạng: " + tinhTrang);
    }
}

