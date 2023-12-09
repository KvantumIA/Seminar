package Seminars.Seminar_1.task_2;

public class task_2 {
    /*
    Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с
квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
     */
    public static void main(String[] args) {
        int [][] arr1 = {{0, 1, 1, 1},
                         {1, 0, 1, 0},
                         {0, 1, 1, 1},
                         {1, 0, 1, 0}};

        int [][] arr2 = {{0,1}, {1,0}};

        System.out.println(summaArr2D(arr1));
    }

    public static int summaArr2D(int[][] arr) {
        if (arr.length != arr[0].length) {
            throw new RuntimeException("Это не квадратный массив");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 1 && arr[i][j] != 0) {
                    throw new RuntimeException("В массиве не те числа!");
                }
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
