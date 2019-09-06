export const fizzBuzzCaller = limit => {
  return null;
};

export const fizzBuzzDecider = numberToDecide => {
  let dividableByThree = numberToDecide % 3 === 0;
  let dividableByFive = numberToDecide % 5 === 0;
  if (dividableByThree) {
    if (dividableByFive) {
      return "FizzBuzz";
    }
    return "Fizz";
  }
  if (dividableByFive) {
    return "Buzz";
  }
  return numberToDecide;
};
