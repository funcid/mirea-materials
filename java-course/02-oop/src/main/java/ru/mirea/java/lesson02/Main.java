package ru.mirea.java.lesson02;

/**
 * Занятие 2. Массивы, два указателя, binary search, sliding window.
 *
 * <p>На паре решали вместе три задачи на отсортированных массивах {@code int[]}:
 * <ol>
 *   <li><b>Binary search</b> — поиск числа в массиве по возрастанию.
 *       Два указателя {@code left}/{@code right} сужают отрезок пополам,
 *       пока не найдём {@code target} или отрезок не опустеет.</li>
 *   <li><b>Квадраты по убыванию</b> — дан массив по возрастанию (могут быть
 *       отрицательные). Два указателя с концов: больший по модулю квадрат
 *       пишем в ответ первым, сдвигаем соответствующий край.</li>
 *   <li><b>Sliding window / склейка интервалов</b> — подряд идущие числа
 *       склеиваем в диапазон: {@code 1 2 3 5 -> 1-3,5}. Левый край окна —
 *       начало текущего интервала, правый расширяем, пока числа идут подряд.</li>
 * </ol>
 */
public final class Main {
  public static void main(String[] args) {
    // 1. Два указателя / binary search: есть ли число target в отсортированном массиве
    int[] a1 = {1, 3, 5, 7, 9, 11};
    int target = 7;
    int left = 0;
    int right = a1.length - 1;
    boolean found = false;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (a1[mid] == target) {
        found = true;
        break;
      } else if (a1[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    System.out.println("binary search " + target + ": " + found);

    // 2. Квадраты по убыванию через два указателя
    int[] a2 = {-4, -2, 0, 1, 3};
    int[] squares = new int[a2.length];
    left = 0;
    right = a2.length - 1;
    int i = 0;
    while (left <= right) {
      int leftAbs = Math.abs(a2[left]);
      int rightAbs = Math.abs(a2[right]);
      if (leftAbs >= rightAbs) {
        squares[i++] = leftAbs * leftAbs;
        left++;
      } else {
        squares[i++] = rightAbs * rightAbs;
        right--;
      }
    }
    for (int v : squares) {
      System.out.print(v + " ");
    }
    System.out.println();

    // 3. Sliding window: склейка интервалов 1 2 3 5 -> 1-3,5
    int[] a3 = {1, 2, 3, 5};
    StringBuilder sb = new StringBuilder();
    int start = 0;
    for (int end = 1; end <= a3.length; end++) {
      if (end < a3.length && a3[end] == a3[end - 1] + 1) {
        continue;
      }
      if (sb.length() > 0) {
        sb.append(',');
      }
      if (start == end - 1) {
        sb.append(a3[start]);
      } else {
        sb.append(a3[start]).append('-').append(a3[end - 1]);
      }
      start = end;
    }
    System.out.println(sb);
  }
}
