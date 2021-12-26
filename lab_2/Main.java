package Lab2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var note = new СuratorNote();
        note.printData();
        boolean flag = true;
        while (flag) {
            System.out.println("1: Add student\n2: Print curator notes\n0: Exit");
            int input = new Scanner(System.in).nextInt();

            switch (input) {
                case 1 -> note.addNote();
                case 2 -> note.printData();
                case 0 -> flag = false;
                default -> System.out.println("Choose correct option");
            }
        }
    }
}



