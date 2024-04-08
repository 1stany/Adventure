package org.generation.italy.adventure.model;

public enum Cardinal {
    EST, NORD,  SUD, OVEST;

    public Cardinal opposite(){
        return switch (this) {
            case EST -> OVEST;
            case OVEST -> EST;
            case NORD -> SUD;
            case SUD -> NORD;
        };
    }
}
