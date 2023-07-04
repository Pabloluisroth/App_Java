package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import beans.Baneado;
import beans.Usuario;
import controlador.Controlador;
import controlador.ControladorVentanas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class BanearUsuario extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_1;
	private JTextField textNombre;
	private JTextField textEdad;
	private JTextField textAltura;
	private JTextField textPeso;
	private JTextField textUbicacion;


	public BanearUsuario() {
		setForeground(Color.BLACK);
		setFont(new Font("Verdana", Font.PLAIN, 13));
		setTitle("  Banear usuario");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 616, 638);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(2, 0, 0, 0, (Color) Color.LIGHT_GRAY));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		DefaultTableModel dtm = new DefaultTableModel();
        table = new JTable(dtm);
        table.setBorder(new LineBorder(Color.RED, 2));
        table.setBounds(224, 11, 359, 184);
        contentPane.add(table);

        dtm.addColumn("nombre");
        dtm.addColumn("edad");
        dtm.addColumn("peso");
        dtm.addColumn("altura");
        dtm.addColumn("ubicacion");
		
		JLabel lblNewLabel = new JLabel("Vamos a banear !!");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBounds(18, 24, 196, 42);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Banear");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				    String nombre = textNombre.getText();
				    int edad =Integer.parseInt(textEdad.getText());
				    int peso =Integer.parseInt(textPeso.getText());
				    int altura =Integer.parseInt(textAltura.getText());
				    String ubicacion = textUbicacion.getText();
				    Baneado baneado = new Baneado(nombre, edad, altura, peso, ubicacion);
				    new Controlador().crearBaneado(baneado);

				} catch(Exception error) {
				JOptionPane.showMessageDialog(null, "Introduce los datos correctamente");
				return;
				    }
				}
			
		});
		
		btnNewButton.setBounds(36, 446, 533, 21);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(BanearUsuario.class.getResource("/Recursos/cangrejo_sorpreson.jpg")));
		lblNewLabel_1.setBounds(36, 77, 154, 67);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("A quien quieres banear ?  introduce todos sus datos !");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(36, 215, 547, 42);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(35, 280, 71, 13);
		contentPane.add(lblNewLabel_3);
		
		textNombre = new JTextField();
		textNombre.setForeground(Color.RED);
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textNombre.setBackground(Color.LIGHT_GRAY);
		textNombre.setBounds(127, 276, 116, 19);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Edad");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(36, 316, 74, 13);
		contentPane.add(lblNewLabel_4);
		
		textEdad = new JTextField();
		textEdad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textEdad.setBackground(Color.LIGHT_GRAY);
		textEdad.setForeground(Color.RED);
		textEdad.setBounds(127, 312, 116, 19);
		contentPane.add(textEdad);
		textEdad.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Altura");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(36, 386, 70, 13);
		contentPane.add(lblNewLabel_5);
		
		textAltura = new JTextField();
		textAltura.setBackground(Color.LIGHT_GRAY);
		textAltura.setForeground(Color.RED);
		textAltura.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textAltura.setBounds(127, 380, 116, 19);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Peso");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(36, 352, 70, 15);
		contentPane.add(lblNewLabel_6);
		
		textPeso = new JTextField();
		textPeso.setBackground(Color.LIGHT_GRAY);
		textPeso.setForeground(Color.RED);
		textPeso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textPeso.setBounds(127, 349, 116, 19);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Ubicacion");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(36, 423, 70, 13);
		contentPane.add(lblNewLabel_7);
		
		textUbicacion = new JTextField();
		textUbicacion.setForeground(Color.RED);
		textUbicacion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textUbicacion.setBackground(Color.LIGHT_GRAY);
		textUbicacion.setBounds(127, 417, 116, 19);
		contentPane.add(textUbicacion);
		textUbicacion.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(BanearUsuario.class.getResource("/Recursos/cangrejoTriston.jpg")));
		lblNewLabel_8.setBounds(264, 281, 305, 143);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton_1 = new JButton("Ver tabla de baneados");
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new ControladorVentanas().abrirVerBaneados();
				
			}
		});
		btnNewButton_1.setBounds(36, 486, 533, 21);
		contentPane.add(btnNewButton_1);
		
		JButton refrescarUsuarios = new JButton("Refrescar");
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
				
		refrescarUsuarios.setBounds(36, 174, 154, 21);
		contentPane.add(refrescarUsuarios);
		
		JButton btnNewButton_2 = new JButton("Regresar al menu principal");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						new Interface().setVisible(true);
						dispose();
					}
			
		});
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_2.setBounds(36, 527, 533, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Generar documento del usuario baneado");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre = (textNombre.getText());
				
				int edad = Integer.parseInt(textEdad.getText());
				int peso = Integer.parseInt(textPeso.getText());
				int altura = Integer.parseInt(textAltura.getText());
                String ubicacion = (textUbicacion.getText());

                new Controlador().crearFicheroUsuario(nombre, edad, peso, altura, ubicacion);
				
			}
		});
		btnNewButton_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_3.setBounds(36, 565, 533, 21);
		contentPane.add(btnNewButton_3);
		
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
                textAltura.setText(altura+"");
                textUbicacion.setText(ubicacion+"");
            
            }
        });
	}
}