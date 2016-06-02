public class App {
	public static void main(String[] args) {
		long x = 0;
		long y = 1;
		long z = 0;

		while (x + y < 4000000) {
			x += y;
			y += x;
			if (x % 2 == 0) {
				System.out.println(x);
				z += x;
			}
			if (y % 2 == 0) {
				System.out.println(y);
				z += y;
			}
		}
		System.out.println("total : " + z);
	}

}