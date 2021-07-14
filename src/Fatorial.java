
public class Fatorial {
	public static void main(String[] args) {
		for (int j = 0; j <= 10; j++) {
			int total = 1;
			for (int i = 1; i <= j; i++) {
				total *= i;
			}
			System.out.println(total);
		}
	}
}
