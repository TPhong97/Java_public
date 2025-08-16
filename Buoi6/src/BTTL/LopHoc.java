package BTTL;

public class LopHoc {
    private String maLop;
    private String tenLop;

    public LopHoc(String Malop, String Tenlop){
        this.maLop = Malop;
        this.tenLop = Tenlop;
    }

    public String getTenlop() {
        return tenLop;
    }

    public void setTenlop(String tenlop) {
        tenlop = tenlop;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getMalop() {
        return maLop;
    }

    public void setMalop(String malop) {
            maLop = malop;
    }

    public void inThongTin(){
        System.out.println("Mã lớp : " + maLop + " Tên lớp: " + tenLop);
    }
}
