public class NJTax extends Tax {
	 public double calcTax() {         
	      double  stateTax=0;
	      if (grossIncome < 30000) {
	        stateTax=grossIncome*0.05;
	      }
	      else{
	        stateTax= grossIncome*0.06;
	      } 
	      
	      return stateTax;
	}

}