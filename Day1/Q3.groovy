//20/10/16


//Question 3 - Yet another loop


/*
String str = System.console().readLine()
int i = Integer.parseInt(str)

while(i < 10) {
  i++;
  str = System.console().readLine()
  int j = Integer.parseInt(str)
  if(j == 0) {
    break; 
  } else if (j != 1) {
    println j;
  }
}

println "finished"
*/


//Other version

print "Insert a number:"
String str = System.console().readLine()
int i = Integer.parseInt(str)

while(i < 10) {
  i++;
  print "Insert another number:"
  str = System.console().readLine()
  int j = Integer.parseInt(str)
  if(j == 0) {
    break; 
  } else if (j != 1) {
    println j;
  }
}

println i
println "finished"