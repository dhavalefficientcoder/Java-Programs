
package piggyinterface;


public class PiggyInterface {

   public static void main(String[] args) {
   Piggy[] pgl = new Piggy[10];
   GreenPiggy[] gpgl = new GreenPiggy[5];
   for(int i=0;i<gpgl.length;i++) {
       gpgl[i] = new GreenPiggy(i*10);
   }
   for(GreenPiggy v : gpgl) {
      v.statement();
   }
   RedPiggy[] rpgl = new RedPiggy[5];
   for(int i=0;i<rpgl.length;i++) {
      rpgl[i] = new RedPiggy(i*5);
   }
   for(RedPiggy v : rpgl) {
     v.statement();
   }
   // gpgl[0] = rpgl[0]; This will give error.
   for(int i = 0 ; i < 5 ; i++) {
      pgl[i*2] = gpgl[i];
      pgl[i*2+1] = rpgl[i];
   }
   System.out.println("Printing pgl ...");
   for( Piggy p : pgl) {
     p.statement();
   }

 }
}

 interface Piggy{
  void deposit(int v);
  void withdraw(int v);
  void statement(); 
}

class GreenPiggy implements Piggy{
  int balance;
  int lt;
  public GreenPiggy(int v) {
    balance = v;
    lt = v;
  }

  public GreenPiggy() {}
  @Override
  public void deposit(int v) {
     balance = balance + v;
     lt = v;
  }

  @Override
  public void withdraw(int v) {
     if (balance >= v) {
       balance = balance - v;
       lt = -v;
     }
  }

  @Override
  public void statement() {
     System.out.println("Printing Statement");
     System.out.println("Balance = " + balance);
     System.out.println("Last Transaction = " + lt);
  }
}


class RedPiggy implements Piggy {
  int currentbalance;
  int previousbalance;
 
  public RedPiggy(int v) {
    previousbalance = currentbalance; 
    currentbalance = v; 
  }

  public RedPiggy() {}
  @Override
  public void deposit(int v) {
    previousbalance = currentbalance;
    currentbalance = currentbalance + v;
  }
  @Override
  public void withdraw(int v) {
    if(currentbalance >= v) {
      previousbalance = currentbalance;
      currentbalance = currentbalance - v ;
    }
  }
  @Override
  public void statement() {
    System.out.println("Printing Statement");
    System.out.println("Balance = "+ currentbalance);
    System.out.println("Last Transaction = "+ (currentbalance-previousbalance));
  }
}