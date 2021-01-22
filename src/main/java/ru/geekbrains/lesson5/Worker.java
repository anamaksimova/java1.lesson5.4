package ru.geekbrains.lesson5;

public class Worker {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;


    public int getAge() {
        return age;
    }


    public void showInfo () {
        System.out.println("Фамилия1 Имя: "+ fullName);
        System.out.println("Должность: "+ position);
        System.out.println("email: "+ email);
        System.out.println("Телефон: "+ phoneNumber);
        System.out.println("Зарплата (руб.): "+ salary);
        System.out.println("Возраст: "+ age);

        }


    public void info() {
        System.out.println("Фамилия Имя: "+ fullName);
        System.out.println("Должность: "+ position);
        System.out.println("email: "+ email);
        System.out.println("Телефон: "+ phoneNumber);
        System.out.println("Зарплата (руб.): "+ salary);
        System.out.println("Возраст: "+ age);
    }

    public Worker(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }
}
