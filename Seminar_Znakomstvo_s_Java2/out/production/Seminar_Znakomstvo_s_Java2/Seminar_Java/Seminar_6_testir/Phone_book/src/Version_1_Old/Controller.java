package Version_1_Old;

import java.util.Scanner;

public class Controller {
    PhoneBook phoneBook = new PhoneBook();
    public void menuBook(){
        System.out.println("1. Записать новый контакт. \n" +
                "2. Найти контакт. \n" +
                "3. Вывести на экран все контакты. \n" +
                "4. Выход.");
    }
    public void phoneBook() {
        menuBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите число: ");
        int line = scanner.nextInt();
        switch (line) {
            case 1:
                phoneBook.newContact();
                questionMenu();
                break;
            case 2:
                phoneBook.findContacts();
                questionMenu();
                break;
            case 3:
                System.out.println("Фамилия | Имя | Отчество | Номер телефона");
                phoneBook.printBook();
                questionMenu();
                break;
            case 4:
                System.exit(1);
                break;
            default:
                System.out.println("Вы неверно ввели пункт меню. Попробуйте еще раз.");
        }
    }

    public void questionMenu(){
        System.out.println("1. Продолжить? 2. Выход.");
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        switch (line){
            case 1:
                phoneBook();
                break;
            case 2:
                System.exit(1);
            default:
                System.out.println("Вы неверно ввели пункт меню. Попробуйте еще раз.");
        }
    }

}
