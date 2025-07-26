package BTVN;

import java.util.Scanner;

public class BAI1 {

//    Viên gạch có thể có một trong ba hình dạng: Square, Triangle, Circle.
//    Khai báo 3 hằng số (final) tương ứng với ba loại hình.
//    Nhập biến type từ bàn phím.
//    Kiểm tra type. Nếu không trùng với hình dạng nào thi in ra: "Hình dạng không hợp lệ!".
//    Tính và in ra diện tích của viên gạch.

    public static final String SQUARE = "square";
    public static final String TRIANGLE = "triangle";
    public static final String CIRCLE = "circle";

    public static void main (String[] agr){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập hình dạng viên gạch (square, triangle, circle)");
        String type = sc.nextLine().trim().toLowerCase();

        switch (type){
            case SQUARE :
                System.out.println("Nhập cạnh hình vuông: ");
                double a = sc.nextDouble();
                System.out.println("Diện tích hình vông: " + (a*a));
                break;
            case TRIANGLE:
                System.out.println("Nhập cạnh đáy: ");
                double day = sc.nextDouble();
                System.out.println("Nhập chiều cao: ");
                double h = sc.nextDouble();
                System.out.print("Diện tích hình tam giác: " + (0.5 * day * h));
                break;
            case CIRCLE:
                System.out.println("Nhập bán kính: ");
                float r = sc.nextFloat();
                System.out.print("Diện tích hình tròn: %.2f\n" + (Math.PI * r * r));
                break;
            default:
                System.out.print("Hình dạng không hợp lệ! ");
        }
    }


}
