package com.saki.java.chapter06.oop;

public class RoomDemo {

    public static void main(String[] args) {
        Room roomVangeli = new Room("vangeliRoom", 16);
        System.out.println(roomVangeli.getName());
        System.out.println(roomVangeli.getSize());
        System.out.println(roomVangeli);

        roomVangeli = roomVangeli.withName("leoRoom");
        roomVangeli = roomVangeli.withSize(32);
        System.out.println(roomVangeli.getName());
        System.out.println(roomVangeli.getSize());
        System.out.println(roomVangeli);


    }
}
