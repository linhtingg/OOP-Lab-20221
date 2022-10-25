package tonghieutich;
import java.util.Scanner;
public class main {
	
	 public static void main(String[] args) {
	  Scanner num = new Scanner(System.in);
	   
	  System.out.print("Input first number: ");
	  double num1 = num.nextInt();
	   
	  System.out.print("Input second number: ");
	  double num2 = num.nextInt();
	   
	 
	  System.out.println(num1 + " + " + num2 + " = " + 
	  (num1 + num2));
	   
	  System.out.println(num1 + " - " + num2 + " = " + 
	  (num1 - num2));
	   
	  System.out.println(num1 + " x " + num2 + " = " + 
	  (num1 * num2));
	   
	  System.out.println(num1 + " / " + num2 + " = " + 
	  (num1 / num2));
	 }
	 
	}


