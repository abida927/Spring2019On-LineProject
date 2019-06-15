package day44;

public class MathEquation {
//	Create a class called MathEquation 
//	add 4 private fields 
//		oprand1 , oprand2 , result as double 
//		operator as char 
	private double oprand1;
	private double oprand2;
	private double result;
	private char operator;

//	Encapsulate first 3 fiels 
//	with getters and setters
//
	
//	provide only setter for operator field

	public void setOperator(char operator) {
		this.operator = operator;
	}

public double getOprand1() {
		return oprand1;
	}

	public void setOprand1(double oprand1) {
		this.oprand1 = oprand1;
	}

	public double getOprand2() {
		return oprand2;
	}

	public void setOprand2(double oprand2) {
		this.oprand2 = oprand2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public char getOperator() {
		return operator;
	}

	//	Create no arg constructor 
//		just print out message from no Arg 
//
	public MathEquation() {
		System.out.println("no Arg constructor");
	}

//	create 1 arg constructor 
//		set the operator value 
	public MathEquation(char operator) {
		this.operator = operator;
	}

//
//	create 3 args constructor 
//		set all 3 fields value 
	public MathEquation(double oprand1, double oprand2, char operator) {
		this.oprand1 = oprand1;
		this.oprand2 = oprand2;
		this.operator = operator;
	}

//	Create toString method to return all fields value 
	

//	create a void instance method Cacculate with no parameter
//	set the result value 
//		according to oprand1 oprand2 operator
//		if operator is + - * / 
//			calculate result 
	public void Calculate() {
		if (operator == '+') {
			result = oprand1 + oprand2;
			//System.out.println(result);
		} else if (operator == '-') {
			result = oprand1 - oprand2;
		//	System.out.println(result);

		} else if (operator == '*') {
			result = oprand1 * oprand2;
			//System.out.println(result);
		}else {
			System.out.println("Invalid operator");
		}
	}
//

	public String toString() {
		return "MathEquation [oprand1=" + oprand1 + ", oprand2=" + oprand2 + ", result=" + result + ", operator="
				+ operator + "]";
	}

//	in main method create 4 mathequation ojbects and call calculate
	// method and print out the result fields value;

}
