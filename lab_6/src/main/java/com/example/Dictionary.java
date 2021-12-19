package com.example;

import java.io.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.stream.Collectors;

public class Dictionary {
    private final HashMap<String, String> dictionary;
    private final static String FILE_PATH = "src/main/resources/dictionary.csv";

    public Dictionary() {
        this.dictionary = loadDictionary();
    }

    public Dictionary(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public void put(String key, String value) {
        try (BufferedWriter bufferedFileWriter = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            if (dictionary.get(key) == null) {
                dictionary.put(key, value + "copy");
            } else {
                throw new IllegalArgumentException("Existing pairs");
            }
            bufferedFileWriter.append("\n").append(key).append(",").append(value);
        } catch (FileNotFoundException e) {
            System.err.println("File with path " + FILE_PATH + " was not found");
        } catch (IOException e) {
            System.err.println("Incorrect closed file with path " + FILE_PATH);
        }
    }

    public String get(String key) {
        return this.dictionary.get(key.toLowerCase(Locale.ROOT));
    }

    private static HashMap<String, String> loadDictionary() {
        try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader(FILE_PATH))) {
            return new HashMap<>(bufferedFileReader
                    .lines()
                    .map(s -> s.split(","))
                    .collect(Collectors
                            .toMap(e -> e[0], e -> e[1])));
        } catch (FileNotFoundException e) {
            System.err.println("File with path " + FILE_PATH + " was not found");
        } catch (IOException e) {
            System.err.println("Incorrect closed file with path " + FILE_PATH);
        }
        return null;
    }


}
