package ru.netology;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("Вася",35000);
        System.out.println(account.add(1000));
        System.out.println(account.pay(5000));
        System.out.println(" ");

    }
}