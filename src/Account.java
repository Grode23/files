import java.io.Serializable;

public class Account implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int account;
	private String name;
	private String surname;
	private double balance;
	
	public Account(int account, String name, String surname, double balance) {
		super();
		this.account = account;
		this.name = name;
		this.surname = surname;
		this.balance = balance;
	}
	
	public String toString() {
		return String.format("%-10s%-12s%-12s%10s%n", account, name, surname, balance);
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
