function Person(first, last, age, eye) {
	this.firstName = first;
	this.lastName = last;
	this.age = age;
	this.eyeColor = eye;
}

const myFather = new Person("john", "doe", 50, "blue");
document.getElementById("demo").innerHTML = "My father is" + myFather.age + ".";
