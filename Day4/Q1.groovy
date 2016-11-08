//08/11/16

//Q1 - Scope

class UnitMatrix {
 
 int size;

 void setSize(int newSize) {
   this.size = newSize;
 }

 void print() {
  for (int i = 0; i < size; i++) {
   for (int j = 0; j < size; j++) {
    if (i == j) {
      println("1 ");
    } else {
      println("0 ");
    }
   }
   println ""
  }
 }
}


println ""
UnitMatrix matrix1 = new UnitMatrix();
UnitMatrix matrix2 = new UnitMatrix();
matrix1.setSize(2);
matrix1.print();
println "-----"
println ""
matrix2.setSize(3);
matrix2.print();


//Visibility
// i --------> inside the outer and inner loop
// j --------> inside the inner loop
// size -----> inside the class
// newSize --> inside the method setSize
