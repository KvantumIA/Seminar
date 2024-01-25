package Version_2_New;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Добавление контактов
        phoneBook.addContact("Алексеев Алексей Алексеевич", "8-999-111-222-33");
        phoneBook.addContact("Иванов Иван Иванович", "8-999-333-444-55");
        phoneBook.addContact("Алексеев Алексей Алексеевич", "8-999-444-666-77");
        phoneBook.addContact("Сергеев Сергей Сергеевич", "8-999-666-777-99");

        // Вывод контактов
        phoneBook.printPhoneBook();
    }
}
