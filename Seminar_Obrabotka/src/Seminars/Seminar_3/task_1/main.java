package Seminars.Seminar_3.task_1;

public class main {
    public static void main(String[] args) {
        /*
        Создайте метод doSomething(), который может быть источником одного из типов checked exceptions
        (тело самого метода прописывать не обязательно). Вызовите этот метод из main и обработайте в нем
        исключение, которое вызвал метод doSomething().
         */
        try {
            doSomething2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }



    public static void doSomething() throws  Exception{
        int sum = 5/2;
        doSomething2();
    }

    public static void doSomething2() throws  Exception{
        throw new Exception("fdfdfdd");
    }
}