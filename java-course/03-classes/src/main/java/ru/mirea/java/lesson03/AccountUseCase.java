package ru.mirea.java.lesson03;

import java.math.BigDecimal;

// контракты
public interface AccountUseCase {

    // зачисление
    // сигнатура
    void enroll(Account account, BigDecimal amount);

    // списание
    void withdraw(Account account, BigDecimal amount);
}
