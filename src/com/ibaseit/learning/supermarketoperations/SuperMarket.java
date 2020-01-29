package com.ibaseit.learning.supermarketoperations;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SuperMarket {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		BussinessLogicSuperMarketOperations bto = new BussinessLogicSuperMarketOperations();

		Map<String, ProductDetails> items = new HashMap<String, ProductDetails>();
		items.put("p1", new ProductDetails("p1", "barley", 500.00));
		items.put("p2", new ProductDetails("p2", "bisuits", 50.00));
		items.put("p3", new ProductDetails("p3", "rice", 45.00));
		items.put("P4", new ProductDetails("p4", "sugar", 38.00));

		System.out.println("current elements available  in the map are:" + items);
		System.out.println(items);

		System.out.println("select the  following options to continue");
		System.out.println(" enter 1 for add item \n enter 2 for remove item \n enter 3 for updating items");
		int n = scanner.nextInt();

		switch (n) {
		
		case 1:
			System.out.println("enter your product id : ");
			String pid = scanner.next();
			System.out.println("please enter the item : ");
			String pname = scanner.next();
			System.out.println("enter your product price : ");
			double price = scanner.nextDouble();
			bto.addItem(pid, pname, price, items);
			System.out.println(items);
			break;
		case 2:
			System.out.println("enter your product id : ");
			String pid1 = scanner.next();
			System.out.println("Removing element is:"+bto.removeItem(pid1, items));
			break;
		case 3:
			System.out.println("enter your product id : ");
			String pid3 = scanner.next();
			System.out.println("please enter the item : ");
			String pname2 = scanner.next();
			System.out.println("enter your product price : ");
			double price1 = scanner.nextDouble();
			System.out.println(bto.updateItem(pid3, pname2, price1, items));
			break;
		default:
			System.out.println("exit or please enter valid number");
		}
		scanner.close();

	}
	
}
