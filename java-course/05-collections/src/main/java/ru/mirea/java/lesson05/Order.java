package ru.mirea.java.lesson05;

public final class Order {
  public final String name;
  public final Position from;
  public final Position to;

  public Order(String name, Position from, Position to) {
    this.name = name;
    this.from = from;
    this.to = to;
  }

  public double distance() {
    return from.distanceTo(to);
  }

  @Override
  public String toString() {
    return name + " " + from + " -> " + to + " [" + String.format("%.1f", distance()) + " м]";
  }
}
