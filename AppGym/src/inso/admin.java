package inso;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class admin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin window = new admin();
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
	public admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("AppGym");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		
		JLabel empleados = new JLabel("Añadir o eliminar empleados");
		empleados.setFont(new Font("Dialog", Font.BOLD, 16));
		empleados.setBounds(137, 87, 263, 55);
		panel.add(empleados);
		
		JLabel lblNewLabel = new JLabel("<html><body>Modificar las clases,<br> sus horarios y profesores</body></html>");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel.setBounds(137, 194, 276, 75);
		panel.add(lblNewLabel);
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.setFont(new Font("Dialog", Font.BOLD, 14));
		btnAcceder.setBounds(447, 103, 114, 25);
		panel.add(btnAcceder);
		
		JButton btnAcceder_1 = new JButton("Acceder");
		btnAcceder_1.setFont(new Font("Dialog", Font.BOLD, 14));
		btnAcceder_1.setBounds(447, 222, 114, 25);
		panel.add(btnAcceder_1);
		
		
	}
}
