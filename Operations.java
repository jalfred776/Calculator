package myStuff;

import java.util.Stack;

import javax.swing.JTextField;

public class Operations {

	public class java {
	}
	public int factorial(int input) {
		if (input == 1)
			return 1;
		return input * (factorial(input-1));
	}
	public void addString(String string, JTextField field, String add) {
		string = field.getText();
		string += add;
		field.setText(string);
	}
	public void compute(String string, JTextField field) {
		string = field.getText();
		Stack output = new Stack();
		Stack operator = new Stack();
		int lastOperator = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '+' || string.charAt(i) == '-' || string.charAt(i) == '/' || string.charAt(i) == '*') {
				output.push(string.substring(lastOperator+1, i));
				operator.push(string.charAt(i));
				lastOperator = i;
			}
		}
		
	}
	public void clear(String string, JTextField field) {
		string = "";
		field.setText(string);
	}
}
