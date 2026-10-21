package ru.mirea.java.lesson06;

import java.util.concurrent.BlockingQueue;

/**
 * Consumer: забирает заказ из очереди, «везёт» (sleep), пишет в реестр.
 */
public final class Courier implements Runnable {

  private final String courierName;
  private final BlockingQueue<Order> queue;
  private final DeliveredOrdersRegistry registry;

  public Courier(String courierName, BlockingQueue<Order> queue, DeliveredOrdersRegistry registry) {
    this.courierName = courierName;
    this.queue = queue;
    this.registry = registry;
  }

  @Override
  public void run() {
    // TODO: цикл:
    //   Order order = queue.take();
    //   if (order.isPoison()) break;
    //   Thread.sleep((long) order.distance()); // имитация доставки
    //   registry.add(order);
    //   System.out.println(courierName + " доставил: " + order.name);
  }
}
