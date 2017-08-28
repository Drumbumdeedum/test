class Person {
  name: string;
  private sex: string;
  protected age: number; //accesible from classes that inherit from this class

  constructor(name: string,
              sex: string,
              age: number,
              public userName: string) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    // dont need username assigned here
  }
}

const person = new Person("Dani", "male", 28, "SzDani");
console.log(person);