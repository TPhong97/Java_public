package BTVN;

import java.util.*;

public class QuanLyThuVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("\n===== QUẢN LÝ THƯ VIỆN =====");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Tìm sách theo tác giả");
            System.out.println("4. Xóa sách theo ID");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Tên sách: ");
                    String ten = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tacGia = sc.nextLine();
                    System.out.print("Giá: ");
                    double gia = sc.nextDouble(); sc.nextLine();

                    System.out.print("Có nhập NXB không? (y/n): ");
                    String c = sc.nextLine();
                    if (c.equalsIgnoreCase("y")) {
                        System.out.print("Tên NXB: ");
                        String tenNXB = sc.nextLine();
                        System.out.print("Địa chỉ NXB: ");
                        String diaChi = sc.nextLine();
                        lib.addBook(new Book(ten, tacGia, gia, new Publisher(tenNXB, diaChi)));
                    } else {
                        lib.addBook(new Book(ten, tacGia, gia));
                    }
                    break;
                case 2:
                    System.out.print("Hiện NXB? (true/false): ");
                    boolean show = sc.nextBoolean();
                    lib.displayAllBooks(show);
                    break;
                case 3:
                    System.out.print("Nhập tên tác giả: ");
                    String tg = sc.nextLine();
                    lib.searchByAuthor(tg);
                    break;
                case 4:
                    System.out.print("Nhập ID sách cần xóa: ");
                    int id = sc.nextInt();
                    lib.removeBookById(id);
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Chọn sai, vui lòng nhập lại!");
            }
        }
    }
}