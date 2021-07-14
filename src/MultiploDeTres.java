
public class MultiploDeTres {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i += 3) {
			if (i > 0)
				System.out.println(i);
		}

		System.out.println("\n");

		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0 && i > 0)
				System.out.println(i);
		}
	}
}
