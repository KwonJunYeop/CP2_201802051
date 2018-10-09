package 이자_계산기;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertListener implements ActionListener {

	private double interest;
	private int principal;
	private double annual_interest;

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == 이자_계산기.btnNewButton) {
			if (이자_계산기.textField_1.getText().equals("")) {
				interest = 1;
			} else {
				interest = Double.valueOf(이자_계산기.textField_1.getText());
			}
			if (이자_계산기.textField.getText().equals("")) {
				principal = 0;
			} else {
				principal = Integer.valueOf(이자_계산기.textField.getText());
			}

			annual_interest = principal * (interest / 100);

			이자_계산기.textField_2.setText("연이율은 " + annual_interest + "원 입니다.");
		}

	}

}
