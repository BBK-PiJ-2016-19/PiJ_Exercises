//22/10/16


//Question 6 - Division (Without using the '/' or '%' operators)


println ""
println "This program calculates the division between two numbers."

print "Insert the first number: "
String str1 = System.console().readLine()
print "Insert the second number: "
String str2 = System.console().readLine()

int i = Integer.parseInt(str1)
int j = Integer.parseInt(str2)

int counter = 1
int subtraction = i - j

while (subtraction >= j) {
  counter++
  subtraction = subtraction - j
}

String result = i + " divided by " + j + " is " + counter + ", remainder " + subtraction
println result