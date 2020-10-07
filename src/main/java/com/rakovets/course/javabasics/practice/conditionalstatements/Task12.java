package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для сайта посвященного астрологии:
 * Которая выводит знак зодиака и названия года по китайскому календарю, если известно:
 *
 * @param day   - число дня рождения
 * @param month - месяц дня рождения
 * @param year  - год дня рождения (больше 0 г. н.э. и нет никаких циклических смещений)
 *
 * 21.3-20.4 - `Ram`
 * 21.4-20.5 - `Bull`
 * 21.5-21.6 - `Twins`
 * 22.6-22.7 - `Crab`
 * 23.7-22.8 - `Lion`
 * 23.8-21.9 - `Maiden`
 * 22.9-22.10 - `Scales`
 * 23.10-22.11 - `Scorpion`
 * 23.11-21.12 - `Archer`
 * 22.12-20.1 - `Goat`
 * 21.1-19.2 - `Water-bearer`
 * 20.2-20.3 - `Fish`
 *
 * 2001 - `Snake`
 * 2002 - `Horse`
 * 2003 - `Ram`
 * 2004 - `Monkey`
 * 2005 - `Rooster`
 * 2006 - `Dog`
 * 2007 - `Pig`
 * 2008 - `Rat`
 * 2009 - `Ox`
 * 2010 - `Tiger`
 * 2011 - `Rabbit`
 * 2012 - `Dragon`
 *
 * @return 'Zodiac Sign: {0}. Chinese Zodiac: {1}', где {0} - знак зодиака, {1} - год зодиака
 */
public class Task12 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int day = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[0]);
        int month = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[1]);
        int year = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[2]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        String sign = "";
        String chineseSign = "";
        if ((month == 1) && (day <= 20) || (month == 12) && (day >= 22)) {
            sign = "Goat";
        } else if ((month == 1) && (day >= 21) || (month == 2) && (day <= 19)) {
            sign = "Water-bearer";
        } else if ((month == 2) && (day >= 20) || (month == 3) && (day <= 20)) {
            sign = "Fish";
        } else if ((month == 3) && (day >= 21)|| (month == 4) && (day <= 20)) {
            sign = "Ram";
        } else if ((month == 4) && (day >= 21)|| (month == 5) && (day <= 20)) {
            sign = "Bull";
        } else if ((month == 5) && (day >= 21)|| (month == 6) && (day <= 21)) {
            sign = "Twins";
        } else if ((month == 6) && (day >= 22)|| (month == 7) && (day <= 22)) {
            sign = "Crab";
        } else if ((month == 7) && (day >= 23)|| (month == 8) && (day <= 22)) {
            sign = "Lion";
        } else if ((month == 8) && (day >= 23)|| (month == 9) && (day <= 21)) {
            sign = "Maiden";
        } else if ((month == 9) && (day >= 22)|| (month == 10) && (day <= 22)) {
            sign = "Scales";
        } else if ((month == 10) && (day >= 23)|| (month == 11) && (day <= 22)) {
            sign = "Scorpion";
        } else if ((month == 11) && (day >= 23) || (month == 12) && (day <= 21)){
            sign = "Archer";
        }

        int x = (year - 2001) % 12;
        if ((x == 0) || (x == 2001)) {
            chineseSign = "Snake";
        } else if ((x == 1) || (x == 2002)) {
            chineseSign = "Horse";
        } else if ((x == 2) || (x == 2003)) {
            chineseSign = "Ram";
        } else if ((x == 3) || (x == 2004)) {
            chineseSign = "Monkey";
        } else if ((x == 4) || (x == 2005)) {
            chineseSign = "Rooster";
        } else if ((x == 5) || (x == 2006)) {
            chineseSign = "Dog";
        } else if ((x == 6) || (x == 2007)) {
            chineseSign = "Pig";
        } else if ((x == 7) || (x == 2008)) {
            chineseSign = "Rat";
        } else if ((x == 8) || (x == 2009)) {
            chineseSign = "Ox";
        } else if ((x == 9) || (x == 2010)) {
            chineseSign = "Tiger";
        } else if ((x == 10) || (x == 2011)) {
            chineseSign = "Rabbit";
        } else if ((x == 11) || (x == 2012)) {
            chineseSign = "Dragon";
        }
        System.out.println("Zodiac Sign:"+" "+sign+"."+" "+"Chinese Zodiac:"+" "+chineseSign);
    }
}



