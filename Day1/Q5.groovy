//21/10/16


//Question 5 - Multiplication


/*
println ""
println "This program calculates the product between 2 numbers."

print "Insert the first number: "
String str1 = System.console().readLine()
print "Insert the second number: "
String str2 = System.console().readLine()

int i = Integer.parseInt(str1)
int j = Integer.parseInt(str2)

int product = i * j
println "The product is: " + product
*/


//Other version - without "*"
println ""
println "This program calculates the product between 2 numbers."

print "Insert the first number: "
String str1 = System.console().readLine()
print "Insert the second number: "
String str2 = System.console().readLine()

int i = Integer.parseInt(str1)
int j = Integer.parseInt(str2)

int product = 0 // Have to assign the var 'product', and outside the for loop

for (count=0; count<j; count++) {
  product += i;
}

println "The product is: " + product