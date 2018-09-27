package BankAccount.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import BankAccount.BankAccount;

class BankAccountTest {

	@Test
	void testGetName() {
		BankAccount BankAccount = new BankAccount("±ÇÁØ¿±", 300000, 0.1);
		assertEquals("±ÇÁØ¿±",BankAccount.getName());
	}

	@Test
	void testGetBalance() {
		BankAccount BankAccount = new BankAccount("±ÇÁØ¿±", 300000, 0.1);
		assertEquals(300000, BankAccount.getBalance());
	}

	@Test
	void testDeposit() {
		BankAccount BankAccount = new BankAccount("±ÇÁØ¿±", 300000, 0.1);
		assertEquals(400000, BankAccount.deposit(100000));
	}

	@Test
	void testWithdraw() {
		BankAccount BankAccount = new BankAccount("±ÇÁØ¿±", 300000, 0.1);
		assertEquals(100000, BankAccount.withdraw(200000));
	}

	@Test
	void testInstallmentSavingPredict() {
		BankAccount BankAccount = new BankAccount("±ÇÁØ¿±", 300000, 0.1);
		assertEquals(426500, BankAccount.installmentSavingPredict(10000,12));
	}

	@Test
	void testFixedDepositPredict() {
		BankAccount BankAccount = new BankAccount("±ÇÁØ¿±", 300000, 0.1);
		assertEquals(2740781, BankAccount.fixedDepositPredict(2000000,24));
	}

}
