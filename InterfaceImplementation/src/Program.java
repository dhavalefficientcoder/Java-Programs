interface Communication{
  void send(String str);
  String receive();
}

class Satellite implements Communication{
  @Override
  public void send(String str) {
   System.out.println("Entering send of Satellite");
   System.out.println(" Sending data...." + str);
   System.out.println("Leaving send of Satellite");
 }
  @Override
 public String receive() {
  String data = null;
  System.out.println("Entering receive of Satellite");
  System.out.println(" Receiving Data from Remote source ");
  System.out.println("Leaving receive of Satellite");
  return data;
 }
}

class FibreOptic implements Communication{
  @Override
  public void send(String str) {
   System.out.println("Entering send of FibreOptic");
   System.out.println(" Sending data...." + str);
   System.out.println("Leaving send of FibreOptic");
 }
  @Override
 public String receive() {
   String data = null;
   System.out.println("Entering receive of FibreOptic");
   System.out.println(" Receiving Data from Remote source ");
   System.out.println("Leaving receive of FibreOptic");
   return data;
 }
}


class Client1{
  static void UseSatellite(Satellite s) {
   s.send("Hello");
   s.receive();
  }
}

class Client2{
  static void UseFibreOptic(FibreOptic s) {
   s.send("Hello");
   s.receive();
  }
}

class Client3{
  static void UseCommunication(Communication s) {
   s.send("Hello");
   s.receive();
  }
}

public class Program {

 public static void main(String[] args) {
  System.out.println("Entering Main");
  System.out.println("Welcome to the Concept of Interface");
  Satellite s = new Satellite();
  Client1.UseSatellite(s);
  FibreOptic f = new FibreOptic();
  Client2.UseFibreOptic(f);
  Client3.UseCommunication(s);
  Client3.UseCommunication(f);
  System.out.println("Leaving Main");
 }

}