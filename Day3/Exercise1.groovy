// Set of exercises for lecture 3

//Exercise 1 - Equality of floating-point numbers

//alinea a) - Execute the given program
/*double d1 = 1.255
double d2 = d1 + 7 - 4 -3

if (d1 == d2) {
	println("1.255 is equal to 1.255 plus 7 minus 7");
} else {
	println("1.255 is NOT equal to 1.255 plus 7 minus 7");
}*/

//It will print the first setence - equal
//NOT the right answer!!! Why?


//alinea b) - Print d1 and d2
/*double d1 = 1.255
double d2 = d1 + 7 - 4 -3

println d1
println d2

if (d1 == d2) {
	println("1.255 is equal to 1.255 plus 7 minus 7");
} else {
	println("1.255 is NOT equal to 1.255 plus 7 minus 7");
}*/


//alinea c) - Fix the program
double d1 = 1.255
double d2 = d1 + 7 - 4 -3

println d1
println d2

if (Math.abs(d1 - d2) < 10E-6) {
	println("1.255 is equal to 1.255 plus 7 minus 7");
} else {
	println("1.255 is NOT equal to 1.255 plus 7 minus 7");
}

//Now the output fits what I was expecting! :)