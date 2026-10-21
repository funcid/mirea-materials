package ru.mirea.java.lesson05;

public final class Position {
  public final double x;
  public final double y;

  public Position(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distanceTo(Position other) {
    double dx = x - other.x;
    double dy = y - other.y;
    return Math.sqrt(dx * dx + dy * dy);
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}
