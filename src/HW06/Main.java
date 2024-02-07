package HW06;
/*
Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами,
их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию
числа телефонов. */
public class Main {
    public static void main(String[] args) {

        String name1;
        String name2;
        String name3;
        int phone1;
        int phone2;
        int phone3;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            name3 = "Petrov";
            phone1 = 123456;
            phone2 = 654321;
            phone3 = 564738;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
            name3 = args[4];
            phone3 = Integer.parseInt(args[5]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);
        myPhoneBook.add(name3, phone3);
        myPhoneBook.add(name1, phone3);

        System.out.println(myPhoneBook.find(name1));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.find("Me"));


    }
}