package com.saki.java.chapter07.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Disgusting {
    double disgustingValue();
}

interface Stinky extends Disgusting {
    double olf();
}

interface Likeable {
    void act();
}

interface Assertive {
    void act();
}

public class Politician implements Likeable, Assertive,Stinky,Disgusting {

    public static void main(String[] args) {
        List<Politician> politicies = new ArrayList<Politician>();

    }

    @Override
    public void act() {
        // do something
    }

    @Override
    public double olf() {
        return 3.03;
    }

    @Override
    public double disgustingValue() {
        return 0;
    }
}
