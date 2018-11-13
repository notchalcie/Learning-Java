package chapter001;

public class BeerSong {

    public static void main(String[] args) {
        int numBeers = 3;
        String wordBeers = "bottles";

        while (numBeers >= 0) {

            if (numBeers > 2) {
                System.out.println(numBeers + " " + wordBeers + " of beer on the wall, " + numBeers + " " + wordBeers + " of beer.");
                System.out.print("Take one down and pass it around, ");
                numBeers--;
                System.out.println(numBeers + " " + wordBeers + " of beer on the wall.\n");
            }

            if (numBeers == 2) {
                System.out.println(numBeers + " " + wordBeers + " of beer on the wall, " + numBeers + " " + wordBeers + " of beer.");
                System.out.print("Take one down and pass it around, ");
                numBeers--;
                wordBeers = "bottle";
                System.out.println(numBeers + " " + wordBeers + " of beer on the wall.\n");
            }

            if (numBeers == 1) {
                System.out.println(numBeers + " " + wordBeers + " of beer on the wall, " + numBeers + " " + wordBeers + " of beer.");
                System.out.print("Take one down and pass it around, no more bottles of beer on the wall.\n");
                numBeers--;
            }

            if (numBeers == 0) {
                System.out.println("\nNo more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
                break;
            }
        }
    }
}
//        3 bottles of beer on the wall, 3 bottles of beer.
//        Take one down and pass it around, 2 bottles of beer on the wall.
//
//        2 bottles of beer on the wall, 2 bottles of beer.
//        Take one down and pass it around, 1 bottle of beer on the wall.
//
//        1 bottle of beer on the wall, 1 bottle of beer.
//        Take one down and pass it around, no more bottles of beer on the wall.
//
//        No more bottles of beer on the wall, no more bottles of beer.
//        Go to the store and buy some more, 99 bottles of beer on the wall.