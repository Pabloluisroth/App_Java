package main;

import bbdd.Conexion;
import beans.Login;
import vista.BanearUsuario;
import vista.EliminarUsuario;
import vista.Interface;
import vista.Introduccionusuario;
import vista.Match;
import vista.ModificarUsuario;
import vista.VistaLogin;

public class Main {

	

	public static void main(String[] args) {
		Conexion.conectar();
		
		new VistaLogin();
		
		
		// abrir ventana principal //
	}

}