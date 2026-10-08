package ru.mirea.java.lesson04;

public class RoundRobinLoadBalancerStrategy implements LoadBalancerStrategy {

    private int counter = 0;

    @Override
    public Server pick(Server[] availableServers, Client client) {
        return availableServers[this.counter++ % availableServers.length];
    }
}
