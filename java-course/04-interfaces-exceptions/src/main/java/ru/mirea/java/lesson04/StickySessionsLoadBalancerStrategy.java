package ru.mirea.java.lesson04;

import java.util.HashMap;
import java.util.Map;

public class StickySessionsLoadBalancerStrategy implements LoadBalancerStrategy {

    // KV Storage
    private final Map<Client, Server> storage = new HashMap<>();

    @Override
    public Server pick(Server[] availableServers, Client client) {
        if (!storage.containsKey(client)) {
            int index = client.hashCode() % availableServers.length;
            storage.put(client, availableServers[index]);
        }
        return storage.get(client);
    }
}
