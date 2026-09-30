package ru.mirea.java.lesson01;

import java.util.Scanner;

/**
 * Обязательно пройти:
 * <ul>
 *   <li>консольный ввод-вывод, команды ввода-вывода;</li>
 *   <li>переменные и основные типы; объявление и инициализация;</li>
 *   <li>присвоение между разными типами; специальные операторы;</li>
 *   <li>операторы остатка и частного; логический тип (boolean);</li>
 *   <li>ветвление {@code if — else}; класс {@link Math};</li>
 *   <li>циклы {@code for} и {@code while}; массивы и методы;</li>
 *   <li>строковые и символьные переменные; {@link String}, {@link StringBuilder}, {@link StringBuffer}.</li>
 * </ul>
 */
public final class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Число: ");
    double x = in.nextDouble();

    System.out.print("Операция (+ - * /): ");
    String op = in.next();

    System.out.print("Число: ");
    double y = in.nextDouble();

    double result;
    if (op.equals("+")) {
      result = x + y;
    } else if (op.equals("-")) {
      result = x - y;
    } else if (op.equals("*")) {
      result = x * y;
    } else if (op.equals("/")) {
      result = x / y;
    } else {
      System.out.println("Неизвестная операция");
      return;
    }
    System.out.println("Результат: " + result);
  }
}
