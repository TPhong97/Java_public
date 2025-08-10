package BTVN;

import java.util.Scanner;

public class Faculty {
    private String name;
    private String date;
    private School school;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên khoa: ");
        name = sc.nextLine();
        System.out.print("Nhập ngày vào khoa: ");
        date = sc.nextLine();

        school = new School();
        school.input();
    }

    public void output() {
        System.out.println("Tên khoa: " + name);
        System.out.println("Ngày vào khoa: " + date);
        school.output();
    }
}
