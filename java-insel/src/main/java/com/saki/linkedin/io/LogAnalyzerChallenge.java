package com.saki.linkedin.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class LogAnalyzerChallenge {

    public static void main(String[] args) {

        String pathToLogFile = "logfile.txt";
        String pathToLogFileReport = "logfileReport.txt";
//        int countINFO = 0;
//        int countDEBUG = 0;
//        int countERROR = 0;

        // this idea came from solution
        Map<String, Integer> logCounts = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(pathToLogFile, StandardCharsets.UTF_8))) {

            for (String line; (line = reader.readLine()) != null; ) {
                String logLevel = line.substring(1, line.indexOf("]"));
                logCounts.merge(logLevel, 1, Integer::sum);

//                if (line.contains("INFO")) {
//                    countINFO++;
//                } else if (line.contains("DEBUG")) {
//                    countDEBUG++;
//                } else if (line.contains("ERROR")) {
//                    countERROR++;
//                } else {
//                    System.out.println("found one line withour criteria");
//                }
            }
//            System.out.printf("count Report: %n'%d' INFO %n'%d' DEBUG %n'%d' ERROR", countINFO, countDEBUG, countERROR);

        } catch (IOException e) {
            System.err.println("Error while reading logfile.txt" + e.getMessage());
            return;
        }

        try(Writer out = new BufferedWriter(new FileWriter(pathToLogFileReport, StandardCharsets.UTF_8 ))) {
            out.write("LogLevel Report Counts: ");
            out.write(System.lineSeparator());
            for(Map.Entry<String, Integer> entry : logCounts.entrySet()) {
                out.write( entry.getKey() + ": " + entry.getValue() + System.lineSeparator());
            }
//            out.write("Count Report: \n");
//            out.write(countINFO + " INFO\n");
//            out.write(countDEBUG + " DEBUG\n");
//            out.write(countERROR +" ERROR\n");
//            out.write(System.lineSeparator());

        } catch (IOException e) {
            System.err.printf("An error occurred while writing to %s with message: %s", pathToLogFileReport, e.getMessage());
        }
    }

}
