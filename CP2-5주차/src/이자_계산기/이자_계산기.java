package 이자_계산기;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class 이자_계산기 extends JFrame {

	static JPanel contentPane;
	static JTextField textField;
	static JTextField textField_1;
	static final JPanel panel = new JPanel();
	static JButton btnNewButton;
	static JPanel panel_1;
	static JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					이자_계산기 frame = new 이자_계산기();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public 이자_계산기() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC6D0\uAE08\uC744 \uC785\uB825\uD558\uC2DC\uC624.");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(60, 49, 207, 29);
		contentPane.add(lblNewLabel);

		JLabel label = new JLabel("\uC774\uC728\uC744 \uC785\uB825\uD558\uC2DC\uC624.");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(60, 88, 207, 29);
		contentPane.add(label);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(278, 49, 88, 29);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setColumns(10);
		textField_1.setBounds(278, 88, 88, 29);
		textField_1.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					double interest;
					int principal;
					double annual_interest;
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

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

		});
		contentPane.add(textField_1);
		panel.setBounds(0, 140, 436, 44);
		contentPane.add(panel);

		btnNewButton = new JButton("\uBCC0\uD658");
		btnNewButton.setFont(btnNewButton.getFont().deriveFont(20f));
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.addActionListener(new ConvertListener());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnNewButton);

		panel_1 = new JPanel();
		panel_1.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel_1.setBounds(0, 202, 436, 36);
		contentPane.add(panel_1);

		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(textField_2);
		textField_2.setColumns(25);
	}

}
