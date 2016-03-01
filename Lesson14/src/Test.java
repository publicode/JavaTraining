import java.util.ArrayList;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList customers = new ArrayList();
		Customer cust1 = new Customer("David","Lee");
		customers.add(cust1);
		Customer cust2 = new Customer("Ringo","Starr");
		customers.add(cust2);
		
		Customer theBestCustomer = (Customer) customers.get(0);

	}

}
