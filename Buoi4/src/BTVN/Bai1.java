package BTVN;

import java.util.*;

public class Bai1 {
    static Scanner sc = new Scanner(System.in);

    static class Student {
        private String name;
        private int birthYear;
        private String address;
        private double tx1, tx2, kthp;
        private int soTietNghi;

        public Student(String name, int birthYear, String address, double tx1, double tx2, double kthp, int soTietNghi) {
            this.name = name;
            this.birthYear = birthYear;
            this.address = address;
            this.tx1 = tx1;
            this.tx2 = tx2;
            this.kthp = kthp;
            this.soTietNghi = soTietNghi;
        }

        public int getAge() {
            return 2025 - birthYear;
        }

        public double getGPA() {
            return tx1 * 0.2 + tx2 * 0.3 + kthp * 0.5;
        }

        public String getName() {
            return name;
        }

        public int getSoTietNghi() {
            return soTietNghi;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public double getTx1() {
            return tx1;
        }

        public double getTx2() {
            return tx2;
        }

        public double getKthp() {
            return kthp;
        }
    }

    static ArrayList<Student> ds = new ArrayList<>();

    public static void main(String[] args) {
        ds.add(new Student("Phong", 2005, "Hà Nội", 7.5, 8, 6.5, 2));
        ds.add(new Student("Linh", 2005, "Hà Nam", 9, 7, 8, 1));
        ds.add(new Student("Tú", 2005, "Bắc Ninh", 6.5, 6, 7, 4));

        int chon;
        do {
            System.out.println("---------- Quản lý sinh viên ----------");
            System.out.println("Hãy chọn chức năng");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Sắp xếp sinh viên theo tuổi");
            System.out.println("4. Sắp xếp sinh viên theo GPA");
            System.out.println("5. Sắp xếp sinh viên theo số tiết nghỉ");
            System.out.println("6. Xóa sinh viên khỏi danh sách");
            System.out.println("7. Hiển thị danh sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1 -> them();
                case 2 -> sua();
                case 3 -> ds.sort(Comparator.comparing(Student::getAge));
                case 4 -> ds.sort((a, b) -> Double.compare(b.getGPA(), a.getGPA()));
                case 5 -> ds.sort(Comparator.comparing(Student::getSoTietNghi));
                case 6 -> xoa();
                case 7 -> hienThi();
            }
        } while (chon != 0);
    }

    static void them() {
        System.out.print("Tên: ");
        String name = sc.nextLine();
        System.out.print("Năm sinh: ");
        int ns = sc.nextInt();
        sc.nextLine();
        System.out.print("Địa chỉ: ");
        String dc = sc.nextLine();
        System.out.print("TX1: ");
        double tx1 = sc.nextDouble();
        System.out.print("TX2: ");
        double tx2 = sc.nextDouble();
        System.out.print("KTHP: ");
        double kthp = sc.nextDouble();
        System.out.print("Số tiết nghỉ: ");
        int nghi = sc.nextInt();
        ds.add(new Student(name, ns, dc, tx1, tx2, kthp, nghi));
    }

    static void sua() {
        System.out.print("Tên cần sửa: ");
        String ten = sc.nextLine();
        for (Student s : ds) {
            if (s.getName().equalsIgnoreCase(ten)) {
                System.out.print("Tên mới: ");
                s.setName(sc.nextLine());
                System.out.println("Đã sửa.");
                return;
            }
        }
        System.out.println("Không tìm thấy.");
    }

    static void xoa() {
        System.out.print("Tên cần xóa: ");
        String ten = sc.nextLine();
        boolean xoa = ds.removeIf(s -> s.getName().equalsIgnoreCase(ten));
        if (xoa) System.out.println("Đã xóa.");
        else System.out.println("Không tìm thấy.");
    }

    static void hienThi() {
        System.out.printf("%-10s %-5s %-15s %-6s %-6s %-6s %-6s %-10s\n",
                "Tên", "Tuổi", "Địa chỉ", "TX1", "TX2", "KTHP", "GPA", "Nghỉ");
        for (Student s : ds) {
            System.out.printf("%-10s %-5d %-15s %-6.1f %-6.1f %-6.1f %-6.2f %-10d\n",
                    s.getName(), s.getAge(), s.getAddress(), s.getTx1(), s.getTx2(), s.getKthp(), s.getGPA(), s.getSoTietNghi());
        }
    }
}
