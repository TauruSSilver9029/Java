package com.company;

import java.util.ArrayList;

public class Main {

/* Серед простих чисел, які не перевищують заданий n, знайти таке,
     в двійковій формі якого максимальна кількість одиниць. Просте
     число – це натуральне число, яке ділиться на 1 та на себе */
//static - Статический метод нельзя переопределить. Это метод, к которому обращаются без создания объекта класса


    public static void main(String[] args) {
        int n =50;
        Integer[] Array1 = PrimeArray(n);
        String [] Array2 = PrimeArrayString (Array1);
        String bin = PrimeStringMaxOne(Array2);
        System.out.println(bin + " - это первое простое число с максимальным количеством '1' в диапазоне : 2.." + n );
    }


    public static Integer[] PrimeArray (int n) // метод принимает верхний предел диапазона нахождения простых чисел, возвращает массив Integer[] простых чисел из диапазона 2..n
    {
        ArrayList<Integer> Primelist = new ArrayList<Integer>(); // создание ArrayList<Integer> для хранения простых чисел из диапазона 2..n
        for (int i = 2 ; i<=n; i++)
        {
            for (int j = 2; j<=i; j++)
            {
                if (j == i) 	Primelist.add(i); // если нашли простое число добавим его в ArrayList<Integer>
                if (i % j == 0) break;  //  если текущие i и j делятся без остатка то выход из внутреннего цикла
            }
        }

        Integer[] PrimeArray = Primelist.toArray(new Integer[Primelist.size()]); // конвертация ArrayList<Integer> в массив Integer[]
        return PrimeArray;
    }



    public static String [] PrimeArrayString (Integer[] PrimeArray) // метод  принимает массив Integer[] простых чисел, возвращает массив String []
    //  простых чисел в бинарной форме
    {
        Integer[] PrimeArray1 = PrimeArray; // присвоение переданного массива Integer[] новому массиву Integer[]
        //for (Integer v : PrimeArray1)
        //  System.out.println(v);

        String [] BinPrimeArray = new String[PrimeArray1.length]; // создание строкового массива String [] для хранения бинарного представления простых чисел

        for (int h=0; h<BinPrimeArray.length; h++)
        {
            BinPrimeArray[h] = Integer.toBinaryString(PrimeArray1[h]);  // конвертация в бинарную форму простых чисел из масива Integer[] и присвоение их массиву String []
            //System.out.println(BinPrimeArray[h]);
        }
        return BinPrimeArray;
    }

    //  метод принимает строковый массив String [] простых чисел в бинарной форме, возвращает -первое- простое число
    //в строковом виде с максимальным количеством едениц в бинарной форме
    public static String PrimeStringMaxOne (String [] BinPrimeArray)
    {
        int[] maxOnes = new int[BinPrimeArray.length]; // инициализируем "0" массив maxOnes в котором будем хранить количество едениц в каждом элементе  строкового массива String []
        for(int i=0;i<maxOnes.length;i++)
            maxOnes[i] = 0;

        for (int i = 0; i < BinPrimeArray.length; i++) // заполняем maxOnes количеством едениц в каждом элементе  строкового массива String []
        {
            for (int j = 0; j < BinPrimeArray[i].length(); j++)
            {
                if(BinPrimeArray[i].charAt(j) == '1')
                    maxOnes[i]++;
            }
        }
        int maxValue = 0;
        int maxIndex = 0;
        for (int k = 0; k < maxOnes.length; k++) // находим индекс массива у которого максимльное количество едениц
        {
            if (maxOnes[k] > maxValue)
            {
                maxValue = maxOnes[k];
                maxIndex = k;
            }
        }
        return BinPrimeArray[maxIndex];  // возвращаем число с максимальным колличеством едениц в строковом виде в бинарной форме
    }
}