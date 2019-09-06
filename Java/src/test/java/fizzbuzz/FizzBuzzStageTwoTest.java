package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("The FizzBuzz Stage 2 Test")
public class FizzBuzzStageTwoTest {

	private FizzBuzz fizzBuzz = FizzBuzz.getIt();

	@DisplayName("Testing Fizz")
	@Test
	public void testFizz() {
		assertEquals("Fizz", fizzBuzz.fizzBuzzStageTwoDecider(3));
		assertEquals("Fizz", fizzBuzz.fizzBuzzStageTwoDecider(6));
		assertEquals("Fizz", fizzBuzz.fizzBuzzStageTwoDecider(9));
		assertEquals("Fizz", fizzBuzz.fizzBuzzStageTwoDecider(13));
		assertEquals("Fizz", fizzBuzz.fizzBuzzStageTwoDecider(53));
		assertEquals("Fizz", fizzBuzz.fizzBuzzStageTwoDecider(83));
	}

	@DisplayName("Testing Buzz")
	@Test
	public void testBuzz() {
		assertEquals("Buzz", fizzBuzz.fizzBuzzStageTwoDecider(5));
		assertEquals("Buzz", fizzBuzz.fizzBuzzStageTwoDecider(10));
		assertEquals("Buzz", fizzBuzz.fizzBuzzStageTwoDecider(20));
		assertEquals("Buzz", fizzBuzz.fizzBuzzStageTwoDecider(52));
		assertEquals("Buzz", fizzBuzz.fizzBuzzStageTwoDecider(58));
		assertEquals("Buzz", fizzBuzz.fizzBuzzStageTwoDecider(154));
	}

	@DisplayName("Testing FizzBuzz")
	@Test
	public void testFizzBuzz() {
		assertEquals("FizzBuzz", fizzBuzz.fizzBuzzStageTwoDecider(15));
		assertEquals("FizzBuzz", fizzBuzz.fizzBuzzStageTwoDecider(30));
		assertEquals("FizzBuzz", fizzBuzz.fizzBuzzStageTwoDecider(45));
	}

	@DisplayName("Testing 'normal' numbers")
	@Test
	public void testNormalNumber() {
		assertEquals("0", fizzBuzz.fizzBuzzStageTwoDecider(0));
		assertEquals("1", fizzBuzz.fizzBuzzStageTwoDecider(1));
		assertEquals("2", fizzBuzz.fizzBuzzStageTwoDecider(2));
		assertEquals("4", fizzBuzz.fizzBuzzStageTwoDecider(4));
	}

}
