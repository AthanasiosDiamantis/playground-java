package com.saki.linkedin.advancedjava.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExample {

    static class DownloadTask implements Runnable {

        private String fileName;
        private int fileSize;

        public DownloadTask(String fileName, int fileSize) {
            this.fileName = fileName;
            this.fileSize = fileSize;
        }

        @Override
        public void run() {
            int downloaded = 0; // only for simulation purposes
            System.out.println("Start downloading " + fileName);

            while ( downloaded < fileSize ) {
                System.out.println("Downloaded " + downloaded + " MB of " + fileSize + " MB");
                downloaded += 10;
                try{
                    Thread.sleep(1200);
                } catch (InterruptedException e) {
                    System.out.println("Download interrupted" + fileName);
                    return;
                }
            }

            System.out.println("Finished downloading " + fileName);

        }
    }

    public static void main(String[] args) {
        DownloadTask task = new DownloadTask("fictional-exmaple.zip", 120);

        Runnable counterRunnable = () -> {
            for (int i = 1; i <= 80; i++) {
                System.out.println("Count: " + i);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                System.err.println("Counter interrupted! "+ e.getMessage());
            }
            }

        };

        try (ExecutorService executorService = Executors.newFixedThreadPool(2)) {
            executorService.submit(task);
            executorService.submit(counterRunnable);

            executorService.shutdown();
        }

    }
}
