package ru.mirea.java.lesson05;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Реестр заказов на коллекциях.
 *
 * <ul>
 *   <li>{@link #add} — {@link java.util.List} + {@link java.util.Map}</li>
 *   <li>{@link #findByName} — поиск через {@link java.util.Map}</li>
 *   <li>{@link #uniqueNames} — {@link java.util.Set}</li>
 *   <li>{@link #topByDistance} — сортировка через {@link java.util.Comparator}</li>
 * </ul>
 */
public interface OrderRegistry {

  void add(Order order);

  Optional<Order> findByName(String name);

  Set<String> uniqueNames();

  List<Order> topByDistance(int n);
}
