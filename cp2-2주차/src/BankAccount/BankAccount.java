package BankAccount;

public class BankAccount {

	String name;
	int money, fixedDepositPredict;
	long balance;
	double interest;
	String account;
	
	public BankAccount(String n, long b, double i) {
		name = n;
		balance = b;
		interest = i;
	}
	
	public String getName() {
		return name;
	}

	public long getBalance() {
		return balance;
	}

	public long deposit(long m) {
		balance += m;
		return balance;
	}

	public long withdraw(long m) {
		balance -= m;
		return balance;
	}

	public int installmentSavingPredict(long money, int month) {
		return (int) (balance + money*0.1/12*(month*(month+1)/2)+money*month);
	}

	public long fixedDepositPredict(long money, int month) {
		return balance + (int) (money + money*(Math.pow(1+(interest/12),month)-1));
	}

}
