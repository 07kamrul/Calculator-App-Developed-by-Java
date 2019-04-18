package com.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Font;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double ans, num;
	int calculation;

	public void arithmrtic_Operation() {
		switch (calculation) {
		case 1:// Addition
			ans = num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 2:// Subtraction
			ans = num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 3:// Mulipication
			ans = num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 4:// Division
			ans = num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		default:
			break;
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
		}catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
		}catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
		}catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 338, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 128));
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 25, 302, 68);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton button = new JButton("1");
		button.setForeground(new Color(0, 139, 139));
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBounds(10, 115, 59, 33);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});

		JLabel MyLabel = new JLabel("");
		MyLabel.setForeground(Color.RED);
		MyLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		MyLabel.setBounds(228, 11, 84, 14);
		frame.getContentPane().add(MyLabel);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("2");
		button_1.setForeground(new Color(0, 139, 139));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBounds(79, 115, 68, 33);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		frame.getContentPane().add(button_1);

		JButton button_2 = new JButton("3");
		button_2.setForeground(new Color(0, 139, 139));
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBounds(165, 115, 68, 33);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		frame.getContentPane().add(button_2);

		JButton button_3 = new JButton("+");
		button_3.setForeground(new Color(0, 139, 139));
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 1;
				MyLabel.setText(textField.getText() + "+");
				textField.setText("");
			}
		});
		button_3.setBounds(244, 115, 68, 33);
		frame.getContentPane().add(button_3);

		JButton button_4 = new JButton("4");
		button_4.setForeground(new Color(0, 139, 139));
		button_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_4.setBounds(10, 159, 59, 33);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		frame.getContentPane().add(button_4);

		JButton button_5 = new JButton("5");
		button_5.setForeground(new Color(0, 139, 139));
		button_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_5.setBounds(79, 159, 68, 33);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		frame.getContentPane().add(button_5);

		JButton button_6 = new JButton("6");
		button_6.setForeground(new Color(0, 139, 139));
		button_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_6.setBounds(166, 159, 68, 33);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		frame.getContentPane().add(button_6);

		JButton button_7 = new JButton("7");
		button_7.setForeground(new Color(0, 139, 139));
		button_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_7.setBounds(10, 205, 59, 33);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		frame.getContentPane().add(button_7);

		JButton button_8 = new JButton("8");
		button_8.setForeground(new Color(0, 139, 139));
		button_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_8.setBounds(79, 205, 68, 33);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		frame.getContentPane().add(button_8);

		JButton button_9 = new JButton("9");
		button_9.setForeground(new Color(0, 139, 139));
		button_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_9.setBounds(165, 205, 68, 33);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		frame.getContentPane().add(button_9);

		JButton button_10 = new JButton(".");
		button_10.setForeground(new Color(0, 139, 139));
		button_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_10.setBounds(10, 249, 59, 33);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		frame.getContentPane().add(button_10);

		JButton button_11 = new JButton("0");
		button_11.setForeground(new Color(0, 139, 139));
		button_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_11.setBounds(79, 249, 68, 33);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		frame.getContentPane().add(button_11);

		JButton btnX = new JButton("BACK");
		btnX.setForeground(new Color(0, 139, 139));
		btnX.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnX.setBounds(165, 249, 68, 33);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = textField.getText().length();
				int number = textField.getText().length() - 1;
				String store;
				if (length > 0) {
					StringBuilder sb = new StringBuilder(textField.getText());
					sb.deleteCharAt(number);
					store = sb.toString();
					textField.setText(store);
				}
			}
		});
		frame.getContentPane().add(btnX);

		JButton btnClear = new JButton("CLEAR");
		btnClear.setForeground(new Color(0, 139, 139));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(10, 293, 137, 33);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
				MyLabel.setText(" ");
			}
		});
		frame.getContentPane().add(btnClear);

		JButton btnReset = new JButton("RESULT");
		btnReset.setForeground(new Color(0, 139, 139));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmrtic_Operation();
				MyLabel.setText(" ");
			}
		});
		btnReset.setBounds(165, 293, 147, 33);
		frame.getContentPane().add(btnReset);

		JButton button_16 = new JButton("-");
		button_16.setForeground(new Color(0, 139, 139));
		button_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 2;
				MyLabel.setText(textField.getText() + "-");
				textField.setText("");
			}
		});
		button_16.setBounds(244, 159, 69, 33);
		frame.getContentPane().add(button_16);

		JButton button_17 = new JButton("*");
		button_17.setForeground(new Color(0, 139, 139));
		button_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 3;
				MyLabel.setText(textField.getText() + "*");
				textField.setText("");
			}
		});
		button_17.setBounds(244, 205, 68, 33);
		frame.getContentPane().add(button_17);

		JButton button_18 = new JButton("/");
		button_18.setForeground(new Color(0, 139, 139));
		button_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 4;
				MyLabel.setText(textField.getText() + "/");
				textField.setText("");
			}
		});
		button_18.setBounds(244, 249, 68, 33);
		frame.getContentPane().add(button_18);
	}
}
