package ru.mirea.java.lesson04;

public class Server {

    private String ip; // 127.0.0.1

    public Server(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return this.ip;
    }
}
