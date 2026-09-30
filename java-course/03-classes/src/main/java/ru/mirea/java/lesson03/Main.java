package ru.mirea.java.lesson03;

/**
 * Занятие 3. Классы, интерфейсы, методы и контракты.
 *
 * <p>Модель как в банковском сервисе: счёт, команды начисления/списания,
 * контракт {@link AccountService} и его реализация {@link AccountUseCase}.
 */
public class Main {
  public static void main(String[] args) {
    AccountService service = new AccountUseCase();

    Account account = new Account("A-1", 1000.0);
    System.out.println("старт: " + account);

    account = service.enrollment(new Enrollment(account, 250.0));
    System.out.println("начисление: " + account);

    // Задание 1: реализуйте withdrawal
    // account = service.withdrawal(new Withdrawal(account, 100.0));
    // System.out.println("списание: " + account);

    // Задание 2: ошибки

    // Задание 3: другая реализация комиссия
    // AccountService crypto = new CryptoAccountUseCase(0.01);
    // account = crypto.enrollment(new Enrollment(account, 50.0));
    // System.out.println("crypto: " + account);
  }
}
