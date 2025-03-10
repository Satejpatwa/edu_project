import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num1, num2, result, choice;
		
		System.out.println("enter two numbers");
		Scanner sc = new Scanner(System.in);
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		System.out.println("Enter your choice");
		System.out.println("Addition");
		System.out.println("Substraction");
		System.out.println("Multiplication");
		System.out.println("Division");
		System.out.println("Remainder");
		
		choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			result=num1+num2;
			System.out.println("Addition is = "+result);
			break;
			
		case 2:
			result=num1-num2;
			System.out.println("Substraction is = "+result);
			break;
			
		case 3:
			result=num1*num2;
			System.out.println("Multiplication is = "+result);
			break:
				
		case 4:
			result=num1/num2;
			System.out.println("Division is = "+result);
			break;
			
		case 5:
			result=num1%num2;
			System.out.println("Remainder is "+result);
			break;
			
			default:
				System.out.println("invalid choice");
		
		
	
		}
		
		
	

	}

}
