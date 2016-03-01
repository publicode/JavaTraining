package com.practicaljava.lesson25;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.Naming;

public class StartServer {

  public static void main (String args[]) {
	  	  
   try {  
	   
    StockServerImpl ssi = new StockServerImpl();
    Naming.rebind("rmi://localhost:1099/QuoteService",ssi);

    System.out.println("<QuoteService> server is ready.");

   }catch (MalformedURLException e1){
	  System.out.println(e1.getMessage());   
   }catch(RemoteException ex) {
	   ex.printStackTrace();
   }
  }
}
