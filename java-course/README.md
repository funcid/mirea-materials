# Курс Java

Практикум: Gradle multi-project, Java 21. Каждый модуль — одна тема / пара.

Откройте в IntelliJ IDEA каталог `java-course/` как Gradle-проект.

```bash
./gradlew :01-language-constructs:run
./gradlew :02-oop:run
./gradlew :03-classes:run
./gradlew :12-testing-javadoc:test
```

## Занятия

| Модуль | Тема |
| --- | --- |
| `01-language-constructs` | Языковые конструкции: примитивы, `String`, `Math`, `if`/`for`, ввод-вывод. Задание — консольный калькулятор `+ - * /` (`double`) |
| `02-oop` | Массивы: binary search, квадраты по убыванию (два указателя), склейка интервалов (sliding window) |
| `03-classes` | Классы, интерфейсы, контракты: `Account`, `Enrollment`/`Withdrawal`, `AccountService` / `AccountUseCase`. Начисление готово, списание — задание; затем ошибки и `CryptoAccountUseCase` |
| `04-interfaces-exceptions` | Интерфейсы. Исключения. Отладка |
| `05-collections` | Коллекции |
| `06-io-concurrency` | Ввод-вывод. Многопоточность |
| `07-jdbc-orm` | Базы данных. ORM |
| `08-build-javafx` | Сборка. JavaFX |
| `09-spring` | Spring Framework |
| `10-rest` | RESTful API |
| `11-thymeleaf` | Thymeleaf |
| `12-testing-javadoc` | Тестирование. Javadoc |
