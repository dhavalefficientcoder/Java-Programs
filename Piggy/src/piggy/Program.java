package piggy;

public class Program {
	
	public static void main() {
		
		GreenPiggy pg1 = new GreenPiggy();	
		RedPiggy pg2= new RedPiggy();
		consumer(pg1);
		consumer(pg2);
		
		}
	
	static void consumer(Piggy pg) {
		pg.deposit(100);
		pg.withdraw(50);
		pg.statment();
	
	}
	
	
}


class GreenPiggy implements Piggy{
	
	private double balance;
	private double lt;
	
	void deposit(double v1) {
	balance+=v1;
	lt=v1;
	}
	
	void statement() {
	System.out.println("Balance="+balance);
	System.out.println("Last Transaction"+lt);
	}
	
	void withdraw(double v2) {
		if (v2>balance) {
			System.out.println("Cannot be Withdrawn");
		}
		else
		{
			balance-=v2;
			lt=-v2;
		}
	}

}

class RedPiggy implements Piggy{
	
	private double current=0;
	private double previous=0;
	
	@override
	void deposit(double v1) {
		current+=v1;
		previous=v1;
		}
		
		void statement() {
		System.out.println("Balance="+current);
		System.out.println("Last Transaction"+previous);
		}
		
		void withdraw(double v2) {
			if (v2>current) {
				System.out.println("Cannot be Withdrawn");
			}
			else
			{
				current-=v2;
				previous=-v2;
			}
		}
	
}
