package Calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JFormattedTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Calculator extends JFrame {

	static JButton button_00,button_0,button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8;
	static JButton button_9,button_10,button_11,button_12,button_13,button_14,btnNewButton;
	private JPanel contentPane;
	static JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(25, 28, 292, 35);
		textField.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(ConvertListener.tempt.contains("+")){
						ConvertListener.tempt = ConvertListener.tempt.replace("+","");
						int Plus =Integer.parseInt(ConvertListener.tempt)+Integer.parseInt(ConvertListener.tempt2);
						String SPlus = Integer.toString(Plus);
						Calculator.textField.setText(SPlus);
					}
					if(ConvertListener.tempt.contains("-")){
						ConvertListener.tempt = ConvertListener.tempt.replace("-","");
						int Minus =Integer.parseInt(ConvertListener.tempt)-Integer.parseInt(ConvertListener.tempt2);
						String SMinus = Integer.toString(Minus);
						Calculator.textField.setText(SMinus);
					}
					if(ConvertListener.tempt.contains("*")){
						ConvertListener.tempt = ConvertListener.tempt.replace("*","");
						int Multiple =Integer.parseInt(ConvertListener.tempt)*Integer.parseInt(ConvertListener.tempt2);
						String SMultiple = Integer.toString(Multiple);
						Calculator.textField.setText(SMultiple);
					}
					if(ConvertListener.tempt.contains("/")){
						ConvertListener.tempt = ConvertListener.tempt.replace("/","");
						int Divide =Integer.parseInt(ConvertListener.tempt)/Integer.parseInt(ConvertListener.tempt2);
						String SDivide = Integer.toString(Divide);
						Calculator.textField.setText(SDivide);
					}
				}
				if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					ConvertListener.tempt = "";
					ConvertListener.tempt2 = "";
					Calculator.textField.setText(ConvertListener.tempt);
				}
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("C");
		btnNewButton.setBounds(25, 100, 63, 40);
		btnNewButton.addActionListener(new ConvertListener());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(1, 281, 346, 40);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		button_2 = new JButton("2");
		button_2.setBounds(102, 0, 62, 40);
		button_2.addActionListener(new ConvertListener());
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(button_2);
		
		button_3 = new JButton("3");
		button_3.setBounds(176, 0, 66, 40);
		button_3.addActionListener(new ConvertListener());
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(button_3);
		
		button_11 = new JButton("-");
		button_11.setBounds(254, 0, 65, 40);
		button_11.addActionListener(new ConvertListener());
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(button_11);
		
		button_1 = new JButton("1");
		button_1.addActionListener(new ConvertListener());
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(24, 0, 65, 40);
		panel_2.add(button_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(1, 341, 346, 40);
		contentPane.add(panel_3);
		
		button_00 = new JButton("00");
		button_00.setBounds(102, 0, 62, 40);
		button_00.addActionListener(new ConvertListener());
		button_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(button_00);
		
		button_14 = new JButton("=");
		button_14.setBounds(176, 0, 66, 40);
		button_14.addActionListener(new ConvertListener());
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(button_14);
		
		button_10 = new JButton("+");
		button_10.setBounds(254, 0, 65, 40);
		button_10.addActionListener(new ConvertListener());
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_3.add(button_10);
		
		button_0 = new JButton("0");
		button_0.addActionListener(new ConvertListener());
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_0.setBounds(25, 0, 65, 40);
		panel_3.add(button_0);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(1, 220, 346, 40);
		contentPane.add(panel);
		
		button_5 = new JButton("5");
		button_5.addActionListener(new ConvertListener());
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_5.setBounds(102, 0, 62, 40);
		panel.add(button_5);
		
		button_6 = new JButton("6");
		button_6.setBounds(176, 0, 66, 40);
		button_6.addActionListener(new ConvertListener());
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(button_6);
		
		button_12 = new JButton("*");
		button_12.setBounds(254, 0, 65, 40);
		button_12.addActionListener(new ConvertListener());
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(button_12);
		
		button_4 = new JButton("4");
		button_4.setBounds(25, 0, 65, 40);
		button_4.addActionListener(new ConvertListener());
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(button_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(1, 160, 346, 40);
		contentPane.add(panel_1);
		
		button_8 = new JButton("8");
		button_8.setBounds(102, 0, 62, 40);
		button_8.addActionListener(new ConvertListener());
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(button_8);
		
		button_9 = new JButton("9");
		button_9.setBounds(176, 0, 66, 40);
		button_9.addActionListener(new ConvertListener());
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(button_9);
		
		button_13 = new JButton("/");
		button_13.setBounds(254, 0, 65, 40);
		button_13.addActionListener(new ConvertListener());
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(button_13);
		
		button_7 = new JButton("7");
		button_7.setBounds(25, 0, 65, 40);
		button_7.addActionListener(new ConvertListener());
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(button_7);
	}
}
