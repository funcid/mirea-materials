package ru.mirea.java.lesson03;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(
                "4080 3898 9928 4277",
                new BigDecimal("13")
        );

        // SOLID: L: Liskov Principle
        AccountUseCase useCase = new CommissiomUseCaseImpl(
                new BigDecimal("0.3")
        );

        useCase.withdraw(account, BigDecimal.TEN);

        System.out.println(account.balance);
    }
}
