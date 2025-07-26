package BTVN;

import java.util.Locale;
import java.util.Scanner;

public class bai2 {

//    Nhập chuỗi từ bàn phím.
//    Nếu chuỗi đối xứng (Palindrome):
//    In chuỗi in hoa toàn bộ và thông báo chuỗi này đối xứng.
//    Nếu không:
//    In chuỗi in thường toàn bộ và thông báo chuỗi này không đối xứng.

    public static void main(String[] agr){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        String s = sc.nextLine().trim();
        String a = "";

        for (int i = s.length()-1; i >= 0; i--) {
            a += s.charAt(i);
        }
        if (a.equalsIgnoreCase(s)){
            s = s.toUpperCase();
            System.out.println(s + " là chuỗi đối xứng");
        }
        else{
            s = s.toLowerCase();
            System.out.println(s + " không là chuỗi đối xứng");
        }

    }
}
