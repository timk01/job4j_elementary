package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("length of ages is: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("length of surnames is: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("length of prices is: " + prices.length);

        String[] names = new String[4];
        names[0] = "Boris Borisovich";
        names[1] = "Petr Petrovich}";
        names[2] = "Ivan Ivanovich";
        names[3] = "Sergey Sergeevich";
        for (String s : names) {
            System.out.println(s);
        }
    }
}
