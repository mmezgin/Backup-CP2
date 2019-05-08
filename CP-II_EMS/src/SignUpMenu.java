import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUpMenu extends JFrame{

	private JFrame frameSignUp;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpMenu window = new SignUpMenu();
					window.frameSignUp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignUpMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameSignUp = new JFrame();
		frameSignUp.setBounds(100, 100, 560, 405);
		frameSignUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameSignUp.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(181, 28, 116, 22);
		frameSignUp.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(181, 63, 116, 22);
		frameSignUp.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(181, 99, 116, 22);
		frameSignUp.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label1 = new JLabel("Username:");
		label1.setBounds(38, 31, 97, 16);
		frameSignUp.getContentPane().add(label1);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(38, 66, 116, 16);
		frameSignUp.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Re-Enter the Password:");
		lblNewLabel_2.setBounds(38, 102, 136, 16);
		frameSignUp.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Try to \r\nsign up !");
		btnNewButton.setBounds(225, 147, 119, 25);
		frameSignUp.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Go back to login menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginMenu l1 = new LoginMenu();
				
			}
		});
		btnNewButton_1.setBounds(336, 320, 194, 25);
		frameSignUp.getContentPane().add(btnNewButton_1);
	}

	
}
