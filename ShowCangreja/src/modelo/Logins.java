package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.Conexion;
import beans.Baneado;
import beans.Login;
import beans.Usuario;
import vista.VistaLogin;

public class Logins {
	
	public void crearLogin(Login login) {
		String usuario = login.getUsuario();
		String contrasena = login.getContrasena();
		Conexion.ejecutarUpdate("INSERT INTO logins (usuario, contrasena) VALUES ('"+usuario+"', '"+contrasena+"');");
	}
	
	public ArrayList<Login> recogerLogins(){
		
		// TODO: Hacer la petici�n a BBDD para recoger los usuarios y sus contrasenas//
		
		ArrayList<Login> login = new ArrayList<Login>();
		ResultSet resultado = Conexion.ejecutarSentencia("SELECT * FROM usuario;");
		try {
			while(resultado.next()) {
				String usuario = resultado.getString("usuario");
				String contrasena = resultado.getString("contrasena");
				login.add(new Login(usuario, contrasena));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return login;
	}
	
	public void borrarLogin(String usuario, String contrasena) {
		Conexion.ejecutarUpdate("DELETE FROM alumnos WHERE ="+usuario+";"+contrasena);
	}

	public void modificarLogin(Login login) {
		String usuario = login.getUsuario();
		String contrasena = login.getContrasena();
		
		Conexion.ejecutarUpdate("UPDATE login SET nombre='"+usuario+"', '"+contrasena+";");
		
	}
	
	public void insertarLogin(Login logins) {
		String usuario= logins.getUsuario();
		String contrasena = logins.getContrasena();	
		System.out.println(usuario + contrasena);
		Conexion.ejecutarUpdate("INSERT INTO login (USUARIO,  CONTRASEÑA)"+" VALUES ('"+usuario+"', '"+contrasena+"');");
	}

}
