class TestTax{
    public static void main(String[] args){
           double grossIncome; // local variables
           String state;
           int dependents;
        
           grossIncome= 50000; 
           dependents= 2;
           state= "NJ";

           Tax   t = new Tax(grossIncome, dependents); 
           // t.grossIncome-22222;

           double yourTax = t.calcTax(); //calculating tax 
                           
          // Printing the result 
          System.out.println("Your tax is " + yourTax);
    } 
}
