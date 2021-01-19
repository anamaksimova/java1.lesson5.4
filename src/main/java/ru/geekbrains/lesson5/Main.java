package ru.geekbrains.lesson5;

public class Main {
    public static void main(String[] args) {
        Worker[] workersArray = new Worker[5];
        workersArray[0] = new Worker("Ivanov Ivan", "manager", "ivanov@mail.ru", "89656666666", 50000, 25);
        workersArray[1] = new Worker("Petrov Petr", "Director", "petrov@mal.ru", "89656666666", 150000, 45);
        workersArray[2] = new Worker("Mann Irena", "Engineer", "mann@mail.ru", "8965333333", 80000, 33);
        workersArray[3] = new Worker("Goldman Ivan", "Accountant", "gold@mail.ru", "89634444444", 100000, 42);
        workersArray[4] = new Worker("Smirnov Sergei", "Engineer", "smirnov@mail.ru", "89635556555", 90000, 30);

        workersArray[0].info();
        System.out.println();
        workersArray[1].info();
        System.out.println();
        workersArray[2].info();
        System.out.println();
        workersArray[3].info();
        System.out.println();
        workersArray[4].info();
        System.out.println();
        System.out.println("Данные о сотрудниках старше 40 лет ниже:");
        System.out.println();

        for (Worker person: workersArray) {
            if (person.getAge() >40) {
                person.showInfo();
                System.out.println();
            }
        }





    }
}
