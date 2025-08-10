package BTVN;
import java.util.Scanner;

public class School {
    private String name;
    private String date;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên trường: ");
        name = sc.nextLine();
        System.out.print("Nhập ngày vào trường: ");
        date = sc.nextLine();
    }

    public void output() {
        System.out.println("Tên trường: " + name);
        System.out.println("Ngày vào trường: " + date);
    }
}
