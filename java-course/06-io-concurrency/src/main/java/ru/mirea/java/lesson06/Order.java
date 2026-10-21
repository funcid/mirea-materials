package ru.mirea.java.lesson06;

public final class Order {
  /** Сигнал курьеру завершиться (poison pill). */
  public static final Order POISON = new Order("__POISON__", new Position(0, 0), new Position(0, 0));

  public final String name;
  public final Position from;
  public final Position to;

  public Order(String name, Position from, Position to) {
    this.name = name;
    this.from = from;
    this.to = to;
  }

  public boolean isPoison() {
    return this == POISON;
  }

  public double distance() {
    return from.distanceTo(to);
  }

  @Override
  public String toString() {
    return name + " " + from + " -> " + to + " [" + String.format("%.1f", distance()) + " м]";
  }
}
