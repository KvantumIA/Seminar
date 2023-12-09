package HW.HW_3;

import HW.HW_3.WriterFile.ReadFile;
import HW.HW_3.WriterFile.WriterFile;

import java.util.Scanner;

public class Controller {
    public void controller() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите пункт меню:\n 1. Сделать новую запись. \n 2. Просмотреть файлы. \n 3. Выход. \n Ваш выбор: ");
        try {
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    Question question = new Question();
                    question.question();
                    WriterFile writerFile = new WriterFile();
                    writerFile.saveAsFile(question);
                    controller();
                    break;
                case 2:
                    print();
                    System.out.println();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Error: Вы ввели неправильный пункт меню. Повторите ввод.");
                    System.out.println();
                    controller();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: Вы ввели неправильный пункт меню. Повторите ввод.");
            System.out.println();
            controller();
        }

    }

    public void print() {
        ReadFile readFile = new ReadFile();
        readFile.readFolder();
    }
}