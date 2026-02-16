package com.saki.java.chapter07.oop;


interface BaseColors {
    int WHITE = 0;
    int BLACK = 1;
    int GREY = 2;
}

interface CarColors extends BaseColors {
    int WHITE = 1;
    int BLACK = 0;
}

interface PlaneColors extends BaseColors {
    int WHITE = 0;
    int GREY = 2;
}

interface FlyingCarColors extends CarColors,PlaneColors {

}


public class Colors {
    public static void main(String[] args) {
        System.out.println(BaseColors.GREY +": grey expects 2");
        System.out.println(CarColors.GREY +": grey expects 2");
        System.out.println(BaseColors.BLACK +": black expects 1");
        System.out.println(CarColors.BLACK +": black expects 1");
        System.out.println(PlaneColors.BLACK +": black expects 1");
//        System.out.println(FlyingCarColors.WHITE +": black expects 0"); // Reference to 'WHITE' is ambiguous, both 'CarColors.WHITE' and 'PlaneColors.WHITE' match
//        System.out.println(FlyingCarColors.GREY +": black expects 0"); // Reference to 'GREY' is ambiguous, both 'BaseColors.GREY' and 'PlaneColors.GREY' match
    }


}
