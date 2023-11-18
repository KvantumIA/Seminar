package HW_Java.Seminar_1_HW.HW_2;

import static java.lang.Math.pow;

class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
//        for (int i = 1; i <= 1000; i++) {
//            if (i == 1)
//                System.out.println(i);
//            int z = (int) pow(i, 0.5);
//            for (int j = 1; j < z; j++) {
//                if (i % j != 0)
//                    System.out.println(i);
//            }
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;

            // Проверяем деление на числа от 2 до sqrt(i)
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // Если число делится, оно не простое, можно выйти из цикла
                }
            }

            // Если isPrime осталось true, то число простое
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class HW_2{
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}