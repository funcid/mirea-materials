package ru.mirea.java.lesson06;

import java.util.Set;

/**
 * Реестр доставленных заказов. Пишут несколько курьеров сразу —
 * обычные {@code ArrayList}/{@code HashMap} без синхронизации ломаются.
 */
public interface DeliveredOrdersRegistry {

  void add(Order order);

  int size();

  Set<String> uniqueNames();
}
