import { fizzBuzzDecider } from "./FizzBuzz";

describe("Testing the FizzBuzz decider: ", () => {
  test("3 equals Fizz", () => {
    expect(fizzBuzzDecider(3)).toBe("Fizz");
  });

  test("5 equals Buzz", () => {
    expect(fizzBuzzDecider(5)).toBe("Buzz");
  });

  test("15 equals FizzBuzz", () => {
    expect(fizzBuzzDecider(15)).toBe("FizzBuzz");
  });

  test("1, 2 and 4 are plain numbers", () => {
    expect(fizzBuzzDecider(1)).toBe(1);
    expect(fizzBuzzDecider(2)).toBe(2);
    expect(fizzBuzzDecider(4)).toBe(4);
  });
});
