package BTVN;

import java.util.Scanner;

public class Student {
    private String name;
    private String lop;
    private double score;
    private Faculty faculty;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên: ");
        name = sc.nextLine();
        System.out.print("Nhập lớp: ");
        lop = sc.nextLine();
        System.out.print("Nhập điểm: ");
        score = sc.nextDouble();
        sc.nextLine();

        faculty = new Faculty();
        faculty.input();
    }

    public void output() {
        System.out.println("Tên sinh viên: " + name);
        System.out.println("Lớp: " + lop);
        System.out.println("Điểm: " + score);
        faculty.output();
    }
}

