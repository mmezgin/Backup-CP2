import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginMenu extends JFrame{

	private JFrame frameLoginMenu;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginMenu window = new LoginMenu();
					window.frameLoginMenu.setVisible(true);
					new LoginMenu();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frameLoginMenu = new JFrame();
		frameLoginMenu.setBounds(100, 100, 553, 458);
		frameLoginMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLoginMenu.getContentPane().setLayout(null);
		
		JButton buttonSignin = new JButton("Sign in");
		buttonSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				MainMenu m1 = new MainMenu();
				m1.setVisible(true);
				setVisible(false);
				
				
			
		} 
		});
		buttonSignin.setBounds(174, 210, 97, 25);
		frameLoginMenu.getContentPane().add(buttonSignin);
		
		textField = new JTextField();
		textField.setBounds(134, 109, 116, 22);
		frameLoginMenu.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label1 = new JLabel("Username:");
		label1.setBounds(45, 109, 77, 16);
		frameLoginMenu.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("Password:");
		label2.setBounds(45, 152, 77, 16);
		frameLoginMenu.getContentPane().add(label2);
		
		JLabel label3_signup = new JLabel("Click this text to signup !");
		label3_signup.setForeground(Color.BLUE);
		label3_signup.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label3_signup.setBounds(119, 181, 161, 16);
		frameLoginMenu.getContentPane().add(label3_signup);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(134, 144, 116, 22);
		frameLoginMenu.getContentPane().add(passwordField);
		
		JCheckBox check1 = new JCheckBox("Show Password");
		check1.setBounds(263, 143, 141, 25);
		frameLoginMenu.getContentPane().add(check1);
	}
	public void close() { 
	    this.setVisible(false);
	    this.dispose();
	}
	
}
