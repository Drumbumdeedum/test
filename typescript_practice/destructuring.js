"use strict";
// DESTRUCTURING arrays
// splits array into multiple constants
var myHobbies = ["Drums", "Kiscica"];
var hobby1 = myHobbies[0], hobby2 = myHobbies[1];
console.log(hobby1);
console.log(hobby2);
// DESTRUCTURING objects
var userData = { userName: "Dani", age: 28 };
var userName = userData.userName, age = userData.age;
console.log(userName);
console.log(age);
// ALIASING
var myName = userData.userName, myAge = userData.age;
console.log(myName);
console.log(myAge);
// Template literals
var nameOfUser = "Dani";
var greeting = "This is the first line\nI'm " + nameOfUser + ".\nHey!!!\n";
