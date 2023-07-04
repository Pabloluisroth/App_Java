package controlador;

import java.util.ArrayList;
import modelo.Baneados;
import vista.verBaneados;
import beans.Baneado;


public class ControladorVentanas {

	public void abrirVerBaneados() {
		// 1 Recoger los baneados
		ArrayList<Baneado> baneados = new Baneados().recogerBaneados();
		// Abrir ventana ver Baneados con los datos
		new verBaneados(baneados);
		
	}
	
	/* public void abrirVerMatchs() {
		// 1 Recoger los baneados
		ArrayList<Match> matchs = new matchs().recogerMatch();
		// Abrir ventana ver match con los datos de forma externa
		new verMatch(matchs);
		
	}*/

}
