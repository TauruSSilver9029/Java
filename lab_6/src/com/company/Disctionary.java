package com.company;

import java.util.HashMap;

public class Disctionary {
    private HashMap<String, String> db = new HashMap<>();
    public boolean addWord(String Eng, String Rus)
    {
        for (int i = 0;i<Eng.length();i++)
        {
            if (!(((int) Eng.toCharArray()[i] < 91 && (int) Eng.toCharArray()[i] > 64) || ((int) Eng.toCharArray()[i] < 123 && (int) Eng.toCharArray()[i] > 96)))
            {
                System.out.println("You entered wrong english word");
                return false;
            }

        }
        for (int i = 0;i<Rus.length();i++)
        {
            if (!(((int) Rus.toCharArray()[i] < 1104 && (int) Rus.toCharArray()[i] > 1039) || ((int) Rus.toCharArray()[i] == 32)))
            {
                System.out.println("You entered wrong translation");
                return false;
            }
        }
        if (db.containsKey(Eng))
        {
            System.out.println("You are trying to add an existing word!");
            return false;
        }
        else
        {
            db.put(Eng,Rus);
            System.out.println("You entered word "+ Eng + " that means " + db.get(Eng));
            return true;
        }
    }
    public String translate(String phrase)
    {
        String outp = "";
        String[] Eng = phrase.split(" ");
        String[] Rus = new String[Eng.length];
        for (int i = 0; i<Eng.length;i++)
            outp += db.get(Eng[i]) + " ";
        return outp;
    }
}
