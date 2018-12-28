package prob6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if(expression.equals("quit")) {
				
				return;
			}
			
			String token = expression.substring(1,2);
			int first = Integer.parseInt(expression.substring(0,1));
			int last = Integer.parseInt(expression.substring(2,3));
			Calculate cal = null;
			
			switch(token) {
				
				case "+" : cal = new Add(); break;
				case "-" : cal = new Sub(); break;
				case "*" : cal = new Mul(); break;
				case "/" : cal = new Div(); break;
				default : new IllegalStateException(); break;
				
			}
			
			 cal.setValue(first,last);
			 int result = cal.calculate();
			 System.out.printf(">> %d \n", result);
			
		}
	}
	
}

abstract class Calculate{
	
	
	   int a = 0;
	   int b = 0;
	   
	   void setValue(int a, int b) {
		
		   this.a = a;
		   this.b = b;
		   
		   
	   };
	   
	   abstract int calculate();

	
}



class Add extends Calculate{

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	
	
	
}


class Sub extends Calculate{
	@Override
	int calculate() {
		
		return a-b;
	}
	
	
	
}

class Mul extends Calculate{
	
	@Override
	int calculate() {
		return a*b;
	}
	
	
}


class Div extends Calculate{
	
	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a/b;
	}
	
	
}
