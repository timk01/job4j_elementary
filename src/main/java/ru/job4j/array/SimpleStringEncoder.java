package ru.job4j.array;

/**
 * здесь ЕСТЬ упрошения (нет проверок на нулль и пустую строку, на строчные буквы, на огромную длину строки)
 * <p></p>
 * добавил метод с СБ (логика - та же самая)
 * <p></p>
 * главное учесть крайние тестовые варианты:
 * а - а, аа - а2, аб - аб, ааб - а2б, абб - аб2
 * <p></p>
 * общая логика:
 * сначала крайний случай, когда а, либо аа, тогда мы либо не зайдем в цикл вовсе, либо зайдем,
 * но увеличим каунтер (т.к. буква совпадает) и вывалимся.
 * тогда если каунтер = 1 (не изменялся), просто плюсуем символ к пустой строке
 * либо если = 2, плюсуем символ и каунтер
 * <p></p>
 * если же буква НЕ совпадает, в общем случае мы применим ту же логику что и выше.
 * например, аб - б != а, тогда получаем а (каунтер все еще 1), обнуляем каунтер и считываем новый символ - это б
 * выаливаемся из цикла
 * <p></p>
 * ну и 2 крайний случая: ааб и баа
 * в первом мы посчитаем второе а, получим а2: сначал увеличим каунтер, потом увидев что б != а, посмотрим
 * что каунтер изменен и получим а2. тут же сосчитаем символ = б и обнулим каунтер, ывалимся из цикла
 * и т.к. каунтер = 1, в итоге получим а2б (б - уже вне цикла)
 * <p></p>
 * во втором - увидим а, и т.к. каунтер = 1, получим б; тут же сосчитаем, что новый символ = а и перезапустим канутер
 * на следующем витке увеличим каунтер символа а (текущего) и потом вывалимся из цикла
 * а т.к. каунтер = 2, в итоге получим ба2
 */

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result = getResult(counter, result, symbol);
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        return getResult(counter, result, symbol);
    }

    private static String getResult(int counter, String result, char symbol) {
        return counter == 1 ? result + symbol : result + symbol + counter;
    }

    public static String encodeSb(String s) {
        StringBuilder res = new StringBuilder();
        char ch = s.charAt(0);
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ch) {
                cnt++;
            } else {
                res.append(ch);
                if (cnt > 1) {
                    res.append(cnt);
                }
                ch = c;
                cnt = 1;
            }
        }
        res.append(ch);
        if (cnt > 1) {
            res.append(cnt);
        }
        return res.toString();
    }
}
