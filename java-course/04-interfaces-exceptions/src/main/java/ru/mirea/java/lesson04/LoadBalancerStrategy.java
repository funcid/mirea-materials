package ru.mirea.java.lesson04;

public interface LoadBalancerStrategy {

    Server pick(Server[] availableServers, Client client);

}
