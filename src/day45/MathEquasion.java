
	package day45;

	public class MathEquasion {
	  
	  private double operand1;
	  private double operand2;
	  private double result;
	  private char operator;
	  
	  public MathEquasion() {
	    System.out.println("no arg");
	  }

	  public MathEquasion(double operand1, double operand2, char operator) {
	    this.operand1 = operand1;
	    this.operand2 = operand2;
	    this.operator = operator;
	  }

	  public void calculate() {
	    
	    switch (this.operator) {

	      case '+':
	        this.result = this.operand1 + this.operand2;
	        break;
	      case '-':
	        result = operand1 - operand2;
	        
	        break;
	      case '*':
	        result = operand1 * operand2;
	        
	        break;
	      case '/':
	        result = operand1 / operand2;      
	        break;
	      
	      default: 
	        System.out.println("INVALID @@@!!!");
	      
	    }  
	    
	  }
	  
	  public void calculateX(double num1, double num2) {
		  this.operand1=num1;
		  this.operand2=num2;
		  
		  this.calculate(); //call a method inside of a method!
	  
	  }

	  public double getOperand1() {
	    return operand1;
	  }
	  public void setOperand1(int operand1) {
	    this.operand1 = operand1;
	  }
	  public double getOperand2() {
	    return operand2;
	  }
	  public void setOperand2(int operand2) {
	    this.operand2 = operand2;
	  }
	  public char getOperator() {
	    return operator;
	  }
	  public void setOperator(char operator) {
	    this.operator = operator;
	  }
	
	  public double getResult() {
	    return result;
	  }
	  
	  public String toString() {
	    return "MathEquasion [operand1=" + operand1 + ", operand2=" + operand2 
	        + ", operator= <" + operator + "> | result=" + result +  "]";
	  } 
	  
	  
	  
	  
	  

	}


