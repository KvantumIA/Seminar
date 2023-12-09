package Seminars.Seminar_1;

public class Main {
    public static void main(String[] args) {
    //        Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
    //                Если длина массива меньше некоторого заданного минимума,
    //        метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

    System.out.println(arr(new int[]{1,2,3}, 3));
    }
    public static int arr(int[] arr, int lenArr){
        if(arr.length < lenArr){
            return -1;
        }
        return arr.length;
    }
}