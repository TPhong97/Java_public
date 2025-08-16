package BTTL;

import java.util.ArrayList;

public class QuanLyNhanVien {
    private ArrayList<NhanVien> ds = new ArrayList<>();
    public void themNhanVien(NhanVien nv) { ds.add(nv); }
    public void hienThiTatCa() { for (NhanVien nv : ds) nv.hienThiThongTin(); }
    public double tinhTongLuong() {
        double tong = 0;
        for (NhanVien nv : ds) tong += nv.tinhLuong();
        return tong;
    }
}
