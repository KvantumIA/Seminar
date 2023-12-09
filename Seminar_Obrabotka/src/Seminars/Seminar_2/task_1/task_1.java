package Seminars.Seminar_2.task_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class task_1 {
    /*
    Запишите в файл следующие строки:
Анна=4
Елена=5
Марина=6
Владимир=?
Константин=?
Иван=4
Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap,
если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено значение ?,
заменить его на соответствующее число.Если на каком-то месте встречается символ, отличный от числа или ?,
бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.
     */

    public static void main(String[] args) {
        readText();
    }
    public static void readText(){
        try {
            HashMap<String, String> map = new HashMap<>();
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\IdeaProjects\\Seminar_Obrabotka\\src\\Seminars\\Seminar_2\\task_1\\text.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] ln = line.split("=");
                if (ln[1].equals("?"))
                    ln[1] = String.valueOf(ln[0].length());
                map.put(ln[0], ln[1]);
            }
            System.out.println(map);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



