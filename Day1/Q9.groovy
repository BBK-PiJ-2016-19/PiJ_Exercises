// 23/10/16


// Question 9 - Going up!


println ""
println "Insert as many numbers as you wish, if you wish to end the program press '-1'"

boolean ended = false
int previous = -1
String result = ""

while (!ended) {

  print "Insert a number: "
  String str = System.console().readLine()
  int i = Integer.parseInt(str)
  
  if (i == -1) {
    ended = true
  } else if (i == previous + 1 && result != "No") {
      result = "Yes"
  } else if (previous != -1) {
      result = "No"
  }
 
  previous = i
  //println result
  
}

println ""
println result