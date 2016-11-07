//07/11/16


println ""
println "\"Couting letters program\""

println ""
print "Please enter some text: "
String str = System.console().readLine()

print "Now, please enter a letter: "
String chr = System.console().readLine()

countChar = 0
i = str.length()

for(i = 0; i < str.length(); i++) {
	if (str[i] == chr) {
		countChar += 1
	} 
}

if (countChar > 0) {
	if (countChar == 1) {
		println "There is " + countChar + " letter 'e' in the text."
	} else {
		println "There are " + countChar + " letters 'e' in the text."
	}
} else {
	println ""
	println "There isn't any letter of type " + chr + "."
}