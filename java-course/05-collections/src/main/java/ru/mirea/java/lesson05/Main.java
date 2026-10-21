package ru.mirea.java.lesson05;

import java.util.List;
import java.util.Set;

/**
 * Занятие: коллекции — {@code List}, {@code Set}, {@code Map}, {@code Comparator}.
 *
 * <p>Задание — {@link OrderRegistry}:
 * <ol>
 *   <li>{@code add} + {@code findByName} ({@code List} + {@code Map}) = удовл.</li>
 *   <li>+ {@code uniqueNames} ({@code Set}) = хорошо.</li>
 *   <li>+ {@code topByDistance} ({@code Comparator}) и объяснить, зачем map = отлично.</li>
 * </ol>
 */
public final class Main {
  public static void main(String[] args) {
    OrderRegistry registry = new OrderRegistryImpl();

    registry.add(new Order("Пицца", new Position(0, 0), new Position(30, 40)));
    registry.add(new Order("Суши", new Position(10, 10), new Position(12, 10)));
    registry.add(new Order("Документы", new Position(0, 0), new Position(100, 0)));
    registry.add(new Order("Пицца", new Position(5, 5), new Position(8, 9)));
    registry.add(new Order("Цветы", new Position(0, 0), new Position(60, 80)));

    System.out.println("findByName(Суши) = " + registry.findByName("Суши").orElse(null));
    System.out.println("findByName(Такси) = " + registry.findByName("Такси").orElse(null));

    Set<String> names = registry.uniqueNames();
    System.out.println("uniqueNames = " + names);

    List<Order> top = registry.topByDistance(3);
    System.out.println("topByDistance(3):");
    for (Order order : top) {
      System.out.println("  " + order);
    }
  }
}
