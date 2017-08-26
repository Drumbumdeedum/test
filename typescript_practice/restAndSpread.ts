// SPREAD operator (...)
// ... spreads out arrays into single values
// turns array of numbers into list of numbers

const numbers = [1, 10, 99, -5];
console.log(Math.max(...numbers));


// REST parameter (... as parameter)
function makeArray(...args: number[]) {
  return args;
}
console.log(makeArray(1, 2, 6));
