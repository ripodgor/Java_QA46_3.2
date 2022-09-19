public class Main {
    public static void main(String[] args) {
        int initialAmount = 500; // начальная сумма счёта
        int minimumAmount = 1000; // минимальная сумма для выполнения условия акции
        int depositAmount = 10_423; // сумма пополнения
        int bonusConditions = 100; // сотовый оператор дарит по 1 рублю за каждые полные 100 рублей пополнения
        int bonus = depositAmount / bonusConditions; // сумма бонуса
        if (depositAmount < minimumAmount) {
            bonus = 0;
        }
        int balance = depositAmount + initialAmount + bonus; // всего на балансе
        System.out.println("За пополнение счёта вам зачислено " + bonus + " руб! Всего на балансе " + balance + " руб.");
    }
}