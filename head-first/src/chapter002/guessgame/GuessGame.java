package chapter002.guessgame;

public class GuessGame {
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();

    public void startGame() {
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 to 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
        }

    }
}
