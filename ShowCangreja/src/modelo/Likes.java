package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.Conexion;
import beans.Like;

public class Likes {

	public void crearLike(Like like) {
		String nombre = like.getNombre();
		int edad = like.getEdad();
		int altura = like.getAltura();
		int peso = like.getPeso();
		String ubicacion = like.getUbicacion();
		
		Conexion.ejecutarUpdate("INSERT INTO likes (nombre, edad, altura, peso, ubicacion) VALUES ('"+nombre+"', '"+edad+"','"+altura+"','"+ubicacion+"');");
	}
	
	public ArrayList<Like> recogerlikes(){
		// TODO: Hacer la petici�n a BBDD para recoger los usuarios//
		ArrayList<Like> likes = new ArrayList<Like>();
		ResultSet resultado = Conexion.ejecutarSentencia("SELECT * FROM likes;");
		try {
			while(resultado.next()) {
				String nombre = resultado.getString("nombre");
				int edad = resultado.getInt("edad");
				int altura = resultado.getInt("altura");
				int peso = resultado.getInt("peso");
				String ubicacion = resultado.getString("ubicacion");
				likes.add(new Like( nombre, edad, altura, peso, ubicacion));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return likes;
	}
	
	public void borrarLike(String Like) {
		Conexion.ejecutarUpdate("DELETE FROM usuarios WHERE id="+Like+";");
	}

}
