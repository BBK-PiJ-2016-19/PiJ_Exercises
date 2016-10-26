// 25/10/16 (Cont.)


// Q2 - Calculator


println ""
println "Calculator"
println ""

print "Please insert the first number: "
String str1 = System.console().readLine()
double d1 = Double.parseDouble(str1)
print "Please insert the second number: "
String str2 = System.console().readLine()
double d2 = Double.parseDouble(str2)

println "Menu:"
println "1. Addition"
println "2. Subraction"
println "3. Multiplication"
println "4. Division"

print "Select the operation (1-4) from the menu: "
String str3 = System.console().readLine()
int i = Integer.parseInt(str3)

double result = 0.0
String operation = ""

if (i == 1 ){
  result = d1 + d2
  operation = "addition"
} else if (i == 2) {
  result = d1 - d2
  operation = "subtraction"
} else if (i == 3) {
  result = d1 * d2
  operation = "multiplication"
} else {
  result = d1 / d2
  operation = "division"
}

println "The result of the " + operation + " is: " + result