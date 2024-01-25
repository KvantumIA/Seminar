package Version_1_Old;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneBook {
    Set<Users> phoneBook = new HashSet<>();


    public Set<Users> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(Set<Users> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void newContact() {
        Users user = new Users();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String line = scanner.nextLine();
        user.setFirstName(line);

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String line2 = scanner2.nextLine();
        user.setLastName(line2);

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Введите отчество: ");
        String line3 = scanner3.nextLine();
        user.setSurname(line3);

        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        String line4 = scanner4.nextLine();
        user.setPhone(line4);

        phoneBook.add(user);
        System.out.println("Контакт успешно создан!");
    }

    public void printBook() {
        Iterator<Users> var = phoneBook.iterator();
        while (var.hasNext()) {
            Users user = var.next();
            System.out.println(user);
        }
    }

    public void findContacts() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО или номер телефона: ");
        String line = scanner.nextLine();
        Iterator<Users> var = phoneBook.iterator();
        boolean contactFound = false;
        while (var.hasNext()) {
            Users user = var.next();
            String[] contacts = String.valueOf(user).split(" ");
            for (String contact : contacts) {
                if (contact.equals(line)) {
                    System.out.println(user);
                    contactFound = true;
                    break;
                }
            }
        }
        if (!contactFound){
            System.out.println("Контакт не найден.");
        }
    }
}
