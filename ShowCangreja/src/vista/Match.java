package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import beans.Usuario;
import controlador.Controlador;
import controlador.ControladorVentanas;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JComboBox;

public class Match extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTable table_1;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JTable table_2;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	
	public Match() {
		setTitle("  Match");
		setForeground(Color.BLACK);
		setFont(new Font("Verdana", Font.PLAIN, 13));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 569);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(2, 0, 0, 0, (Color) Color.LIGHT_GRAY));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		DefaultTableModel dtm = new DefaultTableModel();
        table = new JTable(dtm);
        table.setBorder(new LineBorder(Color.RED, 2));
        table.setBounds(10, 85, 416, 116);
        contentPane.add(table);

        dtm.addColumn("nombre");
        dtm.addColumn("edad");
        dtm.addColumn("peso");
        dtm.addColumn("altura");
        dtm.addColumn("ubicacion");
		
		JButton btnNewButton = new JButton("Usuario 1");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 243, 99, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Usuario 2");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(10, 274, 99, 21);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(119, 243, 307, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setBounds(119, 276, 307, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Generar Match");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new verMatch().setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(10, 465, 416, 25);
		contentPane.add(btnNewButton_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 167, 402, -84);
		contentPane.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setBounds(107, 156, 1, 1);
		contentPane.add(table_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Match.class.getResource("/Recursos/cangrejo_izquierda.jpg")));
		lblNewLabel.setBounds(10, 10, 131, 68);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Match.class.getResource("/Recursos/cangrejo_derecha.jpg")));
		lblNewLabel_1.setBounds(274, 10, 131, 68);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Match.class.getResource("/Recursos/corazon.jpg")));
		lblNewLabel_2.setBounds(156, 10, 106, 68);
		contentPane.add(lblNewLabel_2);
		
		JButton refrescarUsuarios = new JButton("Refrescar datos");
		refrescarUsuarios.setForeground(Color.BLACK);
		refrescarUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 13));
		refrescarUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 ArrayList<Usuario> usuarios = new Controlador().refrescarUsuarios();
	                dtm.getDataVector().removeAllElements();
	                dtm.fireTableDataChanged();

	                // Montar los datos recogidos en la tabla jejejje

	                for(Usuario usuario : usuarios){
	                    Object[] fila = new Object[5];
	                    fila[0] = usuario.getNombre();
	                    fila[1] = usuario.getEdad();
	                    fila[2] = usuario.getPeso();
	                    fila[3] = usuario.getAltura();
	                    fila[4] = usuario.getUbicacion();

	                    dtm.addRow(fila);
	                }
	            }
	        });	
				
		refrescarUsuarios.setBounds(10, 210, 416, 21);
		contentPane.add(refrescarUsuarios);
		
		JButton btnNewButton_3 = new JButton("Regresar interface");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Interface().setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_3.setBounds(10, 500, 416, 21);
		contentPane.add(btnNewButton_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(119, 310, 307, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Usuario 3");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_4.setBounds(10, 308, 99, 21);
		contentPane.add(btnNewButton_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(119, 339, 307, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Usuario 4");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_5.setBounds(10, 339, 99, 21);
		contentPane.add(btnNewButton_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(119, 368, 307, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(119, 401, 307, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(119, 430, 307, 19);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("Usuario 5");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_6.setBounds(10, 367, 99, 21);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Usuario 6");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_7.setBounds(10, 400, 99, 21);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Usuario 7");
		btnNewButton_8.setBounds(10, 429, 99, 21);
		contentPane.add(btnNewButton_8);
		
		
		
	}
}
