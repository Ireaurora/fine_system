import java.util.Scanner;
public class Fine {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the speeding limit:");
		int speeding_limit = keyboard.nextInt();
		System.out.println("Enter your speed");
		int speed = keyboard.nextInt();
		double final_fine = 0;
		if (speed < speeding_limit) { System.out.println("Your travelling at a legal speed"); }
		if (speed > speeding_limit  && speed < 90) {
			int initial_fine = 100;
			int additional_fine = (5*(speed - speeding_limit));
			final_fine = initial_fine + additional_fine;
			System.out.println("Your travelling at an illegal speed, this is " + "your fine:" +  "£" + final_fine);
		}else if (speed >= 90 ) {
			int initial_fine = 300;
			int additional_fine = (5*(speed - speeding_limit));
			final_fine = initial_fine + additional_fine;
			System.out.println("Your travelling at an illegal speed, this is " + "your fine:"+ "£" + final_fine );
			System.out.println("You can pay in £, $ or €, please choose one");
			String currency  = keyboard.next();
			
			if (currency.equals("€")) {
				double fine_in_euro ;
				fine_in_euro = final_fine  * 1.13;
				System.out.println("You have to pay:" + fine_in_euro + "€");
			}else if (currency.equals("$")) {
				double fine_in_dollars;
				fine_in_dollars = final_fine * 1.30;
				System.out.println("You have to pay: $" + fine_in_dollars );
			}else if (currency.equals("£")) {
				System.out.println("You have to pay: £" + final_fine );
			}
		}		
	}

}
