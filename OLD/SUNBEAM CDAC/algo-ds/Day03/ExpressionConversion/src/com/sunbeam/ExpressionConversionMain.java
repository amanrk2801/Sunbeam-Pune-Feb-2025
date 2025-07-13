package com.sunbeam;

import java.util.Stack;

public class ExpressionConversionMain {
	
	public static int priority(char opr) {
		switch(opr) {
		case '$': return 10;
		case '/': return 9;
		case '*': return 9;
		case '%': return 9;
		case '+': return 8;
		case '-': return 8;
		}
		return 0;
	}
	
	public static String infixToPostfix(String infix) {
		//0. create stack to push operators
		Stack<Character> st = new Stack<Character>();
		//0. create string to store postfix expression
		StringBuilder postfix = new StringBuilder();
		//1. check infix expression from left to right
		for(int i = 0 ; i < infix.length() ; i++) {
			//2. extract character from ith index from infix expression
			char ele = infix.charAt(i);
			//3. check if element is operand
			if(Character.isDigit(ele))
				postfix.append(ele);
			//4. check if element is opening bracket
			else if(ele == '(')
				st.push(ele);
			//5. check if element is closing bracket
			else if(ele == ')') {
				while(st.peek() != '(') {
					postfix.append(st.pop());
				}
				st.pop();	// to discard
			}
			//6. check if element is operator
			else {
				while(!st.isEmpty() && priority(st.peek()) >= priority(ele))
					postfix.append(st.pop());
				//6.2 push current operator into stack
				st.push(ele);
			}
		}
		//7. pop remaining elements of statck one by one and append into postfix expression
		while(!st.isEmpty())
			postfix.append(st.pop());
		
		//8. return postfix expression
		return postfix.toString();		
	}
	
	public static String infixToPrefix(String infix) {
		//0. create stack to push operators
		Stack<Character> st = new Stack<Character>();
		//0. create string to store prefix expression
		StringBuilder prefix = new StringBuilder();
		//1. check infix expression from right to left
		for(int i = infix.length()-1 ; i >= 0 ; i--) {
			//2. extract character from ith index from infix expression
			char ele = infix.charAt(i);
			//3. check if element is operand
			if(Character.isDigit(ele))
				prefix.append(ele);
			//4. check if element is closing bracket
			else if(ele == ')')
				st.push(ele);
			//5. check if element is opening bracket
			else if(ele == '(') {
				while(st.peek() != ')') {
					prefix.append(st.pop());
				}
				st.pop();	// to discard
			}
			//6. check if element is operator
			else {
				while(!st.isEmpty() && priority(st.peek()) > priority(ele))
					prefix.append(st.pop());
				//6.2 push current operator into stack
				st.push(ele);
			}
		}
		//7. pop remaining elements of statck one by one and append into prefix expression
		while(!st.isEmpty())
			prefix.append(st.pop());
		
		// reverse expression
		prefix.reverse();
		
		//8. return postfix expression
		return prefix.toString();		
	}

	public static void main(String[] args) {
		String infix = "1$9+3*4-(6+8/2)+7";
		
		System.out.println("Infix : " + infix);
		String postfix = infixToPostfix(infix);
		System.out.println("Postfix : " + postfix);
		
		String prefix = infixToPrefix(infix);
		System.out.println("Prefix : " + prefix);

	}

}





