import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class oneWindow extends JFrame{

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void a() {
				
			}
			public void run() {
				try {
					oneWindow window = new oneWindow();
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
	public oneWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 725, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(12, 13, 683, 382);
		frame.getContentPane().add(layeredPane);
		
		JPanel panel2 = new JPanel();
		panel2.setVisible(false);
		panel2.setBounds(12, 13, 671, 369);
		layeredPane.add(panel2);
		panel2.setLayout(null);
		
		JButton button_1 = new JButton("Go back to login menu");
		button_1.setBounds(310, 305, 194, 25);
		panel2.add(button_1);
		
		JButton button_2 = new JButton("Try to \r\nsign up !");
		button_2.setBounds(199, 132, 119, 25);
		panel2.add(button_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(155, 84, 116, 22);
		panel2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(155, 48, 116, 22);
		panel2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(155, 13, 116, 22);
		panel2.add(textField_3);
		
		JLabel label_3 = new JLabel("Username:");
		label_3.setBounds(12, 16, 97, 16);
		panel2.add(label_3);
		
		JLabel label_4 = new JLabel("Password:");
		label_4.setBounds(12, 51, 116, 16);
		panel2.add(label_4);
		
		JLabel label_5 = new JLabel("Re-Enter the Password:");
		label_5.setBounds(12, 87, 136, 16);
		panel2.add(label_5);
		
		JPanel panel3 = new JPanel();
		panel3.setVisible(false);
		panel3.setBounds(0, 0, 683, 382);
		layeredPane.add(panel3);
		panel3.setLayout(null);
		
		JButton button_3 = new JButton("Add");
		button_3.setBounds(39, 13, 120, 64);
		panel3.add(button_3);
		
		JButton button_4 = new JButton("Update");
		button_4.setBounds(262, 13, 120, 64);
		panel3.add(button_4);
		
		JButton button_5 = new JButton("Delete");
		button_5.setBounds(502, 13, 125, 64);
		panel3.add(button_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(75, 102, 537, 255);
		panel3.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(23, 13, 660, 369);
		layeredPane.add(panel1);
		panel1.setLayout(null);
		
		JLabel label = new JLabel("Username:");
		label.setBounds(26, 24, 77, 16);
		panel1.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(115, 24, 116, 22);
		panel1.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(115, 59, 116, 22);
		panel1.add(passwordField);
		
		JLabel label_1 = new JLabel("Password:");
		label_1.setBounds(26, 67, 77, 16);
		panel1.add(label_1);
		
		JLabel label_2 = new JLabel("Click this text to signup !");
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setBounds(100, 96, 161, 16);
		panel1.add(label_2);
		
		JButton button = new JButton("Sign in");
		button.setBounds(155, 125, 97, 25);
		panel1.add(button);
		
		JCheckBox checkBox = new JCheckBox("Show Password");
		checkBox.setBounds(244, 58, 141, 25);
		panel1.add(checkBox);
	}
}
