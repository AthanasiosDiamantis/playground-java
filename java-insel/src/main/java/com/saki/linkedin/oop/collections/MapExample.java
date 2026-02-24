package com.saki.linkedin.oop.collections;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {

        // stores kay value pairs
        var animalSounds = new HashMap<String, String>();

        animalSounds.put("Dog", "Bark");
        animalSounds.put("Cat", "Meow");
        animalSounds.put("Mouse", "Squeak");

        System.out.println(animalSounds);

        // overrides Cat with sound
        animalSounds.put("Cat", "Purr");
        System.out.println(animalSounds);

        // returns the value
        System.out.println(animalSounds.get("Cat"));
        // what if key doesnt exist
        System.out.println(animalSounds.get("Tiger"));

        System.out.println(animalSounds.containsKey("Cat"));
        System.out.println(animalSounds.containsKey("Tiger"));

        System.out.println(animalSounds.containsValue("Bark"));

        for(var animal : animalSounds.keySet()){
            System.out.println("Animal: " + animal + " makes the following sound: " + animalSounds.get(animal));
        }
    }
}
