import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private JButton btnButton;
	private double answer,number;
	int operation;
	

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
	public void addInput(String str) {
		input.setText(input.getText()+str);
	}
	public void calculate() {
		switch(operation) {
		case 1:
			answer= number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2:
			answer= number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer= number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4: answer= number / Double.parseDouble(input.getText());
		input.setText(Double.toString(answer));
		break;
			
			
		}
	}
	/**
	 * Create the frame.
	 */
	public Calculator() {
		setType(Type.UTILITY);
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBounds(10, 11, 384, 60);
		contentPane.add(screen);
		screen.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(181, 5, 21, 21);
		screen.add(tabbedPane);
		
		input = new JTextField();
		input.setBackground(new Color(255, 255, 255));
		input.setEnabled(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Menlo", Font.BOLD, 23));
		input.setBounds(6, 22, 372, 32);
		screen.add(input);
		input.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setFont(new Font("Menlo", Font.BOLD, 13));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(254, 5, 124, 16);
		screen.add(lbl);
		
		JPanel control = new JPanel();
		control.setBounds(10, 83, 384, 378);
		contentPane.add(control);
		control.setLayout(new GridLayout(4, 4, 20, 20));
		
		JButton btnNewButton = new JButton("5");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Menlo", Font.BOLD, 23));
		control.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2.setFont(new Font("Menlo", Font.BOLD, 23));
		control.add(btnNewButton_2);
		
		JButton btnNewButton_2_2 = new JButton("9");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2_2.setFont(new Font("Menlo", Font.BOLD, 23));
		control.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_2_1 = new JButton("+");
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation= 1;
				input.setText("");
				lbl.setText(number+ "+");
				
			}
		});
		btnNewButton_2_2_1.setFont(new Font("Menlo", Font.BOLD, 23));
		control.add(btnNewButton_2_2_1);
		
		JButton btnNewButton_2_1 = new JButton("6");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2_1.setFont(new Font("Menlo", Font.BOLD, 23));
		control.add(btnNewButton_2_1);
		btnNewButton.setFont(new Font("Menlo", Font.BOLD, 23));
		control.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_4.setFont(new Font("Menlo", Font.BOLD, 23));
		control.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("-");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation= 2;
				input.setText("");
				lbl.setText(number + "-");
			}
		});
		btnNewButton_3.setFont(new Font("Menlo", Font.BOLD, 23));
		control.add(btnNewButton_3);
		
		JButton btnNewButton_3_2 = new JButton("3");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3_2.setFont(new Font("Menlo", Font.BOLD, 23));
		control.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_1 = new JButton("2");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3_1.setFont(new Font("Menlo", Font.BOLD, 23));
		control.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_1_1 = new JButton("1");
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3_1_1.setFont(new Font("Menlo", Font.BOLD, 23));
		control.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_3_1_1_1 = new JButton("*");
		btnNewButton_3_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation= 3;
				input.setText("");
				lbl.setText(number+ "*");
			}
		});
		btnNewButton_3_1_1_1.setFont(new Font("Menlo", Font.BOLD, 23));
		control.add(btnNewButton_3_1_1_1);
		
		JButton btnNewButton_3_1_1_1_1 = new JButton("0");
		btnNewButton_3_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3_1_1_1_1.setFont(new Font("Menlo", Font.BOLD, 23));
		control.add(btnNewButton_3_1_1_1_1);
		
		JButton btnNewButton_3_3 = new JButton("=");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lbl.setText("");
			}
		});
		btnNewButton_3_3.setFont(new Font("Menlo", Font.BOLD, 23));
		control.add(btnNewButton_3_3);
		
		JButton btnNewButton_3_3_1 = new JButton("C");
		btnNewButton_3_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			input.setText("");
			}
		});
		btnNewButton_3_3_1.setFont(new Font("Menlo", Font.BOLD, 23));
		control.add(btnNewButton_3_3_1);
		
		JButton btnNewButton_3_3_2 = new JButton("%");
		btnNewButton_3_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(input.getText());
				operation= 4;
				input.setText("");
				lbl.setText(number+ "%");
			}
		});
		btnNewButton_3_3_2.setFont(new Font("Menlo", Font.BOLD, 23));
		control.add(btnNewButton_3_3_2);
	}
}
