package Seminars.Seminar_1.task_3;

import java.util.ArrayList;
import java.util.List;

public class task_3 {
    /*
    Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
     */
    public static void main(String[] args) {
        checkArray(new Integer[]{2, 3, null, 6, null});
    }
    public static void checkArray(Integer[] arr){
        List list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null){
                list.add(i);
            }
        }
        if(!list.isEmpty()){
            throw new RuntimeException("В массиве под индексом " + list +" имеет значение null");
        }
    }
}
