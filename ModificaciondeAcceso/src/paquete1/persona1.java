package paquete1;
public class persona1 {
	
	//Modificador de acceos default, se puede acceder a los atributos
	//y objetos dentro del mismo paquete
    String nombre = "";
    
	//Modificador de acceso privado, se puede acceder sólo dentor de la misma
	//clase
	private int edad = 0;
	
	//Modificado protected, se puede acceder dentro de la misma clase y del
	//mismo paquete
	//Van a ser accesibles las propiedades aunque estén en otro paquete, 
	//a través de la herencia
	protected String domicilio = "";
	
	//Modificador public, se puede acceder desde la misma clase, y otros 
	//paquetes
	public float estatura = 0;
	
	
	
	String saludar() {
		
	return "Hola, mi nombre es " + this.nombre + "mi edad es " + this.edad +
		" mi domicilio es" + this.domicilio + "mi edad es " + this.estatura ;

	}

}
