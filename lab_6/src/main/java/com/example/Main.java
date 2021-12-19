package com.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        Dictionary dictionary = new Dictionary();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("1: put translate");
            System.out.println("2: translate word");
            System.out.println("3: exit");
            label:
            while (true) {
                System.out.println("Enter value:");
                switch (scanner.nextLine().strip()) {
                    case "1": {
                        System.out.println("Enter a word pairs (For example, hello привіт):");
                        try {
                            dictionary.put(scanner.next(), scanner.next());
                        } catch (Exception exc) {
                            System.err.println("This pair is exists");
                        } finally {
                            scanner.nextLine();
                        }
                        break;
                    }
                    case "2": {
                        System.out.println("Enter a word to translate:");
                        System.out.println("Translate: " + dictionary.get(scanner.next()));
                        break;
                    }
                    case "3": {
                        break label;
                    }
                }
            }
        }
    }
}
