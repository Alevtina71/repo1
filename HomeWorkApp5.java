package ru.geekbrains.lesson1;

public class HomeWorkApp5 {
    public static void main(String[] args) {

        Sotrudnic[] employee = new Sotrudnic[5];
        employee[0] = new Sotrudnic("Ivanov", "PR-manager", "ivanov@mail.ru", "81234567890", 100000, 38);
        employee[1] = new Sotrudnic("Petrov", "Marketing", "petrov@mail.ru", "80987654321", 100000, 51);
        employee[2] = new Sotrudnic("Sidorov", "QA-engineer", "sidorov@mail.ru", "1234567", 65000, 27);
        employee[3] = new Sotrudnic("Ivashchenko", "QA-engineer", "a.a.ivashchenko@mail.ru", "2345678", 80000, 34);
        employee[4] = new Sotrudnic("Kholopov", "Headmaster", "flin71@mail.ru", "3456789", 150000, 32);
        for (Sotrudnic man : employee)
            if (man.getAge() > 40)
                System.out.println(man);
    }
}
