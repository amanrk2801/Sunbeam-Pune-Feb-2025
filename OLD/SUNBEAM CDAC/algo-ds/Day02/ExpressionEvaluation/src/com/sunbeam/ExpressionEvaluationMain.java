package com.sunbeam;

import java.util.Stack;

public class ExpressionEvaluationMain {
	
	public static int calculate(int op1, char opr, int op2) {
		switch(opr) {
		case '+': return op1 + op2;
		case '-': return op1 - op2;
		case '*': return op1 * op2;
		case '/': return op1 / op2;
		case '%': return op1 % op2;
		case '$': return (int)Math.pow(op1, op2);
		}
		return 0;
	}
	
	public static int postfixEvaluate(String postfix) {
		//0. create stack tp push operands
		Stack<Integer> st = new Stack<Integer>();
		//1. check postfix expression from left to right
		for(int i = 0 ; i < postfix.length() ; i++) {
			//2. extract element of ith index from postfix expression
			char ele = postfix.charAt(i);
			//3. check if element is operand
			if(Character.isDigit(ele))
				st.push(ele - '0');			// to convert digit in character format into digit is number format
			// '0'		--> 48 - 48	= 0	
			// '1'		--> 49 - 48 = 1
			// '2'		--> 50 - 48 = 2
			//4. if element is operator
			else {
				//4.1 pop two operand from stack
				int op2 = st.pop();	// op2 -> first poped
				int op1 = st.pop();	// op1 -> second poped
				//4.2 perfrom operation of op1 and op2
				int result = calculate(op1, ele, op2);
				//4.3 push result on stack again
				st.push(result);
			}
		}
		//5. pop result from stack and return it
		if(!st.isEmpty())
			return st.pop();
		
		return 0;
	}
	
	public static int prefixEvaluate(String prefix) {
		//0. create stack tp push operands
		Stack<Integer> st = new Stack<Integer>();
		//1. check prefix expression from right to left
		for(int i = prefix.length() - 1 ; i >= 0 ; i--) {
			//2. extract element of ith index from prefix expression
			char ele = prefix.charAt(i);
			//3. check if element is operand
			if(Character.isDigit(ele))
				st.push(ele - '0');			// to convert digit in character format into digit is number format
			// '0'		--> 48 - 48	= 0	
			// '1'		--> 49 - 48 = 1
			// '2'		--> 50 - 48 = 2
			//4. if element is operator
			else {
				//4.1 pop two operand from stack
				int op1 = st.pop();	// op2 -> first poped
				int op2 = st.pop();	// op1 -> second poped
				//4.2 perfrom operation of op1 and op2
				int result = calculate(op1, ele, op2);
				//4.3 push result on stack again
				st.push(result);
			}
		}
		//5. pop result from stack and return it
		if(!st.isEmpty())
			return st.pop();
		
		return 0;
	}

	public static void main(String[] args) {
		String postfix = "456*3/+9+7-";
		
		// postfix = "10 20 +"
		// postfix = "10,20,+"
		// String arr[] = String.split(postfix, " ");	["10", "20", "+" ]
		
		System.out.println("Postfix = " + postfix);
		int result = postfixEvaluate(postfix);
		System.out.println("Result = " + result);
		
		String prefix = "-++4/*56397";
		System.out.println("Prefix : " + prefix);
		result = prefixEvaluate(prefix);
		System.out.println("Result : " + result);

	}

}










