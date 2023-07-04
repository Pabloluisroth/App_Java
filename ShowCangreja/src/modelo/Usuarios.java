package modelo;

import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.Conexion;
import beans.Usuario;

public class Usuarios {
	
	public void insertarUsuario(Usuario usuario) {
		String nombre = usuario.getNombre();
		int edad = usuario.getEdad();
		int altura = usuario.getAltura();
		int peso = usuario.getPeso();
		String ubicacion = usuario.getUbicacion();
		Conexion.ejecutarUpdate("INSERT INTO usuarios (nombre, edad, peso, altura, ubicacion) VALUES ('"+nombre+"', '"+edad+"','"+peso+"','"+altura+"','"+ubicacion+"');");
	}
	
	public ArrayList<Usuario> recogerUsuarios(){
		
		//  Hacer la petici�n a BBDD para recoger los usuarios//
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ResultSet resultado = Conexion.ejecutarSentencia("SELECT * FROM usuarios;");
		try {
			while(resultado.next()) {
				String nombre = resultado.getString("nombre");
				int edad = resultado.getInt("edad");
				int altura = resultado.getInt("altura");
				int peso = resultado.getInt("peso");
				String ubicacion = resultado.getString("ubicacion");
				usuarios.add(new Usuario( nombre, edad, altura, peso, ubicacion));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuarios;
	}
	
	public void borrarUsuario(Usuario usuario) {
		String nombre = usuario.getNombre();
		int edad = usuario.getEdad();
		int altura = usuario.getAltura();
		int peso = usuario.getPeso();
		String ubicacion = usuario.getUbicacion();
		Conexion.ejecutarUpdate("DELETE FROM usuarios WHERE nombre='"+nombre+"';");
	}                         

	public void modificarUsuario(Usuario usuario) {
		
		String nombre = usuario.getNombre();
		int edad = usuario.getEdad();
		int altura = usuario.getAltura();
		int peso = usuario.getPeso();
		String ubicacion = usuario.getUbicacion();
		
		Conexion.ejecutarUpdate("UPDATE Usuario SET usuario='"+nombre+"',"+edad+","+altura+","+peso+",'"+ubicacion+"';");
	}
	
    public static ArrayList<Usuario> refrescarUsuarios(){

        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        ResultSet resultado = Conexion.ejecutarSentencia("SELECT * FROM usuarios;");

        try {
            while(resultado.next()) {
                String nombre = resultado.getString("nombre");
                int edad = resultado.getInt("edad");
                int peso = resultado.getInt("peso");
                int altura = resultado.getInt("altura");
                String ubicacion = resultado.getString("ubicacion");
                usuarios.add(new Usuario(nombre, peso, edad, altura, ubicacion));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }
    
    public void insertarEliminado(Usuario usuario) {
		String nombre= usuario.getNombre();
		int edad = usuario.getEdad();
		int altura= usuario.getAltura();
		int peso= usuario.getPeso();
		String ubicacion = usuario.getUbicacion();
		Conexion.ejecutarUpdate("INSERT INTO baneados (NOMBRE,  EDAD, ALTURA, PESO, UBICACION)"+" VALUES ('"+nombre+"', '"+edad+"', '"+altura+"', '"+peso+"', '"+ubicacion+"');");
		}
    
    public void crearFicheroEliminado(String nombre, int edad, int altura, int peso, String ubicacion) {
        FileWriter fichero = null;

        try {
            fichero = new FileWriter(nombre+"Eliminado.txt");

            fichero.write("Nombre: " + nombre + "\nEdad: " + edad+ "\nAltura: "+altura+"\nPeso: "+peso+ "\nUbicacion: "+ubicacion);
            fichero.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void crearFicheroNuevoUsuario(String nombre, int edad, int altura, int peso, String ubicacion) {
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
