package BankAccount;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount account = new BankAccount("���ؿ�", 300000L, 0.1);
		long money;
		int month;

		System.out.println("���� ������" + account.getName() + "�̰�, �ܾ���" + account.getBalance() + " �Դϴ�.\n");

		// �Ա�
		money = 100000;
		account.deposit(money);
		System.out.println("���¿�" + money + "���� �Ա��Ͽ�, �ܾ���" + account.getBalance() + "���� �Ǿ����ϴ�.");

		// ���
		money = 100000;
		if (account.withdraw(money) < 0) {
			System.out.println("�ܾ��� �����Ͽ� ����� �� �����ϴ�.");
		} else {
			System.out.println("���¿�" + money + "���� ����Ͽ�, �ܾ���" + account.getBalance() + "���� �Ǿ����ϴ�.");
		}

		// ����
		money = 10000;
		month = 12;
		System.out.println("�ſ�" + money + "����" + month + "���� �����ϸ�, �ܾ���" + account.installmentSavingPredict(money, month)
				+ "���� �˴ϴ�.");

		// ���� ����
		money = 2000000;
		month = 24;
		System.out.println(
				money + "����" + month + "���� ���� �����ϸ�, �ܾ���" + account.fixedDepositPredict(money, month) + "���� �˴ϴ�.");
	}

}
