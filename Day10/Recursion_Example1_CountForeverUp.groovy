println ""
println "The first little recursion program!"
println ""

print "Insert a positive number between 0 and 15:"
String str = System.console.readLine()
int number = Integer.parseInt(str)

int countForeverUp (int previousCount) {
  int newCount = previousCount + 1;
  pintln newCount;
  //number = newCount
  countForeverUp (newCont); //the method calls itself
}

while (number < 21) { 
  number = countForeverUp(number);
}

// How do I stop this "loop"?
