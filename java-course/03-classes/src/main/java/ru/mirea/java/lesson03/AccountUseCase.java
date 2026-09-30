package ru.mirea.java.lesson03;

/** Обычная банковская реализация контракта {@link AccountService}. */
public class AccountUseCase implements AccountService {

  @Override
  public Account enrollment(Enrollment enrollment) {
    Account account = enrollment.account();
    return new Account(account.id(), account.balance() + enrollment.amount());
  }

  @Override
  public Account withdrawal(Withdrawal withdrawal) {
    // TODO: реализуйте списание по аналогии с enrollment
    throw new UnsupportedOperationException("реализуйте списание");
  }
}
