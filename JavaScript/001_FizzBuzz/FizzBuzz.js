export const fizzBuzzCaller = limit => {
  let resultArray = [];
  let counter = 0;
  while (counter <= limit) {
    let nextNumber = fizzBuzzDecider(counter);
    resultArray.push(nextNumber);
    counter = counter + 1;
    console.log(nextNumber);
  }
  return resultArray;
};

export const fizzBuzzDecider = numberToDecide => {
  if (numberToDecide === 0) {
    return numberToDecide;
  }
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
