package inso;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;

public class interfaz {

	private JFrame frame;
	private JTextField user, pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz window = new interfaz();
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
	public interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1366, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("AppGym");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		
		 
		
		
		JLabel usuario = new JLabel("Usuario");
		usuario.setHorizontalAlignment(SwingConstants.CENTER);
		usuario.setFont(new Font("Dialog", Font.BOLD, 20));
		usuario.setLocation(474, 278);
		usuario.setSize(110, 43);
		panel.add(usuario);
		
		JLabel password = new JLabel("Contraseña");
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setFont(new Font("Dialog", Font.BOLD, 20));
		password.setBounds(450, 367, 169, 43);
		panel.add(password);
		
		user = new JTextField();
		user.setFont(new Font("Dialog", Font.PLAIN, 20));
		user.setBounds(637, 374, 169, 33);
		panel.add(user);
		user.setColumns(10);
		
		pass = new JTextField();
		pass.setFont(new Font("Dialog", Font.PLAIN, 20));
		pass.setBounds(603, 285, 169, 33);
		panel.add(pass);
		pass.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Dialog", Font.BOLD, 18));
		btnAceptar.setBounds(554, 474, 137, 33);
		panel.add(btnAceptar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("imagenes/supera.png"));
		label.setBounds(508, 63, 317, 116);
		panel.add(label);
		
	
		
		
		
		
	}
}
