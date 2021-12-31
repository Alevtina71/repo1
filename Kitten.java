package ru.geekbrains.lesson7;

public class Kitten {
        public String name;
        public int appetite;
        public boolean fullness;

        public Kitten(String name, int appetite, boolean fullness) {
            this.name = name;
            this.appetite = appetite;
            this.fullness = fullness;
        }

        public void eat(Plate p) {
            p.decreaseFood(appetite);
        }
}
