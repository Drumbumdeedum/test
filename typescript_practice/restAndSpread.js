"use strict";
// SPREAD operator (...)
// ... spreads out arrays into single values
// turns array of numbers into list of numbers
var testNumbers = [1, 10, 99, -5];
console.log(Math.max.apply(Math, testNumbers));
// REST parameter (... as parameter)
function makeArray() {
    var args = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        args[_i] = arguments[_i];
    }
    return args;
}
console.log(makeArray(1, 2, 6));
