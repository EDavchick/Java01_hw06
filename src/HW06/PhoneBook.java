package HW06;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    String name1;
    String name2;
    int phone1;
    int phone2;
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
/* add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum. */
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        }
        else {
            ArrayList<Integer> contact = new ArrayList<>();
            contact.add(phoneNum);
            phoneBook.put(name, contact);
        }
    }

    public ArrayList<Integer> find(String name) {
/* find(String name): Поиск номеров телефона по имени в телефонной книге.
Если запись с именем name существует, возвращает список номеров телефона для этой записи.
Если запись с именем name не существует, возвращает пустой список. */
        ArrayList<Integer> phoneNumbers = new ArrayList<>();
        if(phoneBook.containsKey(name)) {
            phoneNumbers = phoneBook.get(name);
        } else {
            return phoneNumbers;
        }
        return phoneNumbers;
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
// getPhoneBook(): Возвращает всю телефонную книгу в виде HashMap,
// где ключи - это имена, а значения - списки номеров телефона.
        HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();

        phoneBook.forEach((key, values) -> {
            values.forEach(val -> {
                if (hashMap.containsKey(val)) {
                    hashMap.get(key).add(val);
                } else {
                    hashMap.put(key, new ArrayList<>((values)));
                }
            });
        });

        return  hashMap;
    }
}
