package main.java.solutions.chapter02.tapedeck;

public class TapeDeckTestDrive {

    public static void main(String[] args) {

        TapeDeck tapeDeck = new TapeDeck();
        tapeDeck.canRecord = true;
        tapeDeck.playTape();

        if (tapeDeck.canRecord == true) {
            tapeDeck.recordTape();
        }
    }
}
