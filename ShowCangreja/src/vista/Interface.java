package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.MatteBorder;

public class Interface extends JFrame {

	private JPanel contentPane;

	public Interface() {
		setTitle(" Menu principal");
		setForeground(Color.BLACK);
		setFont(new Font("Verdana", Font.PLAIN, 13));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(192, 192, 192)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		JButton btnNewButton = new JButton("A\u00F1adir Usuario");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Introduccionusuario().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(20, 71, 174, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modificar  Usuario");
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ModificarUsuario().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(20, 111, 174, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Banear Usuario");
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BanearUsuario().setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(20, 154, 174, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Eliminar Usuario");
		btnNewButton_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EliminarUsuario().setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(20, 197, 174, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Encuentra tu Match");
		btnNewButton_4.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Match().setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setBounds(20, 232, 391, 21);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Interface.class.getResource("/Recursos/cangrejito.png")));
		lblNewLabel.setBounds(204, 22, 222, 196);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Que deseas hacer ?");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(20, 22, 187, 27);
		contentPane.add(lblNewLabel_1);
		
		
	}

}
