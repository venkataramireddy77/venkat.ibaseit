package com.ibaseit.learning.supermarketoperations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import com.ibaseit.learning.operations.BankAccount;

public class BussinessLogicSuperMarketOperations {

	
	Scanner scanner = new Scanner(System.in);

	public Map<String, ProductDetails> addItem(String pid, String pname, double price,
			Map<String, ProductDetails> items2)
	{
		items2.put(pid, new ProductDetails(pid, pname, price));
		return items2;
	}

	
	
	 

	public Map<String, ProductDetails> removeItem(String pid, Map<String, ProductDetails> items2) {
		

		/*String removeEle = pid;
		Set<Entry<String, ProductDetails>> set = items2.entrySet();
		Iterator<Entry<String, ProductDetails>> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

			if (removeEle.equals(itr.next())) {
				itr.remove();
			}
			for (Map.Entry entry1 : items.entrySet()) {
			if (pid.contains((CharSequence) entry1.getKey())) {
				itr.remove();
			}
			
		}
		return (Map<String, ProductDetails>) itr;*/
		items2.remove(pid);
	
		return items2;
		}


	public   Map<String, ProductDetails> updateItem(String pid, String pname, double price, Map<String, ProductDetails> items2) {
		/*Map<String, ProductDetails> items=new HashMap<String, ProductDetails>();;
		//Set set = items2.entrySet<String,ProductDetails>();
		Set set = items2.entrySet();
		List<ProductDetails> load = new CopyOnWriteArrayList<ProductDetails>(set);
		for (ProductDetails b : load) {

			double i = b.getProdPrice();
			

			if (b.getProductId().equals(pid)&&b.getProdPrice()==price&&b.getProductName().equals(pname)) {

				load.remove(b);

				load.add(new ProductDetails(pid, pname, price));
				Set<ProductDetails> res = new HashSet<ProductDetails>();
				System.out.println(res);
				

				// construct key-value pairs 
				for (ProductDetails ob : res) {
					items.put(pid, new ProductDetails(ob.getProductId(),ob.getProductName(), ob.getProdPrice()));
				}
				System.out.println("Map : " + items);
			}
			
		}*/
		
		items2.put(pid,new ProductDetails(pid, pname, price));
		
		
		return  items2;
		 

	}

}
