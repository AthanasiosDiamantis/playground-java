package com.saki.captainciao.chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SameInTheCircle {


    //Beispiele:
    //Liste 1: Alexandre, Charles, Anne, Henry. Liste 2: Alexandre, Charles, Anne, Henry →
    //stimmen überein
    //Liste 1: Anne, Henry, Alexandre, Charles, Liste 2: Alexandre, Charles, Anne, Henry →
    //stimmen überein
    //Liste 1: Alexandre, Charles, Anne, Henry. Liste 2: Alexandre, Charles, Henry, Anne →
    //stimmen nicht überein
    //Liste 1: Anne, Henry, Alexandre, Charles, Liste 2: Alexandre, William, Anne, Henry →
    //stimmen nicht überein

    public static void main(String[] args) {
        List<String> names1 = new ArrayList<>(Arrays.asList("Alexandre", "Charles", "Anne", "Henry"));
        List<String> names2 = new ArrayList<>(Arrays.asList("Alexandre", "Charles", "Anne", "Henry"));
        System.out.println(isSameCircel(names1, names2));

        List<String> names3 = new ArrayList<>(Arrays.asList("Anne", "Henry", "Alexandre", "Charles"));
        List<String> names4 = new ArrayList<>(Arrays.asList("Alexandre", "Charles", "Anne", "Henry"));
        System.out.println(isSameCircel(names3, names4));

        List<String> names5 = new ArrayList<>(Arrays.asList("Alexandre", "Charles", "Anne", "Henry"));
        List<String> names6 = new ArrayList<>(Arrays.asList("Alexandre", "Charles", "Henry", "Anne"));
        System.out.println(isSameCircel(names5, names6));

        List<String> names7 = new ArrayList<>(Arrays.asList("Anne", "Henry", "Alexandre", "Charles"));
        List<String> names8 = new ArrayList<>(Arrays.asList("Alexandre", "William", "Anne", "Henry"));
        System.out.println(isSameCircel(names7, names8));


    }

    static boolean isSameCircel(List<String> names1, List<String> names2) {

        List<String> dublicatedList = new ArrayList<>(names1);
        dublicatedList.addAll(names1); // I dublicate the list just for next check with sublist method

        int positionOfDuplicationIndex = Collections.indexOfSubList(dublicatedList, names2); // if -1 = false
        return positionOfDuplicationIndex > -1;
    }
    // my former solution did not work correct
//    static boolean isSameCircel(List<String> names1, List<String> names2) {
//
//        int paralaxDiffCurrent = 0;
//        int paralaxDiffBefore = 0;
//
//        for (int i = 0; i < names1.size(); i++) {
//
//            for (int j = 0; j < names2.size(); j++) {
//                if ((names1.get(i)).equals(names2.get(j))) {
//                    paralaxDiffCurrent = Math.abs(j - i);
//                }
//            }
//            if (paralaxDiffCurrent != paralaxDiffBefore) {
//                return false;
//            }
//            paralaxDiffBefore = paralaxDiffCurrent;
//        }
//        return true;
//    }

}
