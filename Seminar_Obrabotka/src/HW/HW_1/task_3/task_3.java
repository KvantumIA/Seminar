package HW.HW_1.task_3;

import java.util.Arrays;

class Answer {
    /*
    Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b, и
    возвращающий новый массив с, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны - верните нулевой массив длины 1.
    Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

    Напишите свой код в методе divArrays класса Answer. Метод divArrays принимает на вход два параметра:
        int[] a - первый массив
        int[] b - второй массив
     */
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int[] answer = new int[a.length];
        if (a.length != b.length){
            int[] c = {0};
            return c;
        }
        for (int i = 0; i < a.length; i++) {
            answer[i] = a[i] / b[i];
        }
        return answer;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class task_3{
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16, 3};
            b = new int[]{4, 2, 4};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}