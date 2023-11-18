// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

import java.time.LocalTime;
import java.util.Scanner;

public class task_3 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >= 5 && hour < 12){
            System.out.println("Доброе утро, " + name + "!");
        } else if (hour >= 12 && hour < 18){
            System.out.println("Добрый день, " + name + "!");
        } else if (hour >= 18 && hour < 23){
            System.out.println("Добрый вечер, " + name + "!");
        } else {
            System.out.println("Доброй ночи, " + name + "!");
        }
    }
}
