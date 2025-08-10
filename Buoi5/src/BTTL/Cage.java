package BTTL;

import java.util.ArrayList;

public class Cage {

        public String cageCode;
        public ArrayList<Pet> pets;
        public int currentPetcount;
        public static int totalCages;
        public final int Max_CAPACITY = 3;

        public Cage(String cageCode, int currentPetcount, ArrayList<Pet> pets) {
            this.cageCode = cageCode;
            this.currentPetcount = currentPetcount;
            this.pets = pets;
            totalCages++;
        }

        public void addPet(Pet pet) {
            if (currentPetcount <= Max_CAPACITY) {
                pets.add(pet);
                currentPetcount++;
                System.out.println("Đã thêm thú vào lồng " + cageCode);
            }
            else {
                System.out.println("Lồng đã đầy! ");
            }
        }

        public void printAllPets(){
            if(pets.isEmpty()){
                System.out.println("Không có thú trong lồng!");
            }
            else {
                System.out.println("Lồng " + cageCode + " có " + currentPetcount + " thú ");
                for (Pet p : pets){
                    p.printInfo();
                }
            }

        }
    }