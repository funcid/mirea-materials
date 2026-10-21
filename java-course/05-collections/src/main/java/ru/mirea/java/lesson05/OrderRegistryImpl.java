package ru.mirea.java.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public final class OrderRegistryImpl implements OrderRegistry {

  private final List<Order> orders = new ArrayList<>();
  private final Map<String, Order> byName = new HashMap<>();

  @Override
  public void add(Order order) {
    // TODO: положить в orders и в byName (ключ — order.name)
  }

  @Override
  public Optional<Order> findByName(String name) {
    // TODO: найти через byName, без перебора orders
    return Optional.empty();
  }

  @Override
  public Set<String> uniqueNames() {
    // TODO: вернуть Set имён (HashSet)
    return Set.of();
  }

  @Override
  public List<Order> topByDistance(int n) {
    // TODO: скопировать orders, отсортировать по distance() убыв., взять первые n
    // подсказка: Comparator.comparingDouble(Order::distance).reversed()
    return List.of();
  }
}
