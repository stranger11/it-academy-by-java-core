package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для игрового движка:
 * Игрок при регистрации вводит свою дату рождения и она хранится в формате dd/MM/yyyy.
 * В профиле игрока мы должны месяц выводить не в числовом формате, а в текстовом.
 * Определить название месяца в зависимости от номера.
 *
 * @param monthNumber - номер месяца
 * @return месяц на английском языке (upper case)
 */
public class Task05 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int monthNumber = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        switch (monthNumber) {
            case 1:
                System.out.print ("JANUARY");
                break;
            case 2:
                System.out.print ("FEBRUARY");
                break;
            case 3:
                System.out.print ("MARCH");
                break;
            case 4:
                System.out.print ("APRIL");
                break;
            case 5:
                System.out.print ("MAY");
                break;
            case 6:
                System.out.print ("JUNE");
                break;
            case 7:
                System.out.print ("JULY");
                break;
            case 8:
                System.out.print ("AUGUST");
                break;
            case 9:
                System.out.print ("SEPTEMBER");
                break;
            case 10:
                System.out.print ("OCTOBER");
                break;
            case 11:
                System.out.print ("NOVEMBER");
                break;
            case 12:
                System.out.print ("DECEMBER");
                break;
        }
    }
}