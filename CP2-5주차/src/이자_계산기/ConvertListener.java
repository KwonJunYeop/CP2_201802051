package ����_����;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertListener implements ActionListener {

	private double interest;
	private int principal;
	private double annual_interest;

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == ����_����.btnNewButton) {
			if (����_����.textField_1.getText().equals("")) {
				interest = 1;
			} else {
				interest = Double.valueOf(����_����.textField_1.getText());
			}
			if (����_����.textField.getText().equals("")) {
				principal = 0;
			} else {
				principal = Integer.valueOf(����_����.textField.getText());
			}

			annual_interest = principal * (interest / 100);

			����_����.textField_2.setText("�������� " + annual_interest + "�� �Դϴ�.");
		}

	}

}
