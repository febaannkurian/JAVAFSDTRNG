const time = new Date().getHours();
let greeting;
if(time < 10) {
	greeting = "Good morning";
	
} else if (time < 20) {
	greeting = "good day";
} else {
	greeting = "good evening";
}
document.getElementById("demo").innerHTML = greeting;