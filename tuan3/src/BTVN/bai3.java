package BTVN;
import java.util.Random;
import java.util.Scanner;
public class bai3 {

        public static void main(String[] args) {
            Random rand = new Random();
            Scanner sc = new Scanner(System.in);

            int a = rand.nextInt(101);
            int b = rand.nextInt(101);
            int c;

            if (rand.nextBoolean()) {
                c = a + b;
            } else {
                do {
                    c = rand.nextInt(201);
                } while (c == a + b);
            }

            System.out.println("Phép tính: " + a + " + " + b + " = " + c);
            System.out.print("Đây là phép tính đúng hay sai? (nhập 'đúng' hoặc 'sai'): ");
            String traLoi = sc.nextLine().trim().toLowerCase();

            boolean ketQuaDung = (a + b == c);
            boolean nguoiDungChonDung = traLoi.equals("đúng");
            boolean nguoiDungChonSai = traLoi.equals("sai");

            if ((ketQuaDung && nguoiDungChonDung) || (!ketQuaDung && nguoiDungChonSai)) {
                System.out.println("Bạn đã trả lời đúng!");
            } else {
                System.out.println("Bạn đã trả lời sai!");
            }

    }

}
