package com.collection;

import java.util.HashMap;

class Account {
	private int accountNumber;
	private String accountHolderName;

	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	@Override
	public String toString() {
		return "" + accountNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
		return true;
	}


	
}

public class CustomHashMapKey {
	public static void main(String[] args) {

		HashMap<Account, String> map = new HashMap<Account, String>();

		Account a = new Account(1);
		a.setAccountHolderName("Amol");

		Account a2 = new Account(2);
		a2.setAccountHolderName("Roy");

		map.put(a, a.getAccountHolderName());
		map.put(a2, a2.getAccountHolderName());

		System.out.println(map);
	
		Account a3 = new Account(1);
		a3.setAccountHolderName("Priya");

		map.put(a3, a3.getAccountHolderName());
		System.out.println(map);
		
		Account a4 = new Account(1);
		a4.setAccountHolderName("Kriya");
		
		System.out.println(map.get(a4));
	}
}
