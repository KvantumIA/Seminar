import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Реализовать консольное приложение, которое:
        1. Принимает от пользователя и “запоминает” строки.
        2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
        3. Если введено revert, удаляет предыдущую введенную строку из памяти.
         */
        test2();
    }
    static void test1(){
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work){
            System.out.println("Input any word:");
            String line = scanner.nextLine();
            switch (line){
                case "print" :
//                    for (int i = list.size()-1; i >= 0; i--) {
//                        System.out.println(list.get(i));
//                    }
                    ListIterator iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "exit" :
                    work = false;
                    break;
                case "revert":
                    list.removeLast();
                    break;
                default:
                    list.add(line);
            }
        }
    }
    static void test2() {
    /*
    **Текст задачи:**
    1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
    2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
     */
        Integer[] array ={1,4,6,8,0,3};
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(array));
        stack.add(1);
        stack.add(4);
        stack.add(6);
        stack.add(8);
        stack.add(0);
        stack.add(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println();
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}