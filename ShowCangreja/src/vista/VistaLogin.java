package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Login;
import controlador.Controlador;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class VistaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JPasswordField textContrasena;

	public VistaLogin() {
		setForeground(Color.BLACK);
		setFont(new Font("Verdana", Font.PLAIN, 13));
		setTitle("  Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(2, 0, 0, 0, (Color) Color.LIGHT_GRAY));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botonIniciarSesion = new JButton("Registrarse");
		botonIniciarSesion.setIcon(null);
		botonIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		botonIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Interface().setVisible(true);
				dispose();
				
				try {
                    String usuario = textUsuario.getText();
                    String contrasena = textContrasena.getText();
                    Login login = new Login(usuario, contrasena);
                    
                    new Controlador().crearUsuario(login);
                    
                    } catch(Exception error) {
                        JOptionPane.showMessageDialog(null, "Introduce los datos correctamente");
                        return;
                    }
			}
		});
		botonIniciarSesion.setBounds(146, 216, 114, 21);
		contentPane.add(botonIniciarSesion);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VistaLogin.class.getResource("/Recursos/Cangrejo.jpg")));
		lblNewLabel.setBounds(270, 84, 156, 81);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(22, 152, 114, 13);
		contentPane.add(lblNewLabel_1);
		
		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textUsuario.setForeground(Color.RED);
		textUsuario.setBackground(Color.LIGHT_GRAY);
		textUsuario.setBounds(146, 95, 114, 19);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Usuario");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(22, 99, 69, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Show Cangreja");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_3.setBounds(127, 21, 209, 42);
		contentPane.add(lblNewLabel_3);
		
		textContrasena = new JPasswordField();
		textContrasena.setForeground(Color.RED);
		textContrasena.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textContrasena.setBackground(Color.LIGHT_GRAY);
		textContrasena.setBounds(146, 146, 114, 19);
		contentPane.add(textContrasena);
		
		setVisible(true);
	}
}

