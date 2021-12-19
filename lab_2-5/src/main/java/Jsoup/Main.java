package Jsoup;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{
        Parse.Tag();
        File file = new File("/Users/maxma/test/src/main/java/Jsoup/result.txt");

        BufferedReader bufferedReader = null;
        bufferedReader = new BufferedReader(new FileReader(file));
        String inputLine = null;


        Map<String, Integer> crunchifyMap = new HashMap<>();

        try {
            while ((inputLine = bufferedReader.readLine()) != null) {


                String[] words = inputLine.split("[ \n\t\r.,;:!?(){}<>_/-=]");

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

            Set<Map.Entry<String, Integer>> entrySet = crunchifyMap.entrySet();
            Print("--------Tags--------");

            for (Map.Entry<String, Integer> entry : entrySet) {
                try (PrintStream out = new PrintStream(new FileOutputStream("/Users/maxma/test/src/main/java/Jsoup/test.txt")))
                {
                    out.print(entrySet);
                }
                Print(entry.getKey() + "\t\t" + entry.getValue());
            }

        } catch (IOException error) {
            Print("Invalid File");
        } finally {
            bufferedReader.close();
        }
    }

    private static void Print(String s) throws FileNotFoundException {
        System.out.println(s);
    }


    public static List<String> FindMaxOccurrence(Map<String, Integer> map, int n) {
        List<Lab5.Comparable> l = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet())
            l.add(new Lab5.Comparable(entry.getKey(), entry.getValue()));

        Collections.sort(l);
        List<String> list = new ArrayList<>();


        for (Lab5.Comparable w : l.subList(0, n))
            list.add(w.wordFromFile + ":" + w.numberOfOccurrence);
        return list;
    }
}
