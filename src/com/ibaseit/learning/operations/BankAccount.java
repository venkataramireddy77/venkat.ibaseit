package com.ibaseit.learning.operations;


public class BankAccount {
	private String accNumber;
	private double balance;

	public BankAccount(String accNumber, double balance) {
		super();
		this.accNumber = accNumber;
		this.balance = balance;
	}
	
	public String getAccNumber() {
		return accNumber;
	}

	public double getBalance() {
		return balance;
	}

	/*public void close() {
		balance = 0;
	}*/
	/*@Override
	public boolean equals(Object obj) {
		 if(this == obj)
		        return true;

		    // it checks if the argument is of the type Customer by comparing the classes
		    // of the passed argument and this object.
		    // if(!(obj instanceof Customer)) return false; ---> avoid.
		    if(obj == null || obj.getClass()!= this.getClass())
		        return false;

		    // type casting of the argument.
		    BankAccount customer = (BankAccount) obj;
		    if(customer.getAccNumber().equals(this.accNumber) && customer.getBalance()==this.balance)
		        return true;

		    return false;
	}*/


	@Override
	public String toString() {
		return "BankAccount [accNumber=" + accNumber + ", balance=" + balance + "]";
	}

}