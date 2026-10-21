package ru.mirea.java.lesson06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class DeliveredOrdersRegistryImpl implements DeliveredOrdersRegistry {

  private final List<Order> orders = new ArrayList<>();
  private final Map<String, Order> byName = new HashMap<>();

  @Override
  public void add(Order order) {
    // TODO: как на паре про коллекции — в list и в map.
    // TODO: обернуть тело в synchronized (this) { ... }
    //       (или заменить map на ConcurrentHashMap и обсудить разницу)
  }

  @Override
  public int size() {
    // TODO: вернуть orders.size() (тоже под synchronized)
    return 0;
  }

  @Override
  public Set<String> uniqueNames() {
    // TODO: Set имён из byName (под synchronized)
    return Set.of();
  }
}
