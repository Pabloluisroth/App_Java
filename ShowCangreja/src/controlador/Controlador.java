package controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.Baneado;
import beans.Like;
import beans.Login;
import beans.Usuario;

import modelo.Baneados;
import modelo.Likes;
import modelo.Logins;
import modelo.Usuarios;

// importar las vistas ......y.......borrar comentario tras importar//

public class Controlador {
	
	// 1º beans llamado al controlador ( usuarios ) //
	
	public ArrayList<Usuario> recogerUsuarios(){
		
		// TODO: Llamar al modelo para recoger los usuarios//
		
		ArrayList<Usuario> usuarios = new Usuarios().recogerUsuarios(); 
		return usuarios;
	}

	
	// vistas donde interactua el beans //
	
	
	
	//----------------------------------------------------------------------------------------------------------------//
	
	//----- 2º beans Login -----//
	
	public ArrayList<Login> recogerLogins(){
		
		// TODO: Llamar al modelo para recoger los logins//
		
		ArrayList<Login> logins = new Logins().recogerLogins();
		return logins;
	}
		
		// vistas donde interactua el login //
		
		
		
		//-------------------------------------------------------------------------------------------------------------//
		
		//----- 3º beans Login -----//
		
	public ArrayList<Like> recogerLikes(){
			
		// TODO: Llamar al modelo para recoger los like//
			
		ArrayList<Like> likes = new Likes().recogerlikes();
		return likes;
	}
			
		// vistas donde interactua el like //
		
		
		
		//--------------------------------------------------------------------------------------------------------------//
		
		//----- 4º beans baneado -----//
		
	public ArrayList<Baneado> recogerBaneados(){
			
		// TODO: Llamar al modelo para recoger los baneados//
			
		ArrayList<Baneado> baneados = new Baneados().recogerBaneados();
		return baneados;
	}
			
		// vistas donde interactua el baneado //	
		
		//...............................................................................................................//
		
		// insertar usuario en bbd //
		
		public void crearUsuario(Login login) {
			new Logins().insertarLogin(login);
			JOptionPane.showMessageDialog(null, "El usuario se ha registrado correctamente");
	    }
		
		public void crearBaneado(Baneado baneado) {
			new Baneados().insertarBaneado(baneado);
			JOptionPane.showMessageDialog(null, "El usuario se ha baneado correctamente");
		}

		public void introducirUsuario(Usuario usuario) {
			new Usuarios().insertarUsuario(usuario);
			JOptionPane.showMessageDialog(null, "El usuario se ha introducido correctamente");
			}
		
		public void sacarEliminado(Usuario usuario) {
			new Usuarios().borrarUsuario(usuario);
			JOptionPane.showMessageDialog(null, "El usuario se ha eliminado correctamente");
			}

		public void modificarUsuario(Usuario usuario) {
			new Usuarios().modificarUsuario(usuario);
			JOptionPane.showMessageDialog(null, "El usuario se ha modificado correctamente");
			}
		
		public ArrayList<Usuario> refrescarUsuarios() {
	        ArrayList<Usuario> usuarios = new Usuarios().refrescarUsuarios();
	        return usuarios;
	    }
		
		public ArrayList<Like> refrescarLikes() {
	        ArrayList<Like> likes = new Likes().recogerlikes();
	        return likes;
	    }
		
		public void crearFicheroUsuario(String nombre, int edad, int peso, int altura, String ubicacion) {
	        new Baneados().crearFichero(nombre, edad, peso, altura, ubicacion);
	    }
		
		public void crearFicheroEliminado(String nombre, int edad, int peso, int altura, String ubicacion) {
	        new Usuarios().crearFicheroEliminado(nombre, edad, peso, altura, ubicacion);
	    }
		
		public void crearFicheroNuevoUsuario(String nombre, int edad, int peso, int altura, String ubicacion) {
	        new Usuarios().crearFicheroNuevoUsuario(nombre, edad, peso, altura, ubicacion);
	    }
}
