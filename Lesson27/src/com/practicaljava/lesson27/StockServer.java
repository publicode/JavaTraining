package com.practicaljava.lesson27;
import java.util.ArrayList;
import java.io.Serializable;

public class StockServer implements Serializable{
	  private String price=null;
	  private ArrayList<String> nasdaqSymbols = new ArrayList<String>();

	  public StockServer() {
	   
	    // Define some hard-coded NASDAQ symbols 
	    nasdaqSymbols.add("AAPL");
	    nasdaqSymbols.add("MSFT");
	    nasdaqSymbols.add("YHOO");
	    nasdaqSymbols.add("AMZN");
	    nasdaqSymbols.add("MOT");
	  }

	  public String getQuote(String symbol) {

	    if(nasdaqSymbols.indexOf(symbol.toUpperCase()) != -1) {

	        // Generate a random price for valid symbols   
	        price = (new Double(Math.random()*100)).toString();
	    }
	    return price;
	  }

	  public ArrayList<String> getNasdaqSymbols() {
	    return nasdaqSymbols;
	  }  
	}

