import java.util.Scanner;
public class Calculator {
	
	    public static void main(String[] args) {
	        Scanner reader = new Scanner(System.in);
	        System.out.print("Enter two numbers: ");
	        // nextDouble() reads the next double from the keyboard
	        double first = reader.nextDouble();
	        double second = reader.nextDouble();
	        System.out.print("Enter an operator (1='add', 2='Sub', 3='mul', 4='div'): ");
	        char operator = reader.next().charAt(0);
	        double result;
	        switch(operator)
	        {
	            case '1':
	                result = first + second;
	                break;
	            case '2':
	                result = first - second;
	                break;
	            case '3':
	                result = first * second;
	                break;
	            case '4':
	                result = first / second;
	                break;
	            // operator doesn't match any case constant (+, -, *, /)
	            default:
	                System.out.printf("Error! operator is not correct");
	                return;
	        }
	        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
	    
	}

}
