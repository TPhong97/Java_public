package BTTL;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemTB;
    private LopHoc lop;

    public SinhVien(String maSV, String hoTen, double diemTB, LopHoc lop) {
        this.maSV = maSV;
        this.lop = lop;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiemTB(int diemTB){
        this.diemTB = diemTB;
    }

    public void inThongTin(){
        System.out.println("Mã SV: " + maSV + "  Họ và tên: " + hoTen + " Điểm TB: " + diemTB);
        lop.inThongTin();
    }
}
