package com.saki.linkedin.oop.shapes;



public class Square extends Rectangle {

    public Square(int squareLength) {
        super(squareLength,squareLength);
    }

    @Override
    public String toString(){
        return "Square with data from " + super.toString();
    }
}
