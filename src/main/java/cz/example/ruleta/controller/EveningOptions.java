package cz.example.ruleta.controller;

public enum EveningOptions {
    WATCH_TV("Sledování TV."),
    GO_FOR_A_WALK("Jít na procházku."),
    PLAY_CARDS("Hrát karty."),
    GO_TO_THE_CINEMA("Jít do kina."),
    GO_TO_THE_PUB("Jít do hospody."),
    SPEND_TIME_IN_BED("Válet se v posteli."),
    TO_EXERCISE("Zacvičit si."),
    PLAY_NINTENDO("Zahrát si na Nintendu."),
    TO_TALK("Povídat si."),
    GLASS_WINE("Dát si víno.");
    private final String description;

    EveningOptions(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
