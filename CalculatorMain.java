import java.util.Scanner;

public class CalculatorMain {

	private static Scanner scanner;

	public static void main(String[] args) {
		Calculator calculator;
		
		System.out.println("Choose mathematical symbol" +
				"\naddition +" +
				"\n subtraction -" +
				"\n multiplication *" +
				"\n division /");
		scanner = new Scanner(System.in);
		String symbol;
		boolean rightSymbol = true;
		while(rightSymbol){
			rightSymbol = false;
		symbol =scanner.nextLine();
		switch(symbol){
		case "+":
			calculator = new Calculator("+", getEnteredNumber("first value "), getEnteredNumber("second value"));
			System.out.println("answer is " + calculator.CountAnswer());
			break;
		case "-":
			calculator = new Calculator("-", getEnteredNumber("first value "), getEnteredNumber("second value"));
			System.out.println("answer is " + calculator.CountAnswer());
			break;
		case "*":
			calculator = new Calculator("*", getEnteredNumber("first value "), getEnteredNumber("second value"));
			System.out.println("answer is " + calculator.CountAnswer());
			break;
		case "/":
			calculator = new Calculator("/", getEnteredNumber("first value "), getEnteredNumber("second value"));
			System.out.println("answer is " + calculator.CountAnswer());
			break;
			
			default:
				rightSymbol = true;
				System.out.println("Wrong choice please type  your choice again");
		}
	}
		
		
	}
	
	private static int getEnteredNumber(String symbol){
		boolean rightNumber=true;
		
		while(rightNumber){
			rightNumber = false;
			System.out.println("Enter " + symbol);
			String firstNumber = scanner.nextLine();
			
		try{
			 int iFirstNumber=Integer.parseInt(firstNumber);
				return iFirstNumber;
			
		}catch (Exception e) {
			rightNumber = true;
			System.out.println("Wrong value"+e.getMessage());
		}
		}
		return 0;
	}

}
