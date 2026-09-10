class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Начальный баланс не может быть отрицательным. Установлен 0.");
        }
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Некорректная сумма пополнения");
        } else {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Некорректная сумма снятия");
        } else if (amount > this.balance) {
            System.out.println("Недостаточно средств");
        } else {
            this.balance -= amount;
        }
    }
}

