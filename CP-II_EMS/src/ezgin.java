import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ezgin {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ezgin window = new ezgin();
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
	public ezgin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1018, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(25, 13, 963, 537);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		
		
		
		
		JPanel panel1 = new JPanel();
		layeredPane.add(panel1, "name_293548241191300");
		panel1.setLayout(null);
		

		JPanel panel2 = new JPanel();
		panel2.setVisible(false);
		layeredPane.add(panel2, "name_293545615164800");
		panel2.setLayout(null);
		
		JPanel panel3 = new JPanel();
		panel3.setVisible(false);
		layeredPane.add(panel3, "name_293543545030300");
		panel3.setLayout(null);
		
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setVisible(false);
		btnAdd.setBounds(499, 156, 105, 51);
		panel3.add(btnAdd);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setVisible(false);
		lblName.setBounds(25, 121, 56, 16);
		panel3.add(lblName);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setVisible(false);
		lblSurname.setBounds(25, 156, 75, 16);
		panel3.add(lblSurname);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setVisible(false);
		lblAge.setBounds(25, 191, 56, 16);
		panel3.add(lblAge);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setVisible(false);
		lblGender.setBounds(25, 226, 56, 16);
		panel3.add(lblGender);
		
		JLabel lblDomain = new JLabel("Domain:");
		lblDomain.setVisible(false);
		lblDomain.setBounds(267, 121, 56, 16);
		panel3.add(lblDomain);
		
		JLabel lblSalary = new JLabel("Salary:");
		lblSalary.setVisible(false);
		lblSalary.setBounds(267, 156, 56, 16);
		panel3.add(lblSalary);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setVisible(false);
		lblCountry.setBounds(267, 191, 56, 16);
		panel3.add(lblCountry);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setVisible(false);
		lblPhone.setBounds(267, 226, 56, 16);
		panel3.add(lblPhone);
		
		
		JButton btnAddMenu = new JButton("Add Menu");
		btnAddMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_5.setVisible(true);
				textField_6.setVisible(true);
				textField_7.setVisible(true);
				textField_8.setVisible(true);
				textField_9.setVisible(true);
				textField_10.setVisible(true);
				textField_11.setVisible(true);
				textField_12.setVisible(true);
				lblAge.setVisible(true);
				lblCountry.setVisible(true);
				lblDomain.setVisible(true);
				lblGender.setVisible(true);
				lblName.setVisible(true);
				lblPhone.setVisible(true);
				lblSalary.setVisible(true);
				lblSurname.setVisible(true);
				btnAdd.setVisible(true);
				
				
			}
		});
		btnAddMenu.setBounds(112, 24, 120, 64);
		panel3.add(btnAddMenu);
		
		JButton btnUpdateMenu = new JButton("Update Menu");
		btnUpdateMenu.setBounds(335, 24, 120, 64);
		panel3.add(btnUpdateMenu);
		
		JButton btnDeleteMenu = new JButton("Delete Menu");
		btnDeleteMenu.setBounds(575, 24, 125, 64);
		panel3.add(btnDeleteMenu);
		
		textField_4 = new JTextField();
		textField_4.setBounds(25, 279, 910, 245);
		panel3.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setVisible(false);
		textField_5.setBounds(112, 118, 116, 22);
		panel3.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setVisible(false);
		textField_6.setColumns(10);
		textField_6.setBounds(112, 153, 116, 22);
		panel3.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setVisible(false);
		textField_7.setColumns(10);
		textField_7.setBounds(112, 188, 116, 22);
		panel3.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setVisible(false);
		textField_8.setColumns(10);
		textField_8.setBounds(112, 223, 116, 22);
		panel3.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setVisible(false);
		textField_9.setColumns(10);
		textField_9.setBounds(335, 118, 116, 22);
		panel3.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setVisible(false);
		textField_10.setColumns(10);
		textField_10.setBounds(335, 153, 116, 22);
		panel3.add(textField_10);
		
		
		
		textField_11 = new JTextField();
		textField_11.setVisible(false);
		textField_11.setBounds(335, 188, 116, 22);
		panel3.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setVisible(false);
		textField_12.setColumns(10);
		textField_12.setBounds(335, 223, 116, 22);
		panel3.add(textField_12);
		
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Succesfully Logged Out !");
				panel3.setVisible(false);
				panel1.setVisible(true);
			}
		});
		btnSignOut.setBounds(854, 13, 97, 36);
		panel3.add(btnSignOut);
		
	
		
		
		JButton button_1 = new JButton("Go back to login menu");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(false);
				panel1.setVisible(true);
			}
		});
		button_1.setBounds(757, 13, 194, 25);
		panel2.add(button_1);
		
		JButton button_2 = new JButton("Try to \r\nsign up !");
		button_2.setBounds(219, 144, 119, 25);
		panel2.add(button_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(175, 96, 116, 22);
		panel2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(175, 60, 116, 22);
		panel2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(175, 25, 116, 22);
		panel2.add(textField_3);
		
		JLabel label_3 = new JLabel("Username:");
		label_3.setBounds(32, 28, 97, 16);
		panel2.add(label_3);
		
		JLabel label_4 = new JLabel("Password:");
		label_4.setBounds(32, 63, 116, 16);
		panel2.add(label_4);
		
		JLabel label_5 = new JLabel("Re-Enter the Password:");
		label_5.setBounds(32, 99, 136, 16);
		panel2.add(label_5);
		
		
		
		JButton button = new JButton("Sign in");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Succesfully Logged In !");
				panel1.setVisible(false);
				panel3.setVisible(true);
			}
		});
		button.setBounds(214, 152, 97, 25);
		panel1.add(button);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(174, 86, 116, 22);
		panel1.add(passwordField);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(174, 51, 116, 22);
		panel1.add(textField);
		
		JLabel label_1 = new JLabel("Username:");
		label_1.setBounds(85, 51, 77, 16);
		panel1.add(label_1);
		
		JLabel label_2 = new JLabel("Password:");
		label_2.setBounds(85, 94, 77, 16);
		panel1.add(label_2);
		
		JCheckBox checkBox = new JCheckBox("Show Password");
		checkBox.setBounds(303, 85, 141, 25);
		panel1.add(checkBox);
		
		JButton btnSignup = new JButton("Signup");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(true);
			}
		});
		btnSignup.setBounds(105, 152, 97, 25);
		panel1.add(btnSignup);
	}
}
