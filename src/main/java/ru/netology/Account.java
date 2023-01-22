package ru.netology;

public class Account {
    protected String name;
    protected long balance;

    public Account(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public boolean add(long amount) {
        balance += amount;
        return true;
    }

    public boolean pay(long amount) {
        balance -= amount;
        return true;
    }

    public long getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

}
