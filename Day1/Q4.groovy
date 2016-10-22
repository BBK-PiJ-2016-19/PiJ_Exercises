//21/10/16


//Question 4 - Prime numbers


println ""
print "Insert a number:"
String str = System.console().readLine()

int i = Integer.parseInt(str)

if (i % 2 == 0) {
  println str + " is not a prime number."
} else {
  println str + " is a prime number."
}