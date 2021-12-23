package ru.geekbrains.lesson6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double distanceRun = 200;
        double distanceJump = Math.random() * 10;
        double distanceSwim = 0;
        Cat cat = new Cat(distanceRun, distanceJump, distanceSwim);

        distanceRun = 500;
        distanceJump = Math.random()*10;
        distanceSwim = 10;
        Animal dog = new Dog(distanceRun, distanceJump, distanceSwim);

        System.out.println("Введите дистанцию для бега:");
        double distance = scanner.nextDouble();

        System.out.println("Кошка пробежала: " + cat.run(distance));
        System.out.println("Собака пробежала: " + dog.run(distance));

        System.out.println("Введите высоту препятствия:");
        distance = scanner.nextDouble();

        System.out.println("Кошка прыгает: " + cat.jump(distance));
        System.out.println("Собака прыгает: " + dog.jump(distance));

        System.out.println("Введите дистанцию для плавания:");
        distance = scanner.nextDouble();

        System.out.println("Кошка проплыла: " + cat.swim(distance));
        System.out.println("Собака проплыла: " + dog.swim(distance));
    }
}
