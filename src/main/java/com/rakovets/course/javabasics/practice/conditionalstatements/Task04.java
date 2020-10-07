package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для desktop приложения:
 * которая преобразует номер дня недели в его словесный аналог, если известно:
 *
 * @param weekDayNumber - номер дня недели
 * @return день недели на английском языке (lower case)
 */
public class Task04 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int weekdayNumber = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)

        switch (weekdayNumber) {
            case 1:
                System.out.print ("monday");
                break;
            case 2:
                System.out.print ("tuesday");
                break;
            case 3:
                System.out.print ("wednesday");
                break;
            case 4:
                System.out.print ("thursday");
                break;
            case 5:
                System.out.print ("friday");
                break;
            case 6:
                System.out.print ("saturday");
                break;
            case 7:
                System.out.print ("sunday");
                break;
        }
    }
}