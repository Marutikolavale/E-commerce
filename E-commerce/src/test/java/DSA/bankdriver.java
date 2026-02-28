package DSA;

public class bankdriver {

	public static void main(String[] args) {
		Bank b1 = new Bank("maruti kolavale", 123456, 1000);
		b1.display();
		b1.deposit(500);
		b1.display();
		b1.withdrow(8000.0);
		b1.display();
	}
}

class Bank {
	String name;
	long Acno;
	double bal;

	Bank(String name, long Acno, double bal) {
		this.name = name;
		this.Acno = Acno;
		this.bal = bal;
	}

	void display() {
		System.out.println("Customer name  :" + name);
		System.out.println("Account number :" + Acno);
		System.out.println("Account   bal  :" + bal);
		System.out.println("==============================");
	}

	void withdrow(Double amount) {
		if (bal >= amount) {
			bal = bal - amount;
			System.out.println("withdrow done");
		} else {
			System.out.println("insfisant fund");
		}
	}

	void deposit(double Amount) {
		if (Amount > 0) {
			bal += Amount;
			System.out.println("Amount deposit " + Amount);
		} else {
			System.out.println("Enter postive amount");
		}

	}
}
