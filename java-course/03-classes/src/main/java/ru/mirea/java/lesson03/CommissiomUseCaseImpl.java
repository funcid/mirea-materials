package ru.mirea.java.lesson03;

import java.math.BigDecimal;

public class CommissiomUseCaseImpl implements AccountUseCase {

    private BigDecimal commission; // 0-1

    public CommissiomUseCaseImpl(BigDecimal commission) {
        this.commission = commission;
    }

    @Override
    public void enroll(Account account, BigDecimal amount) {
        account.balance = account.balance.add(
                amount.multiply(commission)
        );
    }
    @Override
    public void withdraw(Account account, BigDecimal amount) {
        BigDecimal withCommission = amount.add(amount.multiply(commission));

        if (account.balance.compareTo(withCommission) < 0) {
            throw new RuntimeException("Денег мало");
        }

        account.balance = account.balance.subtract(withCommission);
    }
}
