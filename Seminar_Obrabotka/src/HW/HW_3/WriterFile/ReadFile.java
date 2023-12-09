package HW.HW_3.WriterFile;

import HW.HW_3.Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ReadFile {
    HashMap fileFolder = new HashMap();
    String folderPath = "src/HW/HW_3/File/";
    File folder = new File(folderPath);
    File[] files = folder.listFiles();

    public void readFolder() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        if (files != null) {
            System.out.println();
            System.out.println("Список файлов");
            for (int i = 0; i < files.length; i++) {
                fileFolder.put((i + 1), files[i].getName());
                count += 1;
                System.out.println("Файл №" + (i + 1) + ": " + files[i].getName());
            }
            System.out.println();
            System.out.print("Какой файл хотите прочитать, напишите номер файла или напишите '0' для выхода в меню: ");

            try {
                Controller controller = new Controller();
                int num = scanner.nextInt();
                if (num <= count && num > 0) {
                    System.out.println("Файл - " + files[num].getName());
                    readFile((String) fileFolder.get(num));
                    System.out.println();
                    controller.controller();
                } else if ((num) == 0) {
                    controller.controller();
                } else {
                    System.out.println("Error: Вы ввели неправильный пункт меню. Повторите ввод.");
                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Указанный путь не является папкой или не существует.");
        }
    }

    public void readFile(String string) {
        String path = folderPath + string;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            int count = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println("Запись " + count + ": " + line);
                count += 1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

