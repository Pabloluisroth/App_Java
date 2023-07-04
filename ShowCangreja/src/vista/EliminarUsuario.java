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
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import beans.Usuario;
import controlador.Controlador;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class EliminarUsuario extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textNombre;
	private JTextField textEdad;
	private JTextField textPeso;
	private JTextField textAltura;
	private JTextField textUbicacion;


	public EliminarUsuario() {
		setTitle("  Eliminar  usuario");
		setFont(new Font("Verdana", Font.PLAIN, 13));
		setForeground(Color.BLACK);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 779, 658);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(2, 0, 0, 0, (Color) Color.LIGHT_GRAY));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		DefaultTableModel dtm = new DefaultTableModel();
        table = new JTable(dtm);
        table.setBorder(new LineBorder(Color.RED, 2));
        table.setBounds(244, 81, 482, 184);
        contentPane.add(table);

        dtm.addColumn("nombre");
        dtm.addColumn("edad");
        dtm.addColumn("peso");
        dtm.addColumn("altura");
        dtm.addColumn("ubicacion");
		
		JButton btnNewButton = new JButton("Eliminar Cuenta");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String nombre = textNombre.getText();
					int edad =Integer.parseInt(textEdad.getText());
					int peso =Integer.parseInt(textPeso.getText());
					int altura =Integer.parseInt(textAltura.getText());
					String ubicacion = textUbicacion.getText();
					Usuario usuario = new Usuario(nombre, edad, altura, peso, ubicacion);
					new Controlador().sacarEliminado(usuario);

				} catch(Exception error) {
					JOptionPane.showMessageDialog(null, "Introduce los datos correctamente");
					
					return;
					}
				}	
		});
		
		btnNewButton.setBounds(58, 522, 668, 21);
		contentPane.add(btnNewButton);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Estas seguro que deseas desaparecer de show cangreja ?");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(46, 26, 687, 44);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(EliminarUsuario.class.getResource("/Recursos/cangrejo_sorpreson.jpg")));
		lblNewLabel_2.setBounds(46, 136, 144, 65);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(61, 299, 129, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Edad");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(62, 346, 120, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Peso");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(61, 400, 45, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Altura");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(61, 445, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Ubicacion");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setBounds(61, 485, 45, 13);
		contentPane.add(lblNewLabel_7);
		
		textNombre = new JTextField();
		textNombre.setBackground(Color.LIGHT_GRAY);
		textNombre.setForeground(Color.RED);
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textNombre.setBounds(141, 297, 171, 19);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textEdad = new JTextField();
		textEdad.setForeground(Color.RED);
		textEdad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textEdad.setBackground(Color.LIGHT_GRAY);
		textEdad.setBounds(143, 344, 169, 19);
		contentPane.add(textEdad);
		textEdad.setColumns(10);
		
		textPeso = new JTextField();
		textPeso.setForeground(Color.RED);
		textPeso.setBackground(Color.LIGHT_GRAY);
		textPeso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textPeso.setBounds(142, 395, 170, 19);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		textAltura = new JTextField();
		textAltura.setBackground(Color.LIGHT_GRAY);
		textAltura.setForeground(Color.RED);
		textAltura.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textAltura.setBounds(141, 443, 171, 19);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		textUbicacion = new JTextField();
		textUbicacion.setForeground(Color.RED);
		textUbicacion.setBackground(Color.LIGHT_GRAY);
		textUbicacion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textUbicacion.setBounds(141, 483, 171, 19);
		contentPane.add(textUbicacion);
		textUbicacion.setColumns(10);
		
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
		
		
				
		refrescarUsuarios.setBounds(61, 243, 144, 21);
		contentPane.add(refrescarUsuarios);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(EliminarUsuario.class.getResource("/Recursos/cangrejoEliminado.jpg")));
		lblNewLabel.setBounds(355, 297, 352, 201);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Regresar al menu principal");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Interface().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_1.setBounds(58, 556, 668, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Generar documento del usuario eliminado");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre = (textNombre.getText());
				int edad = Integer.parseInt(textEdad.getText());
				int peso = Integer.parseInt(textPeso.getText());
				int altura = Integer.parseInt(textAltura.getText());
                String ubicacion = (textUbicacion.getText());

                new Controlador().crearFicheroEliminado(nombre, edad, peso, altura, ubicacion);
			}
		});
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_2.setBounds(58, 587, 668, 21);
		contentPane.add(btnNewButton_2);
	
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

