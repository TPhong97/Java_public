package BTTL;

public class NhanVienFullTime extends NhanVien {
    private double luongCoBan, tienThuong;

    public NhanVienFullTime(String maNV, String ten, int tuoi, String email, String soDienThoai,
                            double luongCoBan, double tienThuong) {
        super(maNV, ten, tuoi, email, soDienThoai);
        this.luongCoBan = luongCoBan; this.tienThuong = tienThuong;
    }

    @Override public double tinhLuong() { return luongCoBan + tienThuong; }

    @Override public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Loại: Full Time\n-------------------");
    }
}
