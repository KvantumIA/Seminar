package HW.HW_1.task_2;

import java.util.Arrays;

class Answer {
    /*
    Реализуйте метод subArrays, принимающий в качестве аргументов два целочисленных массива a и b,
    и возвращающий новый массив c, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны - верните нулевой массив длины 1.

    Напишите свой код в методе subArrays класса Answer. Метод subArrays принимает на вход два параметра:
        int[] a - первый массив
        int[] b - второй массив
     */
    public int[] subArrays(int[] a, int[] b){
        // Введите свое решение ниже
//        int count = 1;
        int[] answer = new int[a.length];
        if (a.length != b.length){
            int[] c = {0};
            return c;
        }
        for (int i = 0; i < a.length; i++) {
            answer[i] = a[i] - b[i];
//            count += 1;
        }
        return answer;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class task_2{
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{4, 5, 6, 3};
            b = new int[]{1, 2, 3};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.subArrays(a, b));
        System.out.println(itresume_res);
    }
}