package ru.mirea.java.lesson03;

/** Счёт. Операции не мутируют объект — возвращают новый. */
public record Account(String id, double balance) {}
