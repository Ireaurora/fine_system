import java.util.Scanner;
public class ArithmeticOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Insert a number");
			float number_1 = keyboard.nextFloat();
			System.out.print("Insert a number");
			float number_2 = keyboard.nextFloat();
			
			float result_add, result_sub, result_mul, result_div;
			//defining operations 
			result_add = number_1 + number_2;
			
			result_sub = number_1 - number_2;
			
			result_mul = number_1 * number_2;
			
			result_div = number_1 / number_2;
		
			System.out.print("Operation");
			String operation = keyboard.next();
			
			if (operation.equals("Addition") || operation.equals("+")) {
				System.out.println(result_add);
			}else if (operation.equals("Division") || operation.equals("/")) {
				System.out.println(result_div);
			}else if (operation.equals("Subtraction") || operation.equals("-")) {
				System.out.println(result_sub);
			}else if (operation.equals("Multiplication")|| operation.equals("*")) {
				System.out.println(result_mul);
			}
			
			

}
}