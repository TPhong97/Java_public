package BTTL;

public class Cau2 {
    public static void main(String[] args) {
        QuanLyNhanVien ql = new QuanLyNhanVien();
        ql.themNhanVien(new NhanVienFullTime("FT01","Nguyễn Văn A",30,"a@gmail.com","0123",1000,200));
        ql.themNhanVien(new NhanVienFullTime("FT02","Trần Thị B",28,"b@gmail.com","0456",1200,150));
        ql.themNhanVien(new NhanVienPartTime("PT01","Lê Văn C",22,"c@gmail.com","0789",80,10));
        ql.themNhanVien(new NhanVienPartTime("PT02","Phạm Thị D",25,"d@gmail.com","0111",60,12));
        ql.hienThiTatCa();
        System.out.println("Tổng quỹ lương: " + ql.tinhTongLuong());
    }
}
