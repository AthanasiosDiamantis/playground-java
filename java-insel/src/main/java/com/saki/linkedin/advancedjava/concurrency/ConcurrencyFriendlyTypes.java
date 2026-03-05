package com.saki.linkedin.advancedjava.concurrency;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrencyFriendlyTypes {

    static public class AccessCounter {

        // instead of using HashMap in a concurrency situation it is forced to use ConcurrentHashMap<>()
        private final Map<String, Integer> userAccessCounts = new ConcurrentHashMap<>();

        public void incrementAccessCount(String userId) {
            userAccessCounts.compute(userId, (key, val) -> val == null ? 1 : val + 1);
            userAccessCounts.compute("total", (key, val) -> (val == null) ? 1 : val + 1);
        }

        public void printAccessCounts() {
            userAccessCounts.forEach((userId, count) ->
                    System.out.println("User "+userId + "accessed " + count + " times."));
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final AccessCounter accessCounter = new AccessCounter();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Simulate 1000 accesses for User 1 and User 2
        for (int i = 0; i < 1000; i++) {
            String userId1 = "User1";
            executorService.submit( () -> accessCounter.incrementAccessCount(userId1));
            String userId2 = "User2";
            executorService.submit( () -> accessCounter.incrementAccessCount(userId2));
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        accessCounter.printAccessCounts();

    }
}
