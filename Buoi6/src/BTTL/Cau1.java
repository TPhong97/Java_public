package BTTL;
import java.util.ArrayList;
public class Cau1 {

        public static void main(String[] args) {
            LopHoc lop1 = new LopHoc("LH01", "CNTT1");
            LopHoc lop2 = new LopHoc("LH02", "CNTT2");

            ArrayList<SinhVien> danhSach = new ArrayList<>();

            danhSach.add(new SinhVien("SV01", "Nguyễn Văn A", 8.5, lop1));
            danhSach.add(new SinhVien("SV02", "Trần Thị B", 9.0, lop2));
            danhSach.add(new SinhVien("SV03", "Lê Văn C", 7.8, lop1));
            danhSach.add(new SinhVien("SV04", "Phạm Thị D", 9.5, lop2));

            System.out.println("=== Danh sách sinh viên ===");
            for (SinhVien sv : danhSach) {
                sv.inThongTin();
                System.out.println("--------------------");
            }

            SinhVien svMax = danhSach.get(0);
            for (SinhVien sv : danhSach) {
                if (sv.getDiemTB() > svMax.getDiemTB()) {
                    svMax = sv;
                }
            }

            System.out.println("=== Sinh viên có điểm TB cao nhất ===");
            svMax.inThongTin();
        }
    }


