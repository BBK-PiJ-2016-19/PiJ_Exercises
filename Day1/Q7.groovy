// 22/10/16


// Question 7 - Naive sorting


println ""
println "This program sorts the numbers from lowest to highest."
print "Insert the fisrt number: "
String str1 = System.console().readLine()
print "Insert the second number: "
String str2 = System.console().readLine()
print "Insert the third number: "
String str3 = System.console().readLine()

int i = Integer.parseInt(str1)
int j = Integer.parseInt(str2)
int k = Integer.parseInt(str3)

/*
// The highest
int highest = i

if (i > j && i > k) {
  highest
} else if (j > i && j > k) {
  highest = j
} else {
  highest = k
}

println ""
println "The highest number is: " + highest
*/


/*
// 1st attempt
int highest = 0
int middle = 0
int lowest = 0

if (j > i) {
   highest = j
   middle = i
   if (k > middle) {
      middle = K
      lowest = i
   }
}
*/
  

/* 
// 2nd attempt
if (i > j) {
  highest = i
  middle = j
} else {
  highest = j
  middle = i
}
  
if (i > k) {
  middle = i
  lowest = k
} else {
  middle = K
  middle = i
}
*/


// 3rd attempt - and final, Uff!
int highest = 0
int middle = 0
int lowest = 0

if (i > j) {
  highest = i
  middle = j   
} else {
  highest = j
  middle = i
}

if (k > highest) {
  lowest = middle
  middle = highest
  highest = k
} else if (k > middle) {
  lowest = middle
  middle = k
  highest = highest
} else {
   lowest = k 
   middle = middle
   highest = highest
}

println ""
println "The lowest number is: " + lowest
println "The middle number is: " + middle
println "The highest number is: " + highest 







































    
//Doubt: Can't we use break inside an 'if', in Groovy?