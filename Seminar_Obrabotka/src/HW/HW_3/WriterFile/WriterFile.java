package HW.HW_3.WriterFile;

import HW.HW_3.Question;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterFile {
    private String path;

    public void saveAsFile(Question question) {
        String directoryPath = "src/HW/HW_3/File/";
        String fileName = question.getFirstName();
        path = directoryPath + fileName;

        try {
            File file = new File(path);
            if (file.createNewFile()) {
                writeToFile(path, question);
                System.out.println("Файл успешно создан и запись сохранена.");
            } else {
                writeToFile(path, question);
                System.out.println("В существующий файл добавлена запись.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Открыть несуществующий файл нельзя, ваш путь к файлу -> " + path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToFile(String path, Question question) {
        try (FileWriter fileWriter = new FileWriter(path, true)) {
            fileWriter.write(question.getFirstName() + ", ");
            fileWriter.write(question.getLastName() + ", ");
            fileWriter.write(question.getSurname() + ", ");
            fileWriter.write(question.getBirthDate() + ", ");
            fileWriter.write(question.getPhoneNumber() + ", ");
            fileWriter.write(question.getGender() + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
