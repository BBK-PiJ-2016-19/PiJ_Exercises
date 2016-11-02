// 25/10/16


// Q4 - Distance point-to-point


class Point {   
    double x;
    double y;
}

Point point1 = new Point();
Point point2 = new Point();
Point point3 = new Point();

println ""
println "This program outputs the points that are closer."
println ""
println "Please insert the coordenates of three points: "

/*
//First point
print "First point, X1: "
String str1 = System.console().readLine()
point1.x = Double.parseDouble(str1)
print "First point, Y1: "
String str2 = System.console().readLine()
point1.y = Double.parseDouble(str2)

//Second point
print "Second point, X1: "
String str3 = System.console().readLine()
point2.x = Double.parseDouble(str3)
print "Second point, Y1: "
String str4 = System.console().readLine()
point2.y = Double.parseDouble(str4)

//Third point
print "Third point, X1: "
String str5 = System.console().readLine()
point3.x = Double.parseDouble(str5)
print "Third point, Y1: "
String str6 = System.console().readLine()
point3.y = Double.parseDouble(str6)
*/

point1.x = 2.0
point1.y = 2.0

point2.x = 3.0
point2.y = 4.0

point3.x = 6.0
point3.y = 8.0

//test
//println ""
//println "( " + point1.x + ", " + point1.y + " )"
//println "( " + point2.x + ", " + point2.y + " )"
//println "( " + point3.x + ", " + point3.y + " )"

double getDistanceBetweenTwoPoints (Point point1, Point point2){
  // H2 = C2 + C2
  double distance = Math.sqrt(Math.pow((point1.x - point2.x), 2) + Math.pow((point1.y - point2.y), 2))
  return distance
}

double result1 = getDistanceBetweenTwoPoints(point1, point2)
double result2 = getDistanceBetweenTwoPoints(point1, point3)
double result3 = getDistanceBetweenTwoPoints(point2, point3)

if (result1 < result2 && result1 < result3) {
  println "( " + point1.x + ", " + point1.y + " )" + " and " + "( " + point2.x + ", " + point2.y + " )" + " are the closest ones!"
} else if (result2 < result1 && result2 < result3) {
  println "( " + point1.x + ", " + point1.y + " )" + " and " + "( " + point3.x + ", " + point3.y + " )" + " are the closest ones!"
} else {
  println "( " + point2.x + ", " + point2.y + " )" + " and " + "( " + point3.x + ", " + point3.y + " )" + " are the closest ones!"
}

//I'd like to ask for both coordinates at the same time, same line of input!