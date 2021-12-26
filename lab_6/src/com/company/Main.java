package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Disctionary obj = new Disctionary();
        obj.addWord("I","Я");
        obj.addWord("was","був");
        obj.addWord("wrong","неправий");
        obj.addWord("sorry","вибачте");
        obj.addWord("very","дуже");
        obj.addWord("want","хочу");
        obj.addWord("sixty","шістдесят");
        obj.addWord("points","балів");
        obj.addWord("here","тут");
        Scanner inStr = new Scanner(System.in);
        String eng;
        do {
            System.out.println("Enter word on english:");
            eng = inStr.nextLine();
            System.out.println("Enter translation:");
        } while (!(obj.addWord(eng,inStr.nextLine())));
        String toTranslate = "I was wrong sorry";
        System.out.println("Translation of *" + toTranslate + "* is *" + obj.translate(toTranslate) + "*");
    }
}
