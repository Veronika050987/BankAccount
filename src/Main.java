public static void main(String[] args) {
    BankAccount account = new BankAccount("Иван Петров", 500.0);
    System.out.println("Владелец: " + account.getOwner());
    System.out.println("Начальный баланс: " + account.getBalance());

    System.out.println("\n[Защита]: Прямая запись в account.balance невозможна (код не скомпилируется).");

    System.out.println("\n--- Тестирование пополнения ---");

    account.deposit(250.0);
    System.out.println("Баланс после пополнения: " + account.getBalance());

    account.deposit(-50.0);
    System.out.println("Баланс после ошибки: " + account.getBalance());

    System.out.println("\n--- Тестирование снятия ---");

    account.withdraw(300.0);
    System.out.println("Баланс после снятия: " + account.getBalance());

    account.withdraw(-20.0);

    account.withdraw(1000.0);

    System.out.println("\nИтоговый баланс счета: " + account.getBalance());
}