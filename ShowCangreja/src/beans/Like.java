package beans;

public class Like {
	
	static String nombre;
	static int edad;
	static int altura;
	static int peso;
	static String ubicacion;
	
	public Like(String nombre, int edad, int altura, int peso, String ubicacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.ubicacion = ubicacion;
	}
	
		public  String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre){
			this.nombre = nombre;
		}
		
		public  int getEdad() {
			return edad;
		}
		
		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		public  int getAltura() {
			return altura;
		}
		
		public void setAltura(int altura) {
			this.altura = altura;
		}
	
		public  int getPeso() {
			return peso;
		}
		
		public void setPeso(int peso) {
			this.peso = peso;
		}
		
		public  String getUbicacion() {
			return ubicacion;
		}
		
		public void setUbicacion(String ubicacion) {
			this.ubicacion = ubicacion;
		}
}
