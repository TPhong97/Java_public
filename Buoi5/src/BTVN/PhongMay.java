package BTVN;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy quanLy;
    private May[] dsMay;
    private int soLuongMay;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phòng: ");
        maPhong = sc.nextLine();
        System.out.print("Nhập tên phòng: ");
        tenPhong = sc.nextLine();
        System.out.print("Nhập diện tích: ");
        dienTich = sc.nextDouble();
        sc.nextLine();

        quanLy = new QuanLy();
        quanLy.nhap();

        System.out.print("Nhập số lượng máy: ");
        soLuongMay = sc.nextInt();
        sc.nextLine();
        dsMay = new May[soLuongMay];

        for (int i = 0; i < soLuongMay; i++) {
            System.out.println("Nhập thông tin máy thứ " + (i + 1) + ":");
            dsMay[i] = new May();
            dsMay[i].nhap();
        }
    }

    public void xuat() {
        System.out.println("Mã phòng: " + maPhong);
        System.out.println("Tên phòng: " + tenPhong);
        System.out.println("Diện tích: " + dienTich);
        quanLy.xuat();
        System.out.println("=== Danh sách máy ===");
        for (May m : dsMay) {
            m.xuat();
            System.out.println("----------------");
        }
    }
}

