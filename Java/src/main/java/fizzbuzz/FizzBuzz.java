package fizzbuzz;

public class FizzBuzz {

	private static FizzBuzz theFizzBuzzer;

	public static FizzBuzz getIt() {
		if (theFizzBuzzer == null) {
			theFizzBuzzer = new FizzBuzz();
		}
		return theFizzBuzzer;
	}

	public String fizzBuzzDecider(int numberToDecide) {
		boolean numberGreaterZero = numberToDecide > 0;
		boolean numberDividableByThree = numberToDecide % 3 == 0;
		boolean numberDividableByFive = numberToDecide % 5 == 0;

		if (numberGreaterZero) {
			if (numberDividableByThree) {
				if (numberDividableByFive) {
					return "FizzBuzz";
				}
				return "Fizz";
			}
			if (numberDividableByFive) {
				return "Buzz";
			}
		}
		return String.valueOf(numberToDecide);
	}

	public String fizzBuzzStageTwoDecider(int numberToDecide) {
		boolean numberGreaterZero = numberToDecide > 0;
		boolean numberDividableByThree = numberToDecide % 3 == 0;
		boolean numberDividableByFive = numberToDecide % 5 == 0;
		boolean numberDividableByThreeAndFive = numberToDecide % 15 == 0;
		boolean numberContainsThree = String.valueOf(numberToDecide).contains("3");
		boolean numberContainsFive = String.valueOf(numberToDecide).contains("5");

		if (numberGreaterZero) {
			if (numberDividableByThreeAndFive) {
				return "FizzBuzz";
			}
			if (numberDividableByThree || numberContainsThree) {
				return "Fizz";
			}
			if (numberDividableByFive || numberContainsFive) {
				return "Buzz";
			}
		}
		return String.valueOf(numberToDecide);
	}

}
