package com.example;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxBitPrimeNumber(1_000_000_000));
    }

    static int maxBitPrimeNumber(int n) {
        return IntStream
                .rangeClosed(2, n)
                .parallel()
                .filter(e -> BigInteger.valueOf(e).isProbablePrime(0))
                .boxed()
                .max(Comparator.comparingInt(Integer::bitCount))
                .orElse(1);
    }
}
