import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class MainMenu extends JFrame {

	private JFrame frameMainMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frameMainMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameMainMenu = new JFrame();
		frameMainMenu.setBounds(100, 100, 695, 628);
		frameMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{38, 125, 98, 125, 115, 125, 0};
		gridBagLayout.rowHeights = new int[]{64, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		frameMainMenu.getContentPane().setLayout(gridBagLayout);
		
		JButton btnAdd = new JButton("Add");
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.fill = GridBagConstraints.BOTH;
		gbc_btnAdd.insets = new Insets(0, 0, 0, 5);
		gbc_btnAdd.gridx = 1;
		gbc_btnAdd.gridy = 0;
		frameMainMenu.getContentPane().add(btnAdd, gbc_btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		GridBagConstraints gbc_btnUpdate = new GridBagConstraints();
		gbc_btnUpdate.fill = GridBagConstraints.BOTH;
		gbc_btnUpdate.insets = new Insets(0, 0, 0, 5);
		gbc_btnUpdate.gridx = 3;
		gbc_btnUpdate.gridy = 0;
		frameMainMenu.getContentPane().add(btnUpdate, gbc_btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		GridBagConstraints gbc_btnDelete = new GridBagConstraints();
		gbc_btnDelete.fill = GridBagConstraints.BOTH;
		gbc_btnDelete.gridx = 5;
		gbc_btnDelete.gridy = 0;
		frameMainMenu.getContentPane().add(btnDelete, gbc_btnDelete);
	}

}
