//description of class
class piggybank{
  double balance=10;
  double lt=5;

  //constructor
  piggybank(double v1,double v2){
  println("Entring constructor 1");
  this.balance=v1;
  this.lt=v2;
  println("Leaving constructor 1");
  }

  //constructor overloading-default
  piggybank(){
  //piggybank(100,100);
  }

  //constructor overloading
  piggybank(double v1){
  balance =v1;
  }
}

//creating object pg1
piggybank pg1 = new piggybank();
println(pg1.balance);
println(pg1.lt);

//creating object pg2
piggybank pg2 = new piggybank(10,20);
println(pg2.balance);
println(pg2.lt);

//creating object pg3
piggybank pg3 = new piggybank(100);
println(pg3.balance);
println(pg3.lt);
