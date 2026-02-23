package com.saki.java.chapter09.nested;

public class FurnishedHouse {

    private String s = "FurnishedHouse";

    class Room {
        private String s = "Room";

        class Chair {

            private String s = "Chair";

            void output() {
                System.out.println("s = : " + s);
                System.out.println("this.s =  : " + this.s);
                System.out.println("Chair.this.s = " + Chair.this.s);
                System.out.println("Room.this.s = Room ?: " + Room.this.s);
                System.out.println("FurnishedHouse.this.s = " + FurnishedHouse.this.s);
            }
        }
    }

    public static void main(String[] args) {
        new FurnishedHouse().new Room().new Chair().output();
    }


}
