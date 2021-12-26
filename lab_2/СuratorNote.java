package Lab2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class СuratorNote {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    private static final ArrayList<СuratorNote> notes = new ArrayList<>();
    private String surname;
    private String name;
    private String birthDate;
    private String phoneNumber;
    private String address;

     public СuratorNote() {
    }

    private СuratorNote(String surname, String name, String birthDate, String phoneNumber, String address) {
        this.surname = surname;
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void addNote() {
        String surname = enterSurname();
        String name = enterName();
        String date = enterBirthDate();
        String phone = enterPhone();
        String address = enterAddress();

        notes.add(new СuratorNote(surname, name, date, phone, address));
    }

    private String enterName() {
        // сприймає Name у такому форматі
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+$");

        String input;
        do {
            System.out.print("Enter name(" + ANSI_BLUE + "Ivan" + ANSI_RESET +"): ");
            input = new Scanner(System.in).nextLine();
        } while (!Pattern.matches(String.valueOf(pattern), input));

        return input;
    }

    private String enterSurname() {
        // сприймає Surname у такому форматі
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+$");

        String input;
        do {
            System.out.print("Enter surname(" + ANSI_BLUE + "Ivanov" + ANSI_RESET +"): ");
            input = new Scanner(System.in).nextLine();
        } while (!Pattern.matches(String.valueOf(pattern), input));

        return input;
    }

    private String enterBirthDate() {
        // сприймає 01.01.2000 у такому форматі
        Pattern pattern = Pattern.compile("^\\d{2}\\.\\d{2}\\.\\d{4}$");

        String input;
        do {
            System.out.print("Enter birth date(" + ANSI_BLUE + "01.01.2001" + ANSI_RESET +"): ");
            input = new Scanner(System.in).nextLine();
        } while (!Pattern.matches(String.valueOf(pattern), input));

        return input;
    }

    private String enterPhone() {
        // сприймає +380443456780 у такому форматі
        Pattern pattern = Pattern.compile("^(\\+?\\d+)?\\s*(\\(\\d+\\))?[\\s-]*([\\d-]*)$");

        String input;
        do {
            System.out.print("Enter phone number(" + ANSI_BLUE + "+380996302604" + ANSI_RESET +"): ");
            input = new Scanner(System.in).nextLine();
        } while (!Pattern.matches(String.valueOf(pattern), input));

        return input;
    }

    private String enterAddress() {
        // сприймає Test, 12a, 1z або Test, 12, 1 у такому форматі
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+, \\d+[a-z]?, \\d+[a-z]?$");

        String input;
        do {
            System.out.print("Enter address(" + ANSI_BLUE + "Turgeneva, 12a, 41" + ANSI_RESET +"): ");
            input = new Scanner(System.in).nextLine();
        } while (!Pattern.matches(String.valueOf(pattern), input));

        return input;
    }


    public void printData() {
        if (notes.isEmpty()) {
            System.out.println("Curator notes is empty");
            return;
        }

        notes.forEach(System.out::println);
    }
    @Override
    public String toString() {
        return "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address+"'";
    }




}