//20/10/16


//Question 1 - Ternary operator


println ""
int currentYear = 2016
print "When were you born (year)?"
String str = System.console().readLine();

int birthYear = Integer.parseInt(str);
int ageAprox = currentYear - birthYear;

String result = (ageAprox > 17) ? "" : "not "
println "It seems you are " + result + "an adult."


//Doubt: Why is there some lines with semi-colon and others without it?