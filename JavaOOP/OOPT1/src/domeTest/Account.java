package domeTest;

public class Account {
	private long carid;
	private double balance=0;
	
	public long getCarid() {
		return carid;
	}
	public void setCarid(long carid) {
		this.carid = carid;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double qu(double money) {
		if (money>balance) {
			System.out.println("���㣡");
			return balance;
		}else {
			balance-=money;
			return balance;
		}
	}
	
	public double cun(double money) {
		balance+=money;
		return balance;
	}
	
	public void showBalance() {
		System.out.printf("����%s�е����Ϊ��%.2f",carid,balance);
	}
}
