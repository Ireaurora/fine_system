
public class SwapVars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String food  = "Bread";
		String metal = "Steel";
		String temp = "Nothing";
		
		System.out.println ("Before swapping food was:" +food + ", metal was:" 
		+ metal);
		
		temp = food;
	    food  = metal;
	    metal = temp; 
	    
	    System.out.println ("After swapping food is: " + food + " and metal is:" + metal );
	}

}
