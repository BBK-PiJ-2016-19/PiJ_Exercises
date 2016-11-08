//08/11/16

//Palindrome

println ""
println "Is your name a Palindrome? Let's play and find out! :)"

println ""
print "Please enter your name: "
String str = System.console().readLine();
boolean flag = true

for (i = 1; i < str.length() ; i++) {
	if (str[i-1] != str[-i]) {
		flag = false
		break;
	}
}

if (flag) {
	println "Your name is a palindrome."
} else {
	println "Your name isn't a palindrome."
}