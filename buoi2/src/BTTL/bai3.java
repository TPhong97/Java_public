package BTTL;

import java.util.Scanner;

public class bai3 {
    //    Viết chương trình nhập 2 số nguyên và thực hiện các phép tính: cộng, trừ, nhân, chia, chia get dư.
//    Sau đó kiểm tra xem 2 số có bằng nhau không sau đó trên màn hình.(kiểm tra mức tối thiểu là 5 cặp)
    public static void main(String[] agr){
        Scanner sc= new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.println("Cặp số thứ "+i);
            System.out.print("Nhập số nguyên 1: ");
            int a=sc.nextInt();
            System.out.print("Nhập số nguyên 2: ");
            int b=sc.nextInt();
            System.out.println("Tổng: "+(a+b));
            System.out.println("Hiệu: "+(a-b));
            System.out.println("Tích: "+(a*b));
            if (b!=0){
                System.out.println("Thương: "+(a/b));
                System.out.println("Dư: "+(a%b));
            }
            else
                System.out.println("Không chia được");
            if(a==b)
                System.out.println("a bằng b");
            else
                System.out.println("a khác b");
        }

    }

}
