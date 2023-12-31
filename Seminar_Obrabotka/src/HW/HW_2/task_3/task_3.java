package HW.HW_2.task_3;

public class task_3 {
    static class Expr {
        /*
        Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
        При этом программа должна проверить, что делитель b не равен нулю, и выполнить деление только в этом случае.
        Если b равен нулю, программа должна вывести сообщение о невозможности выполнения операции и вернуть результат равный нулю.
        После выполнения операции деления, программа также должна вывести сумму чисел a и b с помощью метода printSum.
        Если аргументы не переданы через командную строку, используйте значения по умолчанию.

        На входе:
            '12'
            '5'
        На выходе:
            17
            2.4
         */

        public static double expr(int a, int b) {
            // Введите свое решение ниже
            if (b == 0) {
//                System.out.print("Операцию нельзя выполнить, т.к. b = ");
                printSum(a, b);
                return 0.0;
            } else {
                printSum(a, b);
                return (double) a / b;
            }
        }

        public static void printSum(int a, int b) {
            // Введите свое решение ниже
            System.out.println(a + b);
        }
    }

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

    public static class Printer {
        public static void main(String[] args) {
            int a;
            int b;

            if (args.length == 0) {
                a = 90;
                b = 0; // Default values if no arguments are provided
            } else {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            }

            double result = Expr.expr(a, b);
            System.out.println(result);
        }
    }
}
