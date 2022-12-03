package com.serenitydojo.model;

public class Feeder {
    public String feeds(String animal, boolean isPremium) {

        if(animal.equals("Cat")){
            if(isPremium)
                return "Salmon";
            else
                return "Food";

        }else if(animal.equals("Dog")){
            if(isPremium)
                return "DeluxeDogFood" ;
            else
                return "Food";


        }else if(animal.equals("Hampster")){
            if(isPremium)
                return "Lettuce";
            else
                return "Food";

        }
        else
            return "Food";
    }
}
