"use strict";
// SPREAD operator (...)
// ... spreads out arrays into single values
// turns array of numbers into list of numbers
var numbers = [1, 10, 99, -5];
console.log(Math.max.apply(Math, numbers));
