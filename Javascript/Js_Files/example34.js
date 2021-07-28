var txt = "";
function message() {
	try {
		addalert("Welcome guest!");
	}
	catch(err) {
		txt = "There was an error on this page\n\n";
		txt += "click ok to continue viewing this page\n";
		txt += "or cancel to return to home page\n";
		if(!confirm(txt)) {
			document.location.href = "https://www.w3schools.com/";
		}
	}
}