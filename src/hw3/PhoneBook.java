package hw3;

import java.util.Objects;

public class PhoneBook {
    private String lastName;
    private String phoneNumber;

    public PhoneBook(String lastName, String phoneNumber) {
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return lastName.equalsIgnoreCase(phoneBook.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName);
    }

    @Override
    public String toString() {
        return String.format("lastName - %s, phone - %s \n", lastName, phoneNumber);
    }
}
