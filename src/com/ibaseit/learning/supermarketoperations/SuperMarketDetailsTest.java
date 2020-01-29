package com.ibaseit.learning.supermarketoperations;

import java.util.HashMap;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class SuperMarketDetailsTest {
	 BussinessLogicSuperMarketOperations operations=new BussinessLogicSuperMarketOperations();
     Map<String, ProductDetails> productPrice = new HashMap<String,ProductDetails>();
     
     

     
     
	@Test
	public void testCreateitem() {
       String pid="p8";
		String pname = "juice";
		double price = 25.0;
		Map<String, ProductDetails> actualProductPrice = operations.addItem( pid, pname, price, productPrice) ;

		productPrice.put("p8",new ProductDetails("p8","juice", 25.0));
		
		Assert.assertEquals(productPrice, actualProductPrice);

	}
	


    @Test
    public void testUpdateitem() {
        
    	 String pid="p4";
            String item = "rice";
            double price = 35.0;
            Map<String,ProductDetails> actualProductPrice = operations.updateItem(pid, item, price, productPrice);
            productPrice.put("p8",new ProductDetails("p8","juice", 55.0));
        
            Assert.assertNotEquals(productPrice,actualProductPrice);


    }


    @Test
    public void testDeleteitem() {
        
    	 String pid="p8";
           String item = "juice";
            double price = 55.0;
           // Map<String,ProductDetails> actualProductPrice = operations.addItem( "p8", "juice", 55.0, productPrice);
            Map<String,ProductDetails> actualProductPrice = operations.addItem( "p7", "orange", 55.0, productPrice);
            
            
            Map<String,ProductDetails> actualProductPrice2 = operations.removeItem("p7", productPrice);
            
           // productPrice.put("p8",new ProductDetails("p8","juice", 55.0));
        
            Assert.assertNotEquals(actualProductPrice,actualProductPrice2);
    }
    

}
 













