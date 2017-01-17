package myStuff;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import myStuff.Operations;
public class Calculator extends JFrame {
	static String string = "";
	static boolean isDegrees = false;
	public static void main(String[] args) {
		Operations operations = new Operations();
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.setTitle("Calculator (Radians)");
		JTextField screen = new JTextField(string, 85);
		JPanel controlPanel = new JPanel();
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton times = new JButton("x");
		JButton divide = new JButton("÷");
		JButton equal = new JButton("=");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton zero = new JButton("0");
		JButton pi = new JButton("π");
		JButton exponent = new JButton("^");
		JButton eConstant = new JButton("e");
		JButton sin = new JButton("sin");
		JButton cos = new JButton("cos");
		JButton tan = new JButton("tan");
		JButton decimalPoint = new JButton(".");
		JButton clear = new JButton("clear");
		JButton openParentheses = new JButton("(");
		JButton closeParentheses = new JButton(")");
		JButton degrees = new JButton("Degrees");
		
		calc.add(controlPanel);
		
		controlPanel.add(screen);
		controlPanel.add(plus);
		controlPanel.add(minus);
		controlPanel.add(times);
		controlPanel.add(divide);
		controlPanel.add(equal);
		controlPanel.add(one);
		controlPanel.add(two);
		controlPanel.add(three);
		controlPanel.add(four);
		controlPanel.add(five);
		controlPanel.add(six);
		controlPanel.add(seven);
		controlPanel.add(eight);
		controlPanel.add(nine);
		controlPanel.add(zero);
		controlPanel.add(pi);
		controlPanel.add(exponent);
		controlPanel.add(eConstant);
		controlPanel.add(sin);
		controlPanel.add(cos);
		controlPanel.add(tan);
		controlPanel.add(decimalPoint);
		controlPanel.add(clear);
		controlPanel.add(openParentheses);
		controlPanel.add(closeParentheses);
		controlPanel.add(degrees);
		calc.setVisible(true);
		
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, "+");
			}
		});
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, "-");
			}
		});		
		times.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, "*");
			}
		});		
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, "/");
			}
		});		
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.compute(string, screen);
			}
		});
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, "1");
			}
		});
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, "2");
			}
		});
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, "3");
			}
		});
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, "4");
			}
		});
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, "5");
			}
		});
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, "6");
			}
		});
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, "7");
			}
		});
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, "8");
			}
		});
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, "9");
			}
		});
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, "0");
			}
		});
		pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, "Math.PI");
			}
		});
		exponent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, "Math.pow(");
			}
		});
		eConstant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, "Math.E");
			}
		});
		sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isDegrees)
					operations.addString(string, screen, "Math.sin(Math.toRadians(");
				else 
					operations.addString(string, screen, "Math.sin(");
			}
		});
		cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isDegrees)
					operations.addString(string, screen, "Math.cos(Math.toRadians(");
				else
					operations.addString(string, screen, "Math.cos(");
			}
		});
		tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isDegrees)
					operations.addString(string, screen, "Math.tan(Math.toRadians(");
				else 
					operations.addString(string, screen, "Math.tan(");
			}
		});
		decimalPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, ".");
			}
		});
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.clear(string, screen);
			}
		});
		openParentheses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, "(");
			}
		});
		closeParentheses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.addString(string, screen, ")");
			}
		});
		degrees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isDegrees) {
					isDegrees = false;
					degrees.setText("Degrees");
					calc.setTitle("Calculator (Radians)");
				} else {
					isDegrees = true;
					degrees.setText("Radians");
					calc.setTitle("Calculator (Degrees)");
				}
			}
		});
	}
	Calculator() {
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
