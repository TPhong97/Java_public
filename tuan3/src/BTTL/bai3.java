package BTTL;

import java.util.Scanner;

public class bai3 {

//    Nhập vào một chuỗi từ bàn phím.
//    Xoá các khoảng trắng ở đầu và cuối chuỗi.
//    Kiểm tra xem chuỗi có phải là palindrome (chuỗi đối xứng) hay không.
//    In chuỗi đảo ngược.

    public static Scanner sc = new Scanner(System.in);

    public static void main ( String[] agr){

        System.out.println("Nhập chuỗi: ");
        String s = sc.nextLine();
        s = s.trim();

        String s1 = "";
        for( int i = s.length()-1 ; i>=0 ; i--){
            s1 += s.charAt(i);
        }
        if (s.equalsIgnoreCase(s1)){
            System.out.println(" -> Chuỗi đối xứng");
        }
        else
            System.out.println("-> Chuỗi không đối xứng");
        System.out.println("Chuỗi đảo ngược của (" + s + ") là: " + s1);
    }
}
