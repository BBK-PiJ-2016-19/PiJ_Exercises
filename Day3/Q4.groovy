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
println "Please insert the coordenates of tree points: "

//First point
print "First point, X1: "
String str1 = System.console().readLine()
point1.x= Double.parseDouble(str1)
print "First point, Y1: "
String str2 = System.console().readLine()
point1.y= Double.parseDouble(str2)

//Second point
print "Second point, X1: "
String str3 = System.console().readLine()
point2.x= Double.parseDouble(str3)
print "Second point, Y1: "
String str4 = System.console().readLine()
point2.y= Double.parseDouble(str4)

//Third point
print "Third point, X1: "
String str5 = System.console().readLine()
point3.x= Double.parseDouble(str5)
print "Third point, Y1: "
String str6 = System.console().readLine()
point3.y= Double.parseDouble(str6)

//test
println ""
println "( " + point1.x + ", " + point1.y + " )"
println "( " + point2.x + ", " + point2.y + " )"
println "( " + point3.x + ", " + point3.y + " )"

//I'd like to ask for both coordinates at the same time, same line of input!