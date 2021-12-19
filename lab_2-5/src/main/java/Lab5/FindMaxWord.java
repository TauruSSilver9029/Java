package Lab5;

import java.io.*;
import java.util.*;

public class FindMaxWord {

    public static void main(String[] args) throws IOException {

        // File: Абстрактне представлення імен файлів і каталогів.
        // Отримуємо його вміст, що вкладені підкаталоги та файли
        File file = new File("/Users/maxma/test/src/main/java/Lab5/text.txt");

        // BufferedReader: читає текст із потоку введення символів, буферизуючи
        // символи, щоб забезпечити ефективне читання символів, масивів і рядків.
        BufferedReader bufferedReader = null;
        bufferedReader = new BufferedReader(new FileReader(file));
        String inputLine = null;

        // Map: Об’єкт, який співставляє ключі зі значеннями.
        // Карта не може містити дублікати ключів;
        // кожен ключ може відображати щонайбільше одне значення.
        Map<String, Integer> crunchifyMap = new HashMap<>();

        try {
            while ((inputLine = bufferedReader.readLine()) != null) {

                // split(): Розбиває цей рядок на збіги заданого регулярного виразу.
                String[] words = inputLine.split("[ \n\t\r.,;:!?(){}]");

                for (String word : words) {
                    String key = word.toLowerCase();
                    if (key.length() > 0) {
                        if (crunchifyMap.get(key) == null) {
                            crunchifyMap.put(key, 1);
                        } else {
                            int value = crunchifyMap.get(key).intValue();
                            value++;
                            crunchifyMap.put(key, value);
                        }
                    }
                }
            }

            // Set: Колекція, яка не містить повторюваних елементів.
            // Більш формально, множини не містять пари елементів e1 і e2 таких, що e1.equal (e2),
            // і щонайбільше один нульовий елемент. Як випливає з назви, цей інтерфейс моделі
            // абстракція математичного набору.
            Set<Map.Entry<String, Integer>> entrySet = crunchifyMap.entrySet();
            Print("Words of Occurances:");

            for (Map.Entry<String, Integer> entry : entrySet) {
                try (PrintStream out = new PrintStream(new FileOutputStream("/Users/maxma/test/src/main/java/Lab5/test.txt")))
                {
                    out.print(entrySet);
                }
                Print(entry.getKey() + "\t\t" + entry.getValue());
            }
            List<String> myTopOccurrence = FindMaxOccurrence(crunchifyMap, 1);
            Print("\nМаксимальна кількість слова у файлі: ");

            for (String result : myTopOccurrence) {
                Print("==> " + result);
            }

            // IOException: Signals that an I/O exception of some sort has occurred.
            // This class is the general class of exceptions produced by failed or interrupted I/O operations.
        } catch (IOException error) {
            Print("Invalid File");
        } finally {
            bufferedReader.close();
        }

        System.out.print("\nReader file Result.txt: ");
        HashText.Console();
        System.out.print("\n");
        HashText.Hash();
    }

    private static void Print(String s) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(new FileOutputStream("/Users/maxma/test/src/main/java/Lab5/result.txt")))
        {
            out.print(s);
        }
        System.out.println(s);
    }


    /**
     * @param map = Усі слова на map (карті)
     * @param n = Скільки верхніх елементів ви хочете надрукувати? Якщо n=1, буде надруковано слово з найвищим появою. Якщо n=2 це
     * надрукує 2 найпоширеніших слова.
     * @returns list of String
     */
    public static List<String> FindMaxOccurrence(Map<String, Integer> map, int n) {
        List<Comparable> l = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet())
            l.add(new Comparable(entry.getKey(), entry.getValue()));

        // sort(): Сортує вказаний список у порядку зростання відповідно до природного впорядкування його елементів.
        // Усі елементи в списку повинні реалізовувати інтерфейс Comparable. Крім того, всі елементи в списку повинні бути взаємно порівнянними
        // (тобто e1.compareTo(e2) не повинен викликати виключення ClassCastException для будь-яких елементів e1 та e2 у списку).
        Collections.sort(l);
        List<String> list = new ArrayList<>();

        // subList(): Повертає подання частини цього списку між вказаним fromIndex,
        // включно, а toIndex, виключно. (Якщо fromIndex і toIndex рівні, список повертається порожній.)
        // Повернений список підтримується цим списком, тому неструктурні зміни у поверненому списку відображаються в цьому списку, і навпаки.
        // Повернений список підтримує всі додаткові операції зі списком, які підтримує цей список.
        for (Comparable w : l.subList(0, n))
            list.add(w.wordFromFile + ":" + w.numberOfOccurrence);
        return list;
    }
}

