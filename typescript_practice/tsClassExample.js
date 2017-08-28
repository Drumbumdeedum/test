"use strict";
var Person = (function () {
    function Person(name, sex, age, userName) {
        this.userName = userName;
        this.name = name;
        this.sex = sex;
        this.age = age;
        // dont need username assigned here
    }
    return Person;
}());
var person = new Person("Dani", "male", 28, "SzDani");
console.log(person);
