import javax.swing.*;
import java.awt.*;


public class LoginMenu extends JFrame  {

	private JButton butLogin;
	private JButton butExit;
	private JTextField unTF;
	private JTextField pwTF;
	private JLabel unLabel;
	private JLabel pwLabel;
	private JLabel signupLabel;
	private final int WINDOW_WIDTH = 500;
	private final int WINDOW_HEIGHT = 300;
	
	public LoginMenu() {
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new LoginMenu();
	}
	
}
