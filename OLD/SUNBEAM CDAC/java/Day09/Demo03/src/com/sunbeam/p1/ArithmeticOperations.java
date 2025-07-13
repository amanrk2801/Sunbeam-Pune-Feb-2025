package com.sunbeam.p1;

public enum ArithmeticOperations {
	EXIT(){
		@Override
		public String toString() {
			return "Exit";
		}
	},ADD(){
		@Override
		public String toString() {
			return "Addition";
		}
	},SUB(){
		@Override
		public String toString() {
			return "Substraction";
		}
	},MUL(){
		@Override
		public String toString() {
			return "Multiplication";
		}
	}
}
