package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import beans.Like;
import beans.Usuario;
import controlador.Controlador;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class verMatch extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	public verMatch() {
		setForeground(Color.DARK_GRAY);
		setFont(new Font("Verdana", Font.PLAIN, 13));
		setTitle("  Match");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(2, 0, 1, 0, (Color) Color.LIGHT_GRAY));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DefaultTableModel dtm = new DefaultTableModel();
        table = new JTable(dtm);
        table.setBorder(new LineBorder(Color.RED, 2));
        table.setBounds(22, 55, 389, 136);
        contentPane.add(table);

        dtm.addColumn("nombre");
        dtm.addColumn("edad");
        dtm.addColumn("peso");
        dtm.addColumn("altura");
        dtm.addColumn("ubicacion");
		
		JButton btnNewButton = new JButton("Regresar al menu principal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Interface().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton.setBounds(22, 232, 389, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Estos son tus Match's");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(112, 10, 214, 39);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Refrescar datos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

		                ArrayList<Like> likes = new Controlador().refrescarLikes();
		                dtm.getDataVector().removeAllElements();
		                dtm.fireTableDataChanged();

		                // Montar los datos recogidos en la tabla jejejje

		                for(Like like : likes){
		                    Object[] fila = new Object[5];
		                    fila[0] = like.getNombre();
		                    fila[1] = like.getEdad();
		                    fila[2] = like.getPeso();
		                    fila[3] = like.getAltura();
		                    fila[4] = like.getUbicacion();

		                    dtm.addRow(fila);
		                }
		            }
		        });	
		
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnNewButton_1.setBounds(22, 201, 389, 21);
		contentPane.add(btnNewButton_1);
	}

}
