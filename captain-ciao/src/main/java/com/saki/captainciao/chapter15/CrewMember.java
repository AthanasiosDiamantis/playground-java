package com.saki.captainciao.chapter15;

import java.util.Arrays;
import java.util.List;

public class CrewMember {

    enum Profession { CAPTAIN, NAVIGATOR, CARPENTER, COOK, MUSICIAN, DOCTOR}

    String name;
    Profession profession;

    CrewMember(String name, Profession profession) {
        this.name = name;
        this.profession = profession;
    }

    public static void main(String[] args) {
        CrewMember captain = new CrewMember("CiaoCiao", Profession.CAPTAIN);
        CrewMember cook1 = new CrewMember("Remy",  Profession.COOK);
        CrewMember cook2 = new CrewMember("The Witch Cook",  Profession.COOK);
        CrewMember musician1 = new CrewMember( "Mahna Mahna", CrewMember.Profession.MUSICIAN );
        CrewMember musician2 = new CrewMember( "Rowlf", CrewMember.Profession.MUSICIAN );

        List<CrewMember> crew1 = Arrays.asList( cook1, musician1 );
        System.out.println( areSameNumberOfCooksAndMusicians( crew1 ) ); // true

        List<CrewMember> crew2 = Arrays.asList( cook1, musician1, musician2, captain );
        System.out.println( areSameNumberOfCooksAndMusicians( crew2 ) ); // false

        List<CrewMember> crew3 = Arrays.asList( cook1, musician1, musician2, captain, cook2 );
        System.out.println( areSameNumberOfCooksAndMusicians( crew3 ) ); // true
    }



    static boolean areSameNumberOfCooksAndMusicians(List<CrewMember> crewMembers) {

        if(crewMembers == null || crewMembers.size() == 0) {
            return false;
        }
        int numberOfCooks = crewMembers.stream().filter(e -> e.profession == Profession.COOK).toList().size();
        int numberOfMusicians = crewMembers.stream().filter(e -> e.profession == Profession.MUSICIAN).toList().size();
        if(numberOfCooks != numberOfMusicians) {
            return false;
        } else {
            return true;
        }

    }
}
