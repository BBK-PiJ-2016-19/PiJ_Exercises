// 23/10/16


// Question 8 - Maximising


println ""
println "Insert as many numbers as you wish, if you wish to end the program press '-1'"

int flag = 0
int highest = 0

while (flag != -1) {

  print "Insert a number: "
  String str = System.console().readLine()
  int i = Integer.parseInt(str)

  if (i == -1) {
    flag = -1
  } else if (i > highest) {
    highest = i
  } 
}

println ""
println "The highest number is: " + highest