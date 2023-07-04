package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import beans.Usuario;
import controlador.Controlador;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ModificarUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textEdad;
	private JTextField TextAltura;
	private JTextField textPeso;
	private JTextField textUbicacion;
	private JTable table;
	private JScrollPane scrollPane_2;
	private JTable table_1;
	private JLabel lblNewLabel;
	private JButton refrescarUsuario;
	private JButton btnNewButton_1;

	
	public ModificarUsuario() {
		setTitle("  Modificar datos usuario");
		setForeground(Color.BLACK);
		setFont(new Font("Verdana", Font.PLAIN, 13));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 561, 324);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(2, 0, 0, 0, (Color) Color.LIGHT_GRAY));
		setContentPane(contentPane);
		setVisible(true);
		
		DefaultTableModel dtm = new DefaultTableModel();
        table = new JTable(dtm);
        table.setBorder(new LineBorder(Color.RED, 2));
        table.setBounds(220, 29, 305, 181);
        contentPane.add(table);

        dtm.addColumn("nombre");
        dtm.addColumn("edad");
        dtm.addColumn("peso");
        dtm.addColumn("altura");
        dtm.addColumn("ubicacion");
		
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(20, 36, 70, 13);
		contentPane.add(lblNewLabel_1);
		
		textNombre = new JTextField();
		textNombre.setBackground(Color.LIGHT_GRAY);
		textNombre.setForeground(Color.RED);
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textNombre.setBounds(100, 33, 96, 19);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Edad");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(20, 71, 70, 13);
		contentPane.add(lblNewLabel_2);
		
		textEdad = new JTextField();
		textEdad.setBackground(Color.LIGHT_GRAY);
		textEdad.setForeground(Color.RED);
		textEdad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textEdad.setBounds(100, 68, 96, 19);
		contentPane.add(textEdad);
		textEdad.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Altura");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(20, 106, 70, 13);
		contentPane.add(lblNewLabel_3);
		
		TextAltura = new JTextField();
		TextAltura.setForeground(Color.RED);
		TextAltura.setFont(new Font("Tahoma", Font.PLAIN, 13));
		TextAltura.setBackground(Color.LIGHT_GRAY);
		TextAltura.setBounds(100, 103, 96, 19);
		contentPane.add(TextAltura);
		TextAltura.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Peso");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(20, 143, 70, 13);
		contentPane.add(lblNewLabel_4);
		
		textPeso = new JTextField();
		textPeso.setBackground(Color.LIGHT_GRAY);
		textPeso.setForeground(Color.RED);
		textPeso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textPeso.setBounds(100, 140, 96, 19);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Ubicacion");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(20, 179, 70, 13);
		contentPane.add(lblNewLabel_5);
		
		textUbicacion = new JTextField();
		textUbicacion.setForeground(Color.RED);
		textUbicacion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textUbicacion.setBackground(Color.LIGHT_GRAY);
		textUbicacion.setBounds(100, 175, 96, 19);
		contentPane.add(textUbicacion);
		textUbicacion.setColumns(10);
		
		JButton btnNewButton = new JButton("Modificar datos");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton.setBounds(20, 220, 176, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String nombre = textNombre.getText();
					int edad =Integer.parseInt(textEdad.getText());
					int peso =Integer.parseInt(textPeso.getText());
					int altura =Integer.parseInt(TextAltura.getText());
					String ubicacion = textUbicacion.getText();
					Usuario usuario = new Usuario(nombre, edad, altura, peso, ubicacion);
					new Controlador().modificarUsuario(usuario);

				} catch(Exception error) {
					JOptionPane.showMessageDialog(null, "Introduce los datos correctamente");
					return;
					}
				}	
		});
		
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("No te dejes ningun dato !!!");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setBounds(249, 23, 266, 40);
		contentPane.add(lblNewLabel);
		
		JButton refrescarUsuarios = new JButton("Refrescar datos");
		refrescarUsuarios.setFont(new Font("Verdana", Font.PLAIN, 13));
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
				
				
		refrescarUsuarios.setBounds(220, 220, 305, 21);
		contentPane.add(refrescarUsuarios);
		
		JRadioButton radioButton = new JRadioButton("New radio button");
		radioButton.setBounds(62, 222, 103, 21);
		contentPane.add(radioButton);
		
		btnNewButton_1 = new JButton("Regresar menu principal");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Interface().setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_1.setBounds(20, 256, 505, 21);
		contentPane.add(btnNewButton_1);
		
		
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                if(table.getSelectedRow() == -1) return; 
                
                String nombre = (String) table.getValueAt(table.getSelectedRow(), 0);
                int edad = (int) table.getValueAt(table.getSelectedRow(), 1);
                int peso = (int) table.getValueAt(table.getSelectedRow(), 2);
                int altura = (int) table.getValueAt(table.getSelectedRow(), 3);
                String ubicacion = (String) table.getValueAt(table.getSelectedRow(), 4);
                
                textNombre.setText(nombre+"");
                textEdad.setText(edad+"");
                textPeso.setText(peso+"");
                TextAltura.setText(altura+"");
                textUbicacion.setText(ubicacion+"");
            
            }
        });
	}
}