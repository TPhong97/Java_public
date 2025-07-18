package BTTL;

import java.util.Scanner;

public class bai5 {

//    Viết chương trình in ra bảng cửu chương của số 5 (từ 5x1 đến 5x10).
//    Sau đó in ra tổng các số chẵn từ 1 đến 100 bằng vòng lặp for và while.
    public static void main(String[] agr){
        for (int i=1;i<=10;i++){
            System.out.println("5 * "+i+" = "+(5*i));
        }
        int t=0;
        for(int i=2;i<=100;i+=2){
            t+=i;
        }
        System.out.println("Tổng số chẵn 1-100: "+t );
        int i=2;
        int to=0;
        while(i<=100){
            to+=i;
            i+=2;
        }
        System.out.println("Tổng số chẵn 1-100: "+to );

    }

}
