public class Main {
        public static void main(String[] args) {
            int initial_amount = 500; // начальная сумма счёта
            int minimum_amount = 1000; // минимальная сумма для выполнения условия акции
            int deposit_amount = 10_423; // сумма пополнения
            int bonus_conditions = 100; // сотовый оператор дарит по 1 рублю за каждые полные 100 рублей пополнения
            int bonus = deposit_amount / bonus_conditions; // сумма бонуса
            if (deposit_amount < minimum_amount) {
                bonus = 0; }
            int balance = deposit_amount + initial_amount + bonus; // всего на балансе
            System.out.println("За пополнение счёта вам зачислено " + bonus + " руб! Всего на балансе " + balance + " руб.");
        }
    }