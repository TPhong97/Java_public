package BTTL;

import java.util.Scanner;

public class sayHello {
    public String name;
    public int age;
    public Scanner sc = new Scanner(System.in);

    public void enterName(){
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
    }

    public void enterage(){
        System.out.println("Nhập tuổi: ");
        age = sc.nextInt();
    }

    public void sayHello(){
        System.out.println("Xin chào, tên tôi là " + name + ", năm nay tôi " + age + " tuổi" );
    }
}
