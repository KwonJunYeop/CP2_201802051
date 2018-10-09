package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import 이자_계산기.이자_계산기;

public class ConvertListener implements ActionListener {

	private int button_00, button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8;
	private int button_9, button_10, button_11, button_12, button_13, button_14, btnNewButton;
	public int number1, number2;
	public String SPlus;
	static String tempt = "0";
	static String tempt2 = "";
	static String temptP;
	boolean before = false;

	@Override
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub

		if (tempt == "0") {
			if (e.getSource() == Calculator.button_00) {
				tempt = "0";
				Calculator.textField.setText(tempt);
			} else if (e.getSource() == Calculator.button_0) {
				tempt = "0";
				Calculator.textField.setText(tempt);
			} else if (e.getSource() == Calculator.button_1) {
				tempt = "1";
				Calculator.textField.setText(tempt);
			} else if (e.getSource() == Calculator.button_2) {
				tempt = "2";
				Calculator.textField.setText(tempt);
			} else if (e.getSource() == Calculator.button_3) {
				tempt = "3";
				Calculator.textField.setText(tempt);
			} else if (e.getSource() == Calculator.button_4) {
				tempt = "4";
				Calculator.textField.setText(tempt);
			} else if (e.getSource() == Calculator.button_5) {
				tempt = "5";
				Calculator.textField.setText(tempt);
			} else if (e.getSource() == Calculator.button_6) {
				tempt = "6";
				Calculator.textField.setText(tempt);
			} else if (e.getSource() == Calculator.button_7) {
				tempt = "7";
				Calculator.textField.setText(tempt);
			} else if (e.getSource() == Calculator.button_8) {
				tempt = "8";
				Calculator.textField.setText(tempt);
			} else if (e.getSource() == Calculator.button_9) {
				tempt = "9";
				Calculator.textField.setText(tempt);
			}
		} else {
			if (e.getSource() == Calculator.button_00) {
				if (tempt.contains("+") || tempt.contains("-") || tempt.contains("*") || tempt.contains("/")) {
					tempt2 = tempt2 + "00";
					Calculator.textField.setText(tempt + tempt2);
				} else {
					tempt = tempt + "00";
					Calculator.textField.setText(tempt);
				}
			}
			if (e.getSource() == Calculator.button_0) {
				if (tempt.contains("+") || tempt.contains("-") || tempt.contains("*") || tempt.contains("/")) {
					tempt2 = tempt2 + "0";
					Calculator.textField.setText(tempt + tempt2);
				} else {
					tempt = tempt + "0";
					Calculator.textField.setText(tempt);
				}
			}
			if (e.getSource() == Calculator.button_1) {
				if (tempt.contains("+") || tempt.contains("-") || tempt.contains("*") || tempt.contains("/")) {
					tempt2 = tempt2 + "1";
					Calculator.textField.setText(tempt + tempt2);
				} else {
					tempt = tempt + "1";
					Calculator.textField.setText(tempt);
				}
			}
			if (e.getSource() == Calculator.button_2) {
				if (tempt.contains("+") || tempt.contains("-") || tempt.contains("*") || tempt.contains("/")) {
					tempt2 = tempt2 + "2";
					Calculator.textField.setText(tempt + tempt2);
				} else {
					tempt = tempt + "2";
					Calculator.textField.setText(tempt);
				}
			}
			if (e.getSource() == Calculator.button_3) {
				if (tempt.contains("+") || tempt.contains("-") || tempt.contains("*") || tempt.contains("/")) {
					tempt2 = tempt2 + "3";
					Calculator.textField.setText(tempt + tempt2);
				} else {
					tempt = tempt + "3";
					Calculator.textField.setText(tempt);
				}
			}
			if (e.getSource() == Calculator.button_4) {
				if (tempt.contains("+") || tempt.contains("-") || tempt.contains("*") || tempt.contains("/")) {
					tempt2 = tempt2 + "4";
					Calculator.textField.setText(tempt + tempt2);
				} else {
					tempt = tempt + "4";
					Calculator.textField.setText(tempt);
				}
			}
			if (e.getSource() == Calculator.button_5) {
				if (tempt.contains("+") || tempt.contains("-") || tempt.contains("*") || tempt.contains("/")) {
					tempt2 = tempt2 + "5";
					Calculator.textField.setText(tempt + tempt2);
				} else {
					tempt = tempt + "5";
					Calculator.textField.setText(tempt);
				}
			}
			if (e.getSource() == Calculator.button_6) {
				if (tempt.contains("+") || tempt.contains("-") || tempt.contains("*") || tempt.contains("/")) {
					tempt2 = tempt2 + "6";
					Calculator.textField.setText(tempt + tempt2);
				} else {
					tempt = tempt + "6";
					Calculator.textField.setText(tempt);
				}
			}
			if (e.getSource() == Calculator.button_7) {
				if (tempt.contains("+") || tempt.contains("-") || tempt.contains("*") || tempt.contains("/")) {
					tempt2 = tempt2 + "7";
					Calculator.textField.setText(tempt + tempt2);
				} else {
					tempt = tempt + "7";
					Calculator.textField.setText(tempt);
				}
			}
			if (e.getSource() == Calculator.button_8) {
				if (tempt.contains("+") || tempt.contains("-") || tempt.contains("*") || tempt.contains("/")) {
					tempt2 = tempt2 + "8";
					Calculator.textField.setText(tempt + tempt2);
				} else {
					tempt = tempt + "8";
					Calculator.textField.setText(tempt);
				}
			}
			if (e.getSource() == Calculator.button_9) {
				if (tempt.contains("+") || tempt.contains("-") || tempt.contains("*") || tempt.contains("/")) {
					tempt2 = tempt2 + "9";
					Calculator.textField.setText(tempt + tempt2);
				} else {
					tempt = tempt + "9";
					Calculator.textField.setText(tempt);
				}
			}

			if (e.getSource() == Calculator.button_10) {
				tempt = tempt + "+";
				Calculator.textField.setText(tempt);
			}
			if (e.getSource() == Calculator.button_11) {
				tempt = tempt + "-";
				Calculator.textField.setText(tempt);
			}
			if (e.getSource() == Calculator.button_12) {
				tempt = tempt + "*";
				Calculator.textField.setText(tempt);
			}
			if (e.getSource() == Calculator.button_13) {
				tempt = tempt + "/";
				Calculator.textField.setText(tempt);
			}
			if (e.getSource() == Calculator.button_14) {
				if (tempt.contains("+")) {
					tempt = tempt.replace("+", "");
					int Plus = Integer.parseInt(tempt) + Integer.parseInt(tempt2);
					String SPlus = Integer.toString(Plus);
					Calculator.textField.setText(SPlus);
				}
				if (tempt.contains("-")) {
					tempt = tempt.replace("-", "");
					int Minus = Integer.parseInt(tempt) - Integer.parseInt(tempt2);
					String SMinus = Integer.toString(Minus);
					Calculator.textField.setText(SMinus);
				}
				if (tempt.contains("*")) {
					tempt = tempt.replace("*", "");
					int Multiple = Integer.parseInt(tempt) * Integer.parseInt(tempt2);
					String SMultiple = Integer.toString(Multiple);
					Calculator.textField.setText(SMultiple);
				}
				if (tempt.contains("/")) {
					tempt = tempt.replace("/", "");
					int Divide = Integer.parseInt(tempt) / Integer.parseInt(tempt2);
					String SDivide = Integer.toString(Divide);
					Calculator.textField.setText(SDivide);
				}
			}
			if (e.getSource() == Calculator.btnNewButton) {
				tempt = "";
				tempt2 = "";
				Calculator.textField.setText(tempt);
			}
		}
	}
}
