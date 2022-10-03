package ru.gb.javaexception.lesson2;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
//        System.out.println(insertFloat());
//        task2_1(0);
//        task2_2();
//        printExeption();
    }

    public static float insertFloat() {
        float result = 0;
        Scanner scan = new Scanner(System.in);
        boolean isCorrect = false;
        System.out.println("Введите дробное число");
        while (!isCorrect) {
            try {
                result = scan.nextFloat();
                isCorrect = true;
            } catch (InputMismatchException e) {
                System.err.println("Вы ввели не число. Попробуйте еще раз.");
                scan.nextLine();
            }
        }
        scan.close();
        return result;

    }

    public static void task2_1(int d) {
        int[] intArray = new int[9];
        intArray[8] = 10;
        try {

            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException ex) {
            System.out.println("Catching exception: " + ex);
        }

    }

    public static void task2_2() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;

        } catch (NullPointerException ex) {
            System.err.println("Указатель не может указывать на null! " + ex);
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Массив выходит за пределы своего размера! " + ex);
        } catch (Throwable ex) {
            System.err.println("Что-то пошло не так... " + ex);

        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void printExeption() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любую строку");
        String input;
        input = scan.nextLine();
        if (!input.isEmpty()) {
            System.out.println(input);
        } else {
            throw new RuntimeException("Вы не ввели значение");
        }

    }

}

