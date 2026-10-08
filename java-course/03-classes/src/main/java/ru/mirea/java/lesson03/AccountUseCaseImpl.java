package ru.mirea.java.lesson03;

import java.math.BigDecimal;

public class AccountUseCaseImpl implements AccountUseCase {

    // Комиссия 0-1

    @Override
    public void enroll(Account account, BigDecimal amount) {
        account.balance = account.balance.add(amount);
    }

    @Override
    public void withdraw(Account account, BigDecimal amount) {
        // Проверка баланса что денег хватает
        // throw new RuntimeException("Что не так");

        account.balance = account.balance.subtract(amount);
    }
}
