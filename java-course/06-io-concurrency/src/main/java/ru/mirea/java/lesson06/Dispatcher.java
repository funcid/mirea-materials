package ru.mirea.java.lesson06;

import java.util.List;
import java.util.concurrent.BlockingQueue;

/**
 * Producer: кладёт заказы в очередь, затем по одному {@link Order#POISON} на каждого курьера.
 */
public final class Dispatcher implements Runnable {

  private final BlockingQueue<Order> queue;
  private final List<Order> orders;
  private final int courierCount;

  public Dispatcher(BlockingQueue<Order> queue, List<Order> orders, int courierCount) {
    this.queue = queue;
    this.orders = orders;
    this.courierCount = courierCount;
  }

  @Override
  public void run() {
    // TODO: для каждого order — queue.put(order); опционально Thread.sleep(50)
    // TODO: courierCount раз положить Order.POISON
    // подсказка: put() бросает InterruptedException — обернуть в try/catch
  }
}
