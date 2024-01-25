package Version_2_New;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        if (phoneBook.containsKey(name)) {
            ArrayList<String> phones = phoneBook.get(name);
            phones.add(phone);
        } else {
            ArrayList<String> phones = new ArrayList<>();
            phones.add(phone);
            phoneBook.put(name, phones);
        }
    }

    public void printPhoneBook() {
        ArrayList<Map.Entry<String, ArrayList<String>>> list = new ArrayList<>(phoneBook.entrySet());
        list.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        for (Map.Entry<String, ArrayList<String>> entry : list) {
            String name = entry.getKey();
            ArrayList<String> phoneNumbers = entry.getValue();

            System.out.println(name + ": " + phoneNumbers);
        }
    }
}