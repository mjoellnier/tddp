import { fizzBuzzDecider, fizzBuzzCaller } from "./FizzBuzz";

describe("Testing the FizzBuzz caller: ", () => {
  test("Limit 5", done => {
    expect(fizzBuzzCaller(5)).toStrictEqual([0, 1, 2, "Fizz", 4, "Buzz"]);
    done();
  });
  test("Limit 15", done => {
    expect(fizzBuzzCaller(15)).toStrictEqual([
      0,
      1,
      2,
      "Fizz",
      4,
      "Buzz",
      "Fizz",
      7,
      8,
      "Fizz",
      "Buzz",
      11,
      "Fizz",
      13,
      14,
      "FizzBuzz"
    ]);
    done();
  });
});

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

  test("0 equals 0", () => {
    expect(fizzBuzzDecider(0)).toBe(0);
  });

  test("1, 2 and 4 are plain numbers", () => {
    expect(fizzBuzzDecider(1)).toBe(1);
    expect(fizzBuzzDecider(2)).toBe(2);
    expect(fizzBuzzDecider(4)).toBe(4);
  });
});
