package Seminars.Seminar_1.task_1;

public class Main2 {
    public static void main(String[] args) {
    /*Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
    Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:

        если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
        если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
        если вместо массива пришел null, метод вернет -3

    придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.

        Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит
    искомое число у пользователя, вызовет первый, обработает возвращенное значение и покажет читаемый
    результат пользователю. Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
    */

        arrayMessage(null, 3, 3);
    }

    public static int arr(int[] arr, int lenArr, int num) {
        if (arr == null) return -3;
        else if (arr.length < lenArr) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) return i;
        }
        return -2;
    }
    public static void  arrayMessage(int[] arr, int lenArr, int num){
        int result = arr(arr, lenArr, num);
        switch (result){
            case -1:
                System.out.println("длина массива меньше некоторого заданного минимума");
                break;
            case -2:
                System.out.println("искомый элемент не найден");
                break;
            case -3:
                System.out.println("вместо массива пришел null");
                break;
            default:
                System.out.println("Индекс элемента" + " " + result);
        }
    }
}

