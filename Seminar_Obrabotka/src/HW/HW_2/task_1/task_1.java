package HW.HW_2.task_1;

public class task_1 {
    static class IsFloat {
        /*
        Напишите программу, которая проверяет, является ли введенная текстовая строка числом с плавающей точкой (float).
        Программа пытается преобразовать введенную строку в число float, и если это успешно, она выводит полученное число.
        Если преобразование не удалось, программа выдаёт сообщение об ошибке и возвращает специальное значение Float.NaN,
        чтобы обозначить ошибку.
        На входе:
            '3.14'
            'Ivan'
        На выходе:
            3.14
         */
        public static float isFloat(String input) {
        // Введите свое решение ниже
            float num = 0;
            try {
                num = Float.parseFloat(input);
                return num;
            } catch (NumberFormatException | NullPointerException nfe) {
                System.out.println("Your input is not a float number. Please, try again.");
            }
            return Float.NaN;
        }
    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public static class Printer {
        public static void main(String[] args) {
            String input;

    // При отправке кода на Выполнение, вы можете варьировать эти параметры
            if (args.length == 0) {
                input = "fff"; // По умолчанию используем "3.14", если аргумент не передан
            } else {
                input = args[0];
            }

            float result = IsFloat.isFloat(input);
            System.out.println(result);
        }
    }
}
