public interface IBankAccount {

    /**
     * метод пополнения денег на счёт
     *
     * @param depositMoney сумма для пополнения счёта
     */
    void deposit(int depositMoney);

    /**
     * метод снятия денег со счёта
     *
     * @param withdrawMoney сумма для снятия со счёта
     */
    int withdraw(int withdrawMoney);

    /**
     * метод отображения баланса
     */
    void getBalance();

}
