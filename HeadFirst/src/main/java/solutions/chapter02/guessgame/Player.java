package main.java.solutions.chapter02.guessgame;

public class Player {

    int numberGuessed = 0;

    public void guess() {
        numberGuessed = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + numberGuessed);
    }
}
