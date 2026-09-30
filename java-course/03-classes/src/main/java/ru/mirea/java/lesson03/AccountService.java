package ru.mirea.java.lesson03;

/** Контракт операций со счётом. */
public interface AccountService {
  Account enrollment(Enrollment enrollment);

  Account withdrawal(Withdrawal withdrawal);
}
