package modelo;

import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.Conexion;
import beans.Baneado;
import beans.Usuario;

public class Baneados {
	
	public void crearBaneado(Baneado baneado) {
		String nombre = baneado.getNombre();
		int edad = baneado.getEdad();
		int altura = baneado.getAltura();
		int peso = baneado.getPeso();
		String ubicacion = baneado.getUbicacion();
		
		Conexion.ejecutarUpdate("INSERT INTO baneados (nombre, edad, altura, peso, ubicacion) VALUES ('"+nombre+"', '"+edad+"','"+altura+"','"+ubicacion+"');");
	}
	
	public ArrayList<Baneado> recogerBaneados(){
		
		// TODO: Hacer la peticion a BBDD para recoger los baneados//
		
		ArrayList<Baneado> baneados = new ArrayList<Baneado>();
		ResultSet resultado = Conexion.ejecutarSentencia("SELECT * FROM usuarios;");
		try {
			while(resultado.next()) {
				String nombre = resultado.getString("nombre");
				int edad = resultado.getInt("edad");
				int altura = resultado.getInt("altura");
				int peso = resultado.getInt("peso");
				String ubicacion = resultado.getString("ubicacion");
				baneados.add(new Baneado( nombre, edad, altura, peso, ubicacion));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return baneados;
	}
	
	public void borrarBaneado(String Usuario) {
		Conexion.ejecutarUpdate("DELETE FROM usuarios WHERE usuario="+Usuario+";");
	}

	public void modificarAlumno(Usuario usuario) {
		
		String nombre = usuario.getNombre();
		int edad = usuario.getEdad();
		int altura = usuario.getAltura();
		int peso = usuario.getPeso();
		String ubicacion = usuario.getUbicacion();
		
		Conexion.ejecutarUpdate("UPDATE Usuario SET usuario='"+nombre+"','"+edad+"','"+altura+"','"+peso+"','"+ubicacion+";");
	}
	
	public void insertarBaneado(Baneado baneado) {
		String nombre= baneado.getNombre();
		int edad = baneado.getEdad();
		int altura= baneado.getAltura();
		int peso= baneado.getPeso();
		String ubicacion = baneado.getUbicacion();
		Conexion.ejecutarUpdate("INSERT INTO baneados (NOMBRE,  EDAD, ALTURA, PESO, UBICACION)"+" VALUES ('"+nombre+"', '"+edad+"', '"+altura+"', '"+peso+"', '"+ubicacion+"');");
		}
	
	public void crearFichero(String nombre, int edad, int altura, int peso, String ubicacion) {
        FileWriter fichero = null;

        try {
            fichero = new FileWriter(nombre+"Baneado.txt");

            fichero.write("Nombre: " + nombre + "\nEdad: " + edad+ "\nAltura: "+altura+"\nPeso: "+peso+ "\nUbicacion: "+ubicacion);
            fichero.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
	
	//-----------------------fuchero usuario ------------------------//
	
	public void crearFicheroUsuarioNuevo(String nombre, int edad, int altura, int peso, String ubicacion) {
        FileWriter fichero = null;

        try {
            fichero = new FileWriter(nombre+"nuevoUsuario.txt");

            fichero.write("Nombre: " + nombre + "\nEdad: " + edad+ "\nAltura: "+altura+"\nPeso: "+peso+ "\nUbicacion: "+ubicacion);
            fichero.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
	
	
}
