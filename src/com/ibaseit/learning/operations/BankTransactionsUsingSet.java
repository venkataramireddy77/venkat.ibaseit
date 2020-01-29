package com.ibaseit.learning.operations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class BankTransactionsUsingSet {
	Scanner scanner = new Scanner(System.in);
	// BankTransactionsInterface bankTransactionsInterface = new
	// BankTransacImplementation();
	//Set set;
	BussinessLogicForBankTransactionOper bto=new BussinessLogicForBankTransactionOper();
	Set<BankAccount> mainSet = new HashSet<BankAccount>();
	public void transactions() {
		
		BankAccount acc123 = new BankAccount("acc123", 500.00);
		BankAccount acc125 = new BankAccount("acc125", 600.00);
		BankAccount acc124 = new BankAccount("acc124", 600.00);
		BankAccount acc127 = new BankAccount("acc127", 900.00);
		BankAccount acc300 = new BankAccount("acc300", 700.00);

		mainSet.add(acc123);
		mainSet.add(acc125);
		mainSet.add(acc124);
		mainSet.add(acc127);
		mainSet.add(acc300);

		
		System.out.println(mainSet);
		System.out.println("enter your account number");
		String accNum = scanner.next();
		// Iterator value = set.iterator();

		Set<String> com = new HashSet<String>();
		com.add(accNum);

		
		List<BankAccount> load = new CopyOnWriteArrayList<BankAccount>(mainSet);
		System.out.println("select the  following options to continue");
		System.out.println("1.enter 1 for deposit \n 2.enter 2for withdrawal \n 3. 3 enter for remove account");
		//int n = scanner.nextInt();
	/*	if(n==1) {
			double deposit1 = scanner.nextDouble();
			for(BankAccount b:mainSet) {
				double i = b.getBalance()+deposit1;
				if(b.getAccNumber().equals(accNum)) {
					load.remove(b);
					load.add(new BankAccount(accNum, i));
					Set<BankAccount> res = new HashSet<>(load);
					System.out.println(res);
					
				}
			}
		}*/
		 bto. depositAmount( accNum,mainSet);
		/*switch(n)
		{
		case 1:
			   bto. depositAmount(n, accNum,mainSet);
			break;
		case 2:
			bto.withdrawAmount(n, accNum,mainSet);
			break;
		case 3:
			 bto.removeAccount(n, accNum,mainSet);
			  
			break;
			default:
				System.out.println("exit or please enter valid number");
		}*/
		scanner.close();
	}
	
}