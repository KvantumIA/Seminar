package HW_Java.Seminar_3_HW;
import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    /*
    Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел,
    удаляла бы из него четные числа и выводила список без четных чисел.

    Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers
    принимает на вход один параметр:

    Integer[] arr - список целых чисел
     */
    public static void removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> buff = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                buff.add(arr[i]);
            }
        }
        System.out.println(buff);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class HW_2{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.removeEvenNumbers(arr);
    }
}