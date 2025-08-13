package ru.job4j.loop;

public class Mortgage {

    private static double yearlyInterest(double amount, double percent) {
        return amount * percent / 100;
    }

    /**
     * Рассчитывает количество лет, необходимое для погашения кредита при фиксированном годовом платеже.
     * <p>
     * Если годовой платёж меньше или равен сумме начисленных процентов за год, метод возвращает -1,
     * что означает: долг не уменьшится и кредит не будет погашен.
     * </p>
     *
     * @param amount  начальная сумма долга
     * @param salary  годовой платёж
     * @param percent годовая процентная ставка
     * @return количество лет до погашения, или -1 если долг не будет погашен
     */

    public static int year(double amount, int salary, double percent) {
        if (salary <= yearlyInterest(amount, percent)) {
            System.out.println("Платёж не покрывает даже проценты — долг не уменьшится");
            return -1;
        }
        int year = 0;
        while (amount > 0) {
            amount += yearlyInterest(amount, percent);
            amount -= salary;
            year++;
        }
        return year;
    }
}