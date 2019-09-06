package fizzbuzz;

public class Runner {

	public static void main(String[] args) {
		int duration = 100;
		for (int i = 0; i <= duration; i++) {
			System.out.println(FizzBuzz.getIt().fizzBuzzDecider(i));
		}

	}

}
