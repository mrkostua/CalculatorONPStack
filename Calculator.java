
public class Calculator {
private int firstNumber,secondNumber;
private String symbol;

	public Calculator(String symbol,int fistNumber, int secondNumber) {
		this.symbol = symbol;
		this.firstNumber = fistNumber;
		this.secondNumber = secondNumber;
	}
	
	public int CountAnswer(){
		switch(symbol){
		case "+":
			return firstNumber + secondNumber;
		case "-":
			return firstNumber - secondNumber;
			
		case "*":
			return firstNumber * secondNumber;
		case "/":
			try{
			return firstNumber / secondNumber;
			}catch(ArithmeticException arithmeticException){
				System.out.println("eror " + arithmeticException.getMessage());
			}
			
		}
		// never happened 
		return 0;
	}

}
