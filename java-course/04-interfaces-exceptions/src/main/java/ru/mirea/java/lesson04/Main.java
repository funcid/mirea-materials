package ru.mirea.java.lesson04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Обязательно пройти:
 * <ul>
 *   <li>объявление, реализация и применение интерфейсов;</li>
 *   <li>наследование интерфейсов; методы по умолчанию и статические;</li>
 *   <li>ошибки при работе программы; исключения ({@code Exception});</li>
 *   <li>конструкция {@code try-catch-finally}; оператор {@code throw};</li>
 *   <li>отладка в IntelliJ IDEA: запуск отладчика, точки останова.</li>
 * </ul>
 */
public final class Main {
    public static void main(String[] args) {

        Server[] servers = new Server[]{
                new Server("127.0.0.1"),
                new Server("128.0.0.1"),
                new Server("129.0.0.1"),
        };

        LoadBalancerStrategy strategy = new StickySessionsLoadBalancerStrategy();

        System.out.println(strategy.pick(servers, new Client("")));
        System.out.println(strategy.pick(servers, new Client("")));
        System.out.println(strategy.pick(servers, new Client("")));
        System.out.println(strategy.pick(servers, new Client("")));
        System.out.println(strategy.pick(servers, new Client("")));
    }
}
