class TestTax{
     public static void main(String[] args){
        
            NJTax   t = new NJTax(); // creating an instance
            
            t.grossIncome= 50000;  // assigning the values
            t.dependents= 2;
            t.state= "NJ";
                             
            double yourTax = t.calcTax(); //calculating tax 
                            
           // Printing the result 
           System.out.println("Your tax is " + yourTax);
     } 
 }
