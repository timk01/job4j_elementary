package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] name = new String[4];
        name[0] = "Boris Borisovich";
        name[1] = "Petr Petrovich}";
        name[2] = "Ivan Ivanovich";
        name[3] = "Sergey Sergeevich";
        for (String s : name) {
            System.out.println(s);
        }
    }
}
