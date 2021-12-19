package com.example;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException exc) {
            n = ForkJoinPool.getCommonPoolParallelism();
        }
        ExecutorService executorService = new ForkJoinPool(n);
        int value = 10_000_000;
        List<Callable<Integer>> callableList = new LinkedList<>();
        int vc = value / n;
        for (int i = 0; i < n; i++) callableList.add(new MMKCallable(vc));
        long t1 = System.currentTimeMillis();
        int sum = executorService.invokeAll(callableList).stream().mapToInt(e -> {
            try {return e.get();} catch (ExecutionException | InterruptedException ex) {return 0;}
        }).sum();
        long t2 = System.currentTimeMillis();
        System.out.println("PI is " + 4D * sum / value);
        System.out.println("THREADS " + n);
        System.out.println("ITERATIONS " + value);
        System.out.println("TIME " + (t2 - t1) + "ms");
    }

    private static class MMKCallable implements Callable<Integer> {
        int n;

        MMKCallable(int n) {
            this.n = n;
        }

        @Override
        public Integer call() {
            int v = 0;
            for (int i = 0; i < n; i++) {
                double d1 = Math.random();
                double d2 = Math.random();
                if (Math.sqrt(d1 * d1 + d2 * d2) <= 1) v++;

            }
            return v;
        }
    }

}
