package Seminars.Seminar_3.task_2;

public class task2 {
    public static void main(String[] args) {
        /*
        Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней
        int переменной на 1. Сделайте так, чтобы с объектом такого типа можно было работать в
        блоке try-with-resources. Подумайте, что должно происходить при закрытии этого ресурса?
        Напишите метод для проверки, закрыт ли ресурс. При попытке вызвать add() у закрытого ресурса,
        должен выброситься IOException
         */
        try(Counter counter = new Counter()) {
            counter.add();
            counter.add();
            counter.add();
            counter.add();
            counter.close();
            System.out.println(counter.getCount());
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}

