package ru.geekbrains.oop.lesson2.HWLes2;

import java.util.Scanner;

public class MainClass {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int action;
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik", 15, false);
        cats[1] = new Cat("Shustrik", 30, false);
        cats[2] = new Cat("Demonoid", 100, false);

        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].full == false && cats[i].appetite < plate.food) {
                cats[i].eat(plate);
                cats[i].full = true;
                System.out.println("The cat " + cats[i].name + " ate!");
            } else {
                System.out.println("The cat " + cats[i].name + " didn't eat, because he doesn't have enough food.");
            }
        }
        // cat.eat();
        // plate.setFood(plate.getFood() - cat.getAppetite());
        plate.info();
        System.out.println("How much more food to add to the plate?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();
    }
}
