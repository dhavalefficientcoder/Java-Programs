//blueprint of class and not definition
class point{
  byte x;
  byte y;
  //initializing function
  void init(byte v1,byte v2){
    x=v1;
    y=v2;
  }
  //print function
  void print(){
    println("x="+x);
    println("y="+y);
  }
}

//creating instance or object of class point
point p1 = new point();
point p2= new point();

//calling for initializing
p1.init((byte)10,(byte)20);
p2.init((byte)30,(byte)40);

//calling for print
p1.print();
p2.print();
