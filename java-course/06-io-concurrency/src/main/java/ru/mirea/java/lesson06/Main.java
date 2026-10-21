package ru.mirea.java.lesson06;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Занятие: многопоточность + коллекции.
 *
 * <p>Продолжение {@code OrderRegistry}: заказы идут через {@link BlockingQueue},
 * курьеры пишут в общий {@link DeliveredOrdersRegistry}.
 *
 * <ol>
 *   <li>Очередь + ≥2 курьера + {@code join} = удовл.</li>
 *   <li>+ потокобезопасный реестр ({@code synchronized}) = хорошо.</li>
 *   <li>+ демо гонки без sync и объяснение, зачем {@code BlockingQueue} = отлично.</li>
 * </ol>
 */
public final class Main {
  public static void main(String[] args) throws InterruptedException {
    BlockingQueue<Order> queue = new LinkedBlockingQueue<>();
    DeliveredOrdersRegistry registry = new DeliveredOrdersRegistryImpl();

    List<Order> batch = List.of(
        new Order("Пицца", new Position(0, 0), new Position(30, 40)),
        new Order("Суши", new Position(10, 10), new Position(12, 10)),
        new Order("Документы", new Position(0, 0), new Position(100, 0)),
        new Order("Пицца", new Position(5, 5), new Position(8, 9)),
        new Order("Цветы", new Position(0, 0), new Position(60, 80)),
        new Order("Кофе", new Position(1, 1), new Position(20, 20)),
        new Order("Аптека", new Position(0, 0), new Position(45, 0)),
        new Order("Книги", new Position(2, 2), new Position(10, 50))
    );

    int courierCount = 3;

    Thread dispatcher = new Thread(
        new Dispatcher(queue, batch, courierCount),
        "dispatcher"
    );
    Thread c1 = new Thread(new Courier("Аня", queue, registry), "courier-1");
    Thread c2 = new Thread(new Courier("Боря", queue, registry), "courier-2");
    Thread c3 = new Thread(new Courier("Вика", queue, registry), "courier-3");

    dispatcher.start();
    c1.start();
    c2.start();
    c3.start();

    dispatcher.join();
    c1.join();
    c2.join();
    c3.join();


    System.out.println("доставлено: " + registry.size());
    System.out.println("уникальные имена: " + registry.uniqueNames());
  }
}
