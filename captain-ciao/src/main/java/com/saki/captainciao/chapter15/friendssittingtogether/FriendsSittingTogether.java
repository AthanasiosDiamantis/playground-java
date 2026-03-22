package com.saki.captainciao.chapter15.friendssittingtogether;

import java.util.ArrayList;
import java.util.List;

/**
 * 15.2.4 Essen mit Freunden: Elemente vergleichen,
 * Gemeinsamkeiten finden
 */
public class FriendsSittingTogether {

    public static void main(String[] args) {
        List<Guest> guests = new ArrayList<>();
        guests.add(new Guest(true,false,false));
        guests.add(new Guest(false,true,false));
        guests.add(new Guest(false,false,true));
        guests.add(new Guest(false,false,false));
        guests.add(new Guest(false,false,true));
        guests.add(new Guest(false,false,false));
        guests.add(new Guest(false,false,true));
        guests.add(new Guest(true,true,false));
        guests.add(new Guest(false,true,true));

        System.out.println(allGuestsHaveSimilarInterests(guests));

    }

    static int allGuestsHaveSimilarInterests(List<Guest> guests) {
        if (guests.isEmpty() && guests.size() <= 2) {
            System.out.println("Cycle is to small, we need more persons");
            return -17;
        } else {
            for (int i = 0; i < guests.size() - 1; i++) {
                // checks if each interests doesn't suit, if all 3 interests doesn't suit if clause is entered
                if( !(guests.get(i).likesToShoot == guests.get(i+1).likesToShoot)
                && !(guests.get(i).likesToGamble == guests.get(i+1).likesToGamble)
                && !(guests.get(i).likesToBlackmail == guests.get(i+1).likesToBlackmail)) {
                    return i;
                }

            }
            return -1;
        }
    }


}

