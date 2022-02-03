package com.company;

public enum continents {
    Eurasia("Евразия"),
    NorthAmerica("Северная Америка"),
    SouthAmerica("Южная Америка"),
    Africa("Африка"),
    Australia("Австралия");

    private final String name;


    public String getName() {
        return "Континент : " +name;
    }

    continents(String name) {
        this.name = name;

    }


}
