import { fizzBuzzDecider } from "./FizzBuzz";

test("3 equals Fizz", () => {
  expect(fizzBuzzDecider(3)).toBe("Fizz");
});
