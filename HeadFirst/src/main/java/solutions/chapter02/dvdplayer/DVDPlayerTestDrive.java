package main.java.solutions.chapter02.dvdplayer;

public class DVDPlayerTestDrive {

    public static void main(String[] args) {

        DVDPlayer dvdPlayer = new DVDPlayer();
        dvdPlayer.canRecord = true;
        dvdPlayer.playDVD();

        if (dvdPlayer.canRecord == true) {
            dvdPlayer.recordDVD();
        }
    }
}