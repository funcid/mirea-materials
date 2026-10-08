package ru.mirea.java.lesson03;

import java.math.BigDecimal;

public class Account {

    // поля
    String accountNumber; // 4080 3898 9928 4277
    BigDecimal balance;
    // Валюта, арестованный баланс, замороженный, активный

    // конструктор
    public Account(String accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

}
