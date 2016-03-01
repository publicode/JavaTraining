
public class Girlfriends2 {

	public static void main(String[] args) {
		String []  friends = new String [20];  // Declare and instantiate array
		friends[0] = "Masha";                  //Initialize the first element
		friends[1] = "Matilda";                //Initialize the second element
		friends[2] = "Rosa";
		friends[18] = "Hillary";
		friends[19] = "Natasha";
		 
		int  totalElements = friends.length;
		int i=0;
		
		for (i=0; i<totalElements;i++){
		   System.out.println("I love " + friends[i]);
		}
		
	
		System.out.println("The iteration is over");
	}
}