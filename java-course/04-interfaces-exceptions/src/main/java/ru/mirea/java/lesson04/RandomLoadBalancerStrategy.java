package ru.mirea.java.lesson04;

public class RandomLoadBalancerStrategy implements LoadBalancerStrategy{
    @Override
    public Server pick(Server[] availableServers, Client client) {
        int index = (int) (Math.random() * availableServers.length);

        return availableServers[index];
    }
}
