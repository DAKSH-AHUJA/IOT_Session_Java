package day3;

class BankService
{
	static void withdrawMoney(int balance, int amount) throws Exception{
	checkBalance(balance, amount);
	System.out.println("withdrawal successful");
}
	static void checkBalance(int balance, int amount) throws Exception{
		if (amount>balance) {
			throw new Exception("Insufficient Balance");
		}
		System.out.println("Balance is sufficient");
	}
}
public class Bank {

	public static void main(String[] args) {

		try {
			BankService.withdrawMoney(2000, 5000);
		} catch (Exception e) {
			System.out.println("Transaction Failed: " + e.getMessage());
		}

	}
}