public class BeerSong {

	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";
		String repeatedPhrase = " " + word + " of beer on the wall";

		while (beerNum > 0) {
			if (beerNum > 2) {
				System.out.println(beerNum + repeatedPhrase + ", " + beerNum + " " + word + " of beer.");
				beerNum--;
				System.out.println("Take one down and pass it around, " + beerNum + repeatedPhrase + ".\n");
			}

			else if (beerNum == 2) {
				repeatedPhrase = " " + word + " of beer on the wall";
				System.out.println(beerNum + repeatedPhrase + ", " + beerNum + " " + word + " of beer.");
				word = "bottle";
				repeatedPhrase = " " + word + " of beer on the wall";
				beerNum--;
				System.out.println("Take one down and pass it around, " + beerNum + repeatedPhrase + ".\n");
			}

			else if (beerNum == 1) {
				word = "bottle";
				repeatedPhrase = " " + word + " of beer on the wall";
				System.out.println(beerNum + repeatedPhrase + ", " + beerNum + " " + word + " of beer.");
				System.out.println("Take one down and pass it around, no more bottles of beer on the wall.\n");
				beerNum--;
			}
		}

		System.out.println("No more bottles of beer on the wall, no more bottles of beer.\n"
				+ "Go to the store and buy some more, 99 bottles of beer on the wall.");

		while (beerNum > 0) {
			if (beerNum == 2) {
				System.out.print(beerNum + " " + word + " of beer on the wall, ");
				System.out.println(beerNum + " " + word + " of beer.");
				System.out.print("Take one down and pass it around, ");
				word = "bottle";
				beerNum--;
				System.out.println(beerNum + " " + word + " of beer on the wall.\n");
			}

			if (beerNum == 1) {
				word = "bottle";
			}

			System.out.print(beerNum + " " + word + " of beer on the wall, ");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.print("Take one down and pass it around, ");
			beerNum--;

			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall.\n");
			}

			else {
				System.out.println("no more bottles of beer on the wall.\n");
				System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
				System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
			}
		}
	}
}