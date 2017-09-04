import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BlobToPdf {

	private JFrame frame;
	private JTextField user_name;
	private JTextField password;
	private JTextField database;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlobToPdf window = new BlobToPdf();
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
	public BlobToPdf() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 823, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnTest = new JButton("Test");
		btnTest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "Pozdrav svima!");
			}
		});
		btnTest.setBounds(240, 76, 89, 23);
		frame.getContentPane().add(btnTest);
		
		user_name = new JTextField();
		user_name.setBounds(85, 28, 86, 20);
		frame.getContentPane().add(user_name);
		user_name.setColumns(10);
		
		password = new JTextField();
		password.setBounds(85, 77, 86, 20);
		frame.getContentPane().add(password);
		password.setColumns(10);
		
		database = new JTextField();
		database.setBounds(85, 122, 86, 20);
		frame.getContentPane().add(database);
		database.setColumns(10);
	}
}
