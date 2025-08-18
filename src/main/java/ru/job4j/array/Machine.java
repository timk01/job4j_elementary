package ru.job4j.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Идём по номиналам в порядке убывания.
 * Для каждого номинала выдаём монету столько раз, пока сдача ≥ номинала.
 * Т.е. внутри - уменьшаем сдачу н номинал и заносим в массив выдаваемый (текущий) номинал
 * Переходим к следующему (меньшему) номиналу.
 * Внешний цикл — по номиналам (конечный), внутренний — пока можем выдавать текущий номинал.
 * === Внутри несколько реаализаций (базовая, с листом и улучшенная базовая с чуть быстрее подходом)
 * !если монетки (номиналы) приходят извне (и они все еще... интовые), важно убедиться, что они отсортированы по убыванию + не повторялись
 * Например:
 * int[] coins = {5, 1, 2, 2, 10, 5, 1};
 * coins = Arrays.stream(coins)
 *         .distinct()
 *         .boxed()
 *         .sorted(Comparator.reverseOrder())
 *         .mapToInt(Integer::intValue)
 *         .toArray();
 * Arrays.sort(coins, Comparator.reverseOrder()); - если Интеджеры
 * удалить дубликаты через ЛХС:
 * coins = new LinkedHashSet<>(Arrays.asList(coins))
 *             .toArray(new Integer[0]);
 * или через стримы:
 * coins = Arrays.stream(coins)
 *         .distinct()
 *         .sorted(Comparator.reverseOrder())
 *         .toArray(Integer[]::new);
 */

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money -= price;
        for (int coin : coins) {
            while (money >= coin) {
                money -= coin;
                rsl[size++] = coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static int[] changeWithList(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        List<Integer> result = new ArrayList<>();
        money -= price;
        for (int coin : coins) {
            while (money >= coin) {
                money -= coin;
                result.add(coin);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] changeGreedyFast(int money, int price) {
        if (money < price) {
            throw new IllegalArgumentException("can't buy this thing!");
        }
        if (money == price) {
            return new int[0];
        }

        int[] coins = {10, 5, 2, 1};
        money -= price;
        int[] tmp = new int[money];
        int size = 0;
        for (int c : coins) {
            int timesPerCoin = money / c;
            for (int i = 0; i < timesPerCoin; i++) {
                tmp[size++] = c;
            }
            money %= c;
        }
        return Arrays.copyOf(tmp, size);
    }
}