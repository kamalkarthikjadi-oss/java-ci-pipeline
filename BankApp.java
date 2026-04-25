class Account{
	String name;
	s  balance;
	void deposit(int amount){
		balance=balance+amount;
		System.out.println(name+"deposited"+amount);
	}
	void withdraw(int amount){
		balance=balance-amount;
		System.out.println(name+"withdrew"+amount);
	}
	v
		System.out.println("Name"+name);
		System.out.println("Balance"+balance);
	}
}
public class BankApp{
	public static void main(String[] args){
		Account a1=new Account();
		a1.name="kamal";
		a1.balance=0;
		a1.deposit(1000);
		a1.withdraw(200);
		a1.Display();
		
		System.out.println("----------------------");
		Account b1=new Account();
		b1.name="ramu";
		b1.balance=0;
		b1.deposit(2000);
		b1.withdraw(500);
		b1.deposit();
		
	}
}