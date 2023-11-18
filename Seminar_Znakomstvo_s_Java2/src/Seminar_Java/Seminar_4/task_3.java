package Seminar_Java.Seminar_4;

import java.util.*;

public class task_3 {
    /*
    Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.
     */
    public static void main(String[] args) {
        List <String> myList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean finish = true;
        while (finish){
            String line = scanner.nextLine();
            switch (line){
                case "print":
                    ListIterator<String> iterator = myList.listIterator(myList.size());
                    while(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "revert":
                    myList.remove(myList.size()-1);
                    break;
                case "finish":
                    finish = false;
                    break;
                default:
                    myList.add(line);
            }
        }
    }
}
