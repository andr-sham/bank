public class BankAccount implements IBankAccount {
    /**
     * текущий баланс
     */
    private int balance;

    /**
     * конструктор банковского аккаунта
     *
     * @param balance начальный баланс
     */

    public BankAccount(int balance) {
        this.balance = balance;
    }

    /**
     * метод пополнения счёта
     *
     * @param depositMoney сумма для пополнения счёта
     */

    @Override
    public void deposit(int depositMoney) {
        balance = balance + depositMoney;
    }

    /**
     * метод снятия денег со счёта
     *
     * @param withdrawMoney сумма, которую снимаем со счёта
     */
    @Override
    public int withdraw(int withdrawMoney) {
        balance = balance - withdrawMoney;
        return withdrawMoney;
    }

    /**
     * отображение текущего баланса в консоли
     */

    @Override
    public void getBalance() {
        System.out.println("Ваш баланс: " + balance);
    }
}