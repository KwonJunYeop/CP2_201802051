package BankAccount;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount account = new BankAccount("권준엽", 300000L, 0.1);
		long money;
		int month;

		System.out.println("계좌 주인은" + account.getName() + "이고, 잔액은" + account.getBalance() + " 입니다.\n");

		// 입금
		money = 100000;
		account.deposit(money);
		System.out.println("계좌에" + money + "원을 입금하여, 잔액이" + account.getBalance() + "원이 되었습니다.");

		// 출금
		money = 100000;
		if (account.withdraw(money) < 0) {
			System.out.println("잔액이 부족하여 출금할 수 없습니다.");
		} else {
			System.out.println("계좌에" + money + "원을 출금하여, 잔액이" + account.getBalance() + "원이 되었습니다.");
		}

		// 적금
		money = 10000;
		month = 12;
		System.out.println("매월" + money + "원씩" + month + "개월 적금하면, 잔액이" + account.installmentSavingPredict(money, month)
				+ "원이 됩니다.");

		// 정기 예금
		money = 2000000;
		month = 24;
		System.out.println(
				money + "원을" + month + "개월 정기 예금하면, 잔액이" + account.fixedDepositPredict(money, month) + "원이 됩니다.");
	}

}
