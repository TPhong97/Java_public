package BTTL;

import java.util.ArrayList;

public class Bai1 {
    public static void main(String[] args) {

        Cage cage1 = new Cage("C001", 0, new ArrayList<>());
        Cage cage2 = new Cage("C002", 0, new ArrayList<>());

        cage1.addPet(new Pet("Milu", 8.5, "Dog"));
        cage1.addPet(new Pet("Tom", 12.0, "Cat"));
        cage1.addPet(new Pet("Chim", 0.2, "Bird"));
        cage1.addPet(new Pet("Tho", 2.5, "Rabbit"));

        cage2.addPet(new Pet("Husky", 15.0, "Dog"));
        cage2.addPet(new Pet("Mèo Anh", 7.8, "Cat"));

        System.out.println("Tổng số lồng đã tạo: " + Cage.totalCages);


        System.out.println(" Danh sách thú trong từng lồng:");
        cage1.printAllPets();
        cage2.printAllPets();


        System.out.println(" Danh sách thú nặng hơn 10kg:");
        for (Pet p : cage1.pets) {
            if (p.isOverweight()) {
                p.printInfo();
            }
        }
        for (Pet p : cage2.pets) {
            if (p.isOverweight()) {
                p.printInfo();
            }
        }
    }
}
