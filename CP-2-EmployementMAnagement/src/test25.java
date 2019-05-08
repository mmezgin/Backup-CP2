import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test25 {

	private JFrame frame;
	private JTextField abc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test25 window = new test25();
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
	public test25() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnAnnm = new JButton("annm");
		btnAnnm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				abc.setText("zaaaaaaaaaaaaaaaaaaaaaaaa");
			}
		});
		frame.getContentPane().add(btnAnnm, BorderLayout.WEST);
		
		abc = new JTextField();
		frame.getContentPane().add(abc, BorderLayout.NORTH);
		abc.setColumns(10);
	}

}
