package HW_Java.Seminar_3_HW;

import java.util.ArrayList;
import java.util.Arrays;

class Answer2 {
    /*
    Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:

Сортирует его по возрастанию и выводит на экран
Находит минимальное значение в списке и выводит на экран - Minimum is {число}
Находит максимальное значение в списке и выводит на экран - Maximum is {число}
Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:

Integer[] arr - список целых чисел
     */
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList <Integer> arrayList = new ArrayList<>();
        for (int temp : arr){
            arrayList.add(temp);
        }
        arrayList.sort(null);
        int min = arrayList.get(0);
        int max = arrayList.get(arrayList.size()-1);

        int average = 0;
        for (int i = 0; i < arr.length; i++) {
            average += arr[i];
        }
        average = average / arrayList.size();

        System.out.println(arrayList);
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
        System.out.println("Average is = " + average);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class HW_3{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer2 ans = new Answer2();
        ans.analyzeNumbers(arr);
    }
}