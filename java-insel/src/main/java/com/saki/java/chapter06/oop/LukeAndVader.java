package com.saki.java.chapter06.oop;

class Luke {
    Darth dad;
}

class Darth {
    void revealTruthTo(Luke son) {
        son.dad = this;
    }
}

public class LukeAndVader {
    public static void main(String[] args) {
        Luke luke = new Luke();
        Darth darth = new Darth();
        System.out.println(luke.dad); // null
        darth.revealTruthTo(luke);
        System.out.println(luke.dad);

    }

}
