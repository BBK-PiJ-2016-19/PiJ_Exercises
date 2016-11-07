//07/11/16

println ""
println "\"Couting letters program\""

println ""
print "Please enter some text: "
String str = System.console().readLine()

countLetterE = 0
i = str.length()

for(i = 0; i < str.length(); i++) {
	if (str[i] == "e") {
		countLetterE += 1
	} 
}

if (countLetterE > 0) {
	if (countLetterE == 1) {
		println "There is " + countLetterE + " letter 'e' in the text."
	} else {
		println "There are " + countLetterE + " letters 'e' in the text."
	}
} else {
	printlln " There isn't any letter of type 'e'."
}