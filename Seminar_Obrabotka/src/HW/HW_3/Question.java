package HW.HW_3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question {
    private String[] inputQuestion;
    private String firstName;
    private String lastName;
    private String surname;
    private String gender;
    private String birthDate;
    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void question() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите ФИО, дату рождения в формате дд.мм.гггг, пол (м или ж), номер телефона без знаков препинания: ");
            String inputAnswer = scanner.nextLine();
            inputQuestion = inputAnswer.split(" ");
            processInput(inputQuestion);
            examination();
        } catch (InCorrectBirthdate | InCorrectPhoneNumber | InCorrectFIO |
                 InCorrectGender e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.exit(1);
        }
    }

    public void processInput(String[] inputQuestion) {
        if (inputQuestion.length == 6) {
            for (String input : inputQuestion) {
                if (isValidDate(input)) {
                    if (isValidDateYear(input)) {
                        birthDate = input;
                    }
                } else if (containsDigits(input)) {
                    phoneNumber = input;
                } else if (isValidGender(input)) {
                    gender = input;
                } else {
                    if (firstName == null && input.matches("[а-яА-Я]{2,99}")) {
                        firstName = input;
                    } else if (lastName == null && input.matches("[а-яА-Я]{2,99}")) {
                        lastName = input;
                    } else if (surname == null && input.matches("[а-яА-Я]{2,99}")) {
                        surname = input;
                    }
                }
            }
        }
        if (inputQuestion.length < 6) {
            System.out.println("Вы ввели меньшее количество ответов!");
        }
        if (inputQuestion.length > 6) {
            System.out.println("Вы ввели большее количество ответов!");
        }
    }

    private boolean containsDigits(String str) {
        return str.matches(".*\\d{11}.*");
    }

    private boolean isValidDate(String date) {
        String regex = "\\d{2}\\.\\d{2}\\.\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    private boolean isValidDateYear(String date) {
        String[] parts = date.split("\\.");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        if (((year >= 1933) && (year <= 2022)) && (day >= 1 && day <= 31) && (month >= 1 && month <= 12)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isValidGender(String gender) {
        if (gender.matches("[мж]{1}")) {
            return true;
        }
        return false;
    }

    public void examination() {
        if (firstName == null) {
            throw new InCorrectFIO();
        }
        if (lastName == null) {
            throw new InCorrectFIO();
        }
        if (surname == null) {
            throw new InCorrectFIO();
        }
        if (birthDate == null) {
            throw new InCorrectBirthdate();
        }
        if (phoneNumber == null) {
            throw new InCorrectPhoneNumber();
        }
        if (gender == null) {
            throw new InCorrectGender();
        }
    }
}
