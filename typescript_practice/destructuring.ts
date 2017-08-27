// DESTRUCTURING arrays
// splits array into multiple constants

const myHobbies = ["Drums", "Kiscica"];
const [hobby1, hobby2] = myHobbies;
console.log(hobby1);
console.log(hobby2);


// DESTRUCTURING objects

const userData = {userName: "Dani", age: 28};
const {userName, age} = userData;
console.log(userName);
console.log(age);

// ALIASING

const {userName: myName, age: myAge} = userData;
console.log(myName);
console.log(myAge);


// Template literals

const nameOfUser = "Dani";
const greeting = `This is the first line
I'm ${nameOfUser}.
Hey!!!
`;
