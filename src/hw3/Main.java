package hw3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"cat", "dog", "human", "robot", "apple", "pineapple",
                "robot", "pear", "cat", "peach", "robot", "cat", "dog", "human", "apple", "human"
        };

        Set<String> set = new HashSet<>(Arrays.asList(words));

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            Integer val = map.getOrDefault(word, 0);
            map.put(word, val + 1);
        }

        System.out.println(set);
        System.out.println(map);

        List<PhoneBook> phoneBook = new ArrayList<>();
        phoneBook.add(new PhoneBook("Ivanov", "+78889998888"));
        phoneBook.add(new PhoneBook("Sidorov", "+7999559988"));
        phoneBook.add(new PhoneBook("Petrov", "+7555555555"));
        phoneBook.add(new PhoneBook("Smolnikov", "+756987433"));
        phoneBook.add(new PhoneBook("Ivanov", "+77775552233"));
        phoneBook.add(new PhoneBook("Petrov", "+799999999"));

        String lastName = "Petrov";

        List<PhoneBook> bookList = phoneBook;
        bookList.removeIf(x -> !x.getLastName().equals(lastName));

        Map<String, List<PhoneBook>> mapPhoneBook = new HashMap<>();
        mapPhoneBook.put(lastName, bookList);

        System.out.println(mapPhoneBook.get(lastName));
    }
}
