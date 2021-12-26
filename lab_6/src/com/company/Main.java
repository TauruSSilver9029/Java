package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Disctionary obj = new Disctionary();
        obj.addWord("I","Я");
        obj.addWord("want","хочу");
        obj.addWord("sixty","шестьдесят");
        obj.addWord("please","пожалуйста");
        obj.addWord("pay","плачу");
        obj.addWord("much","много");
        obj.addWord("for","за");
        obj.addWord("studying","процесс обучения");
        obj.addWord("here","тут");
        Scanner inStr = new Scanner(System.in);
        String eng;
        do {
            System.out.println("Enter word on english:");
            eng = inStr.nextLine();
            System.out.println("Enter translation:");
        } while (!(obj.addWord(eng,inStr.nextLine())));
        String toTranslate = "I want sixty please";
        System.out.println("Translation of *" + toTranslate + "* is *" + obj.translate(toTranslate) + "*");
    }
}
