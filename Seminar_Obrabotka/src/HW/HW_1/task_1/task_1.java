package HW.HW_1.task_1;

class Answer {
    /*
    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.

        Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива

        Метод divisionByZero - Деление на 0

        Метод numberFormatException - Ошибка преобразования строки в число

    Важно: они не должны принимать никаких аргументов
     */
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int count = 1;
        int[] a = new int[]{4, 5, 6, 3};
        int[] b = new int[]{1, 2, 3};
        int[] answer = new int[count];
        for (int i = 0; i < a.length; i++) {
            answer[i] = a[i] - b[i];
            count += 1;
        }
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int c = 0;
        int a = 3;
        int b = 0;
        c = a/b;
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        int c = 0;
        int a = 3;
        int b = Integer.parseInt("one");
        c = a/b;
    }
}

public class task_1 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
