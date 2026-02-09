package com.saki.java.chapter06.oop;

public class Stereo {

    static final int STANDARD = 1000;
    /*non-static*/ final int standard = 1000;
    public int watt;

    public Stereo() {
        // this(standard); // Cannot reference 'Stereo.standard' before superclass constructor is called
    this(STANDARD);
    }

    public Stereo(int watt) {
        this.watt = watt;
    }


}
