package Jsoup;
import Lab5.HashText;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.*;

public class Parse {
    public static void ParseHTML() {
        String html = "<html><head><title>First parse</title></head>"
                + "<body><p>Parsed HTML into a doc.</p></body></html>";
        Document doc1 = Jsoup.parse(html);
        System.out.print("HTML: \n" + doc1);
    }

    public static void Title() throws IOException {
        Document doc = Jsoup.connect("https://jobs.dou.ua/").get();
        String title = doc.title();
        System.out.println(title);
    }

    public static void Tag() throws IOException {
        Document tags = Jsoup.connect("https://jsoup.org/").get();
        Elements text = tags.getElementsByTag("Head");
        try (PrintStream out = new PrintStream(new FileOutputStream("result.txt")))
        {
            out.print(tags);
        }

    }
}

