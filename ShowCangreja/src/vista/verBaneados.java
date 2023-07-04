package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import beans.Baneado;

public class verBaneados extends JFrame {

	private JPanel contentPane;
	private JTable table;


	public verBaneados(ArrayList<Baneado> baneados) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 560, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de Baneados ");
		lblNewLabel.setBounds(173, 31, 284, 38);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 102, 481, 184);
		contentPane.add(scrollPane);
		
		DefaultTableModel dtm = new DefaultTableModel();
		table = new JTable(dtm);
		contentPane.add(table, BorderLayout.CENTER);
		
		/* Crear las columnas */
		
		dtm.addColumn("Nombre");
		dtm.addColumn("Edad");
		dtm.addColumn("Peso");
		dtm.addColumn("Altura");
		dtm.addColumn("Ubicación");
		
		/* Rellenar los datos con el array de baneados */
		
		for(Baneado baneado : baneados) {
			Object[] fila = new Object[5];
			fila[0] = baneado.getNombre();
			fila[1] = baneado.getEdad();
			fila[2] = baneado.getPeso();
			fila[3] = baneado.getAltura();
			fila[4] = baneado.getUbicacion();
			dtm.addRow(fila);			
		}
		
		scrollPane.setViewportView(table);
		
		setVisible(true);
	}
}
