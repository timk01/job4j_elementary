package ru.job4j.loop;

import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password = 0;
        do {
            System.out.println("Введите пароль: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введите число!");
                scanner.next();
                continue;
            }
            password = scanner.nextInt();
        } while (password != 555);
        System.out.println("Пароль введён успешно!");
    }
}