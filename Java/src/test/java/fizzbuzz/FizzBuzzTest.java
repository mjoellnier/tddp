package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("The FizzBuzz Test")
public class FizzBuzzTest {

	private FizzBuzz fizzBuzz = FizzBuzz.getIt();

	@DisplayName("Testing Fizz")
	@Test
	public void testFizz() {
		assertEquals("Fizz", fizzBuzz.fizzBuzzDecider(3));
		assertEquals("Fizz", fizzBuzz.fizzBuzzDecider(6));
		assertEquals("Fizz", fizzBuzz.fizzBuzzDecider(9));
	}

	@DisplayName("Testing Buzz")
	@Test
	public void testBuzz() {
		assertEquals("Buzz", fizzBuzz.fizzBuzzDecider(5));
		assertEquals("Buzz", fizzBuzz.fizzBuzzDecider(10));
		assertEquals("Buzz", fizzBuzz.fizzBuzzDecider(20));
	}

	@DisplayName("Testing FizzBuzz")
	@Test
	public void testFizzBuzz() {
		assertEquals("FizzBuzz", fizzBuzz.fizzBuzzDecider(15));
		assertEquals("FizzBuzz", fizzBuzz.fizzBuzzDecider(30));
		assertEquals("FizzBuzz", fizzBuzz.fizzBuzzDecider(45));
	}

	@DisplayName("Testing 'normal' numbers")
	@Test
	public void testNormalNumber() {
		assertEquals("0", fizzBuzz.fizzBuzzDecider(0));
		assertEquals("1", fizzBuzz.fizzBuzzDecider(1));
		assertEquals("2", fizzBuzz.fizzBuzzDecider(2));
		assertEquals("4", fizzBuzz.fizzBuzzDecider(4));
	}

}
