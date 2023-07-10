import java.util.Random;

public class RandomNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random1 = new Random();
		Random random2 = new Random();
		Random random3 = new Random();
		System.out.println(random1.equals(random2));
		System.out.println(random1.equals(random3));
	}
}
