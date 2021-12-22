package ru.geekbrains.lesson6;

public class Animal {
    private double animalRun, animalJump, animalSwim;

    Animal(double animalRun, double animalJump, double animalSwim) {
        this.animalRun = animalRun;
        this.animalJump = animalJump;
        this.animalSwim = animalSwim;
    }

    public boolean run(double value) {
        return animalRun >= value;
    }

    public boolean jump(double value) {
        return animalJump >= value;
    }

    public boolean swim(double value) {
        return animalSwim >= value;
    }

}
