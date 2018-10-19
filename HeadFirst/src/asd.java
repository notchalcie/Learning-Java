public class asd {
	public static void main(String[] args) {
		//firstApp();
		//loopy();
		//doobee();
		test();
	}

	public static void firstApp() {
		System.out.println("I Rule");
		System.out.println("The World!");
	}

	public static void loopy() {
		int[] arr = { 0, 1, 2, 3, 4 };
		boolean flag = true;
		int ctr = 0;

		while (flag) {
			System.out.println("Arr[" + ctr + "]: " + arr[ctr]);
			ctr++;
			if (ctr == 5) {
				flag = false;
				System.out.println("Reached end of loop");
			}
		}
	}

	public static void doobee() {
		int x = 1;
		while (x < 3) {
			System.out.print("Doo");
			System.out.print("Bee");
			x = x + 1;
		}

		if (x == 3) {
			System.out.print("Do");
		}
	}
	public static void test() {
		String jMiddleName = "     puno";
		System.out.println(jMiddleName.trim());
		System.out.println(jMiddleName);
	}
}