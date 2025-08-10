package BTTL;

import java.util.Scanner;

public class Pet {
    public  final double isOverweight = 10;
    public String name;
    public double weight;
    public String species;



    public Pet(String name , double weight , String species){
        this.name = name;
        this.weight = weight;
        this.species = species;
    }
    public Pet(){

    }



    public void printInfo(){
        System.out.println("Tên: " + this.name);
        System.out.println("Loài: " + this.species);
        System.out.println("Cân nặng: " + this.weight);
    }

    public boolean isOverweight(){
        if (weight > isOverweight) {
            return true;
        }
        return false;
    }

    public String getBasicInfo(){
        return name + " - " + species;
    }

    @Override
    public String toString() {
        return getBasicInfo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }





}

