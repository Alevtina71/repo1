package ru.geekbrains.lesson7;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int action;
        Kitten[] kittens = new Kitten[4];
        kittens[0] = new Kitten("Key", 15, false);
        kittens[1] = new Kitten("Snow", 35, false);
        kittens[2] = new Kitten("Meow", 5, false);
        kittens[3] = new Kitten("Bad", 30, false);

        Plate plate = new Plate(150);
        plate.info();
        for (int i = 0; i < kittens.length; i++) {
            if (!kittens[i].fullness && kittens[i].appetite < plate.food){
                kittens[i].eat(plate);
                kittens[i].fullness = true;
                System.out.println("Котенок " + kittens[i].name + " покушал!");
            } else System.out.println("Котенок " + kittens[i].name + " не поел!");
        }
        plate.info();
        System.out.println("Сколько грамм вискаса добавить еще в миску?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();
    }
}