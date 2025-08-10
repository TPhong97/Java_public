package BTVN;
import java.util.Scanner;

public class Bai1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số lượng sinh viên: ");
            int n = sc.nextInt();
            sc.nextLine();

            Student[] students = new Student[n];
            for (int i = 0; i < n; i++) {
                System.out.println("\n--- Nhập thông tin sinh viên " + (i+1) + " ---");
                students[i] = new Student();
                students[i].input();
            }

            System.out.println("\n=== DANH SÁCH SINH VIÊN ===");
            for (Student s : students) {
                s.output();
                System.out.println("--------------------");
            }
        }
    }


