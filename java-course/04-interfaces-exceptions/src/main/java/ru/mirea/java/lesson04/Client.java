package ru.mirea.java.lesson04;

public class Client {
    private String ip; // 127.0.0.1

    public Client(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return this.ip;
    }

}
