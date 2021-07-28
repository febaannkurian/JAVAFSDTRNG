const numbers = [45, 4, 9, 16, 25];
let allOver = numbers.every(myFunction);
document.getElementById("demo").innerHTML = "All over is"+allOver;
function myFunction(value, index, array) {
	return value > 18;
}