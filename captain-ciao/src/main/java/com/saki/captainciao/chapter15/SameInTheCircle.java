package com.saki.captainciao.chapter15;

import java.util.ArrayList;
import java.util.Arrays;
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

        List<String> names3 = new ArrayList<>(Arrays.asList("Anne", "Henry", "Alexandre", "Charles"));
        List<String> names4 = new ArrayList<>(Arrays.asList("Alexandre", "Charles", "Anne", "Henry"));

        List<String> names5 = new ArrayList<>(Arrays.asList("Alexandre", "Charles", "Anne", "Henry"));
        List<String> names6 = new ArrayList<>(Arrays.asList("Alexandre", "Charles", "Henry", "Anne"));

        List<String> names7 = new ArrayList<>(Arrays.asList("Anne", "Henry", "Alexandre", "Charles"));
        List<String> names8 = new ArrayList<>(Arrays.asList("Alexandre", "William", "Anne", "Henry"));




    }

    static boolean isSameCircel(List<String> names1, List<String> names2) {

        int paralaxDiffBefore = 0;
        int paralaxDiffAfter = 0;

        for(int i = 0; i < names1.size(); i++){

            for(int j = 0; j < names2.size(); j++){
                if(names1.get(i).equals(names2.get(j))){
                    paralaxDiffBefore = Math.abs(j-i);
                    //TODO: how can I compute the difference between the id-positions and break at the correct moment

                }
            }

        }


        return true; //TODO: change to correct solution
    }

}
