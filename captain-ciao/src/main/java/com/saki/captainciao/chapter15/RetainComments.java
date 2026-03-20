package com.saki.captainciao.chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainComments {

    public static void main(String[] args) {
        String[] diaryEntries = {"A1", "A2", "A3", "A4", "B1", "B2", "B3", "B4", "D1", "D2", "D3", "D4", "C1", "C2", "C3", "C4"};
        List<String> diaryList = new ArrayList<>(Arrays.asList(diaryEntries));
        System.out.println("Initial List: " + Arrays.toString(diaryList.toArray()));
        reduceToComments(diaryList);

    }

    static void reduceToComments(List<String> lines) {
        if (lines.size() % 4 != 0) {
            String exceptionMessage = String.format("actual size of lines is: %d but must be a multiple of 4!", lines.size());
            throw new IllegalArgumentException(exceptionMessage);
        }

        for (int blockStart = lines.size() - 4; blockStart >= 0; blockStart -= 4) {
            lines.remove(blockStart + 2);
            lines.remove(blockStart + 1);
            lines.remove(blockStart);
        }
        System.out.println("job done, only comment lines are left");
        System.out.println(Arrays.toString(lines.toArray()));


    }


}
