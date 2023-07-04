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
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import beans.Usuario;
import controlador.Controlador;

import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JSlider;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ImageIcon;

public class Introduccionusuario extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textEdad;
	private JTextField textAltura;
	private JTextField textPeso;
	private JTextField textUbicacion;
	private JTable table;
	private JLabel lblNewLabel;
	private JButton refrescarUsuarios;
	private JButton btnNewButton_1;

	
	public Introduccionusuario() {
		setForeground(Color.BLACK);
		setFont(new Font("Verdana", Font.PLAIN, 13));
		setTitle("  Nuevo usuario");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 614, 426);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(2, 0, 0, 0, (Color) Color.LIGHT_GRAY));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		DefaultTableModel dtm = new DefaultTableModel();
        table = new JTable(dtm);
        table.setBorder(new LineBorder(Color.RED, 2));
        table.setBounds(217, 110, 366, 174);
        contentPane.add(table);

        dtm.addColumn("nombre");
        dtm.addColumn("edad");
        dtm.addColumn("peso");
        dtm.addColumn("altura");
        dtm.addColumn("ubicacion");
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(27, 110, 68, 13);
		contentPane.add(lblNewLabel_1);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textNombre.setForeground(Color.RED);
		textNombre.setBackground(Color.LIGHT_GRAY);
		textNombre.setBounds(93, 110, 96, 19);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Edad");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(27, 156, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		textEdad = new JTextField();
		textEdad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textEdad.setForeground(Color.RED);
		textEdad.setBackground(Color.LIGHT_GRAY);
		textEdad.setBounds(93, 152, 96, 19);
		contentPane.add(textEdad);
		textEdad.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Altura");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(27, 231, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		textAltura = new JTextField();
		textAltura.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textAltura.setForeground(Color.RED);
		textAltura.setBackground(Color.LIGHT_GRAY);
		textAltura.setBounds(93, 227, 96, 19);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Peso");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(27, 196, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		textPeso = new JTextField();
		textPeso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textPeso.setForeground(Color.RED);
		textPeso.setBackground(Color.LIGHT_GRAY);
		textPeso.setBounds(93, 192, 96, 19);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Ubicacion");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(27, 271, 62, 13);
		contentPane.add(lblNewLabel_5);
		
		textUbicacion = new JTextField();
		textUbicacion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textUbicacion.setForeground(Color.RED);
		textUbicacion.setBackground(Color.LIGHT_GRAY);
		textUbicacion.setBounds(93, 265, 96, 19);
		contentPane.add(textUbicacion);
		textUbicacion.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Introducir datos");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton.setBounds(27, 296, 162, 21);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("No te dejes ningun dato !!!");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel.setBounds(217, 35, 366, 62);
		contentPane.add(lblNewLabel);
		
		refrescarUsuarios = new JButton("Refrescar");
		refrescarUsuarios.setFont(new Font("Verdana", Font.PLAIN, 13));

		refrescarUsuarios.setBounds(217, 295, 366, 22);
		contentPane.add(refrescarUsuarios);
		
		btnNewButton_1 = new JButton("Regresar al menu principal");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Interface().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_1.setBounds(27, 358, 558, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Introduccionusuario.class.getResource("/Recursos/Cangrejo.jpg")));
		lblNewLabel_6.setBounds(35, 30, 154, 67);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton_2 = new JButton("Generar documento del nuevo usuario");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre = (textNombre.getText());
				int edad = Integer.parseInt(textEdad.getText());
				int peso = Integer.parseInt(textPeso.getText());
				int altura = Integer.parseInt(textAltura.getText());
                String ubicacion = (textUbicacion.getText());

                new Controlador().crearFicheroNuevoUsuario(nombre, edad, peso, altura, ubicacion);
			}
		});
		
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_2.setBounds(25, 327, 558, 21);
		contentPane.add(btnNewButton_2);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Estas seguro que los datos son correctos?");
				
				
				try {
					String nombre = textNombre.getText();
					int edad =Integer.parseInt(textEdad.getText());
					int peso =Integer.parseInt(textPeso.getText());
					int altura =Integer.parseInt(textAltura.getText());
					String ubicacion = textUbicacion.getText();
					Usuario usuario = new Usuario(nombre, edad, altura, peso, ubicacion);
					new Controlador().introducirUsuario(usuario);

				} catch(Exception error) {
					JOptionPane.showMessageDialog(null, "Introduce los datos correctamente");
					return;
					}
				}
		
	});
				
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
