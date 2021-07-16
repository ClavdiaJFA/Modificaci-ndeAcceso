import paquete1.persona1;
public class PrincipalJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		persona1 persona = new persona1();
		//Todas las que marcan error porque desde aquí no se pueden modificar
		//debido a que están en otra clase, a excepción de ESTATURA, que es pública
		persona.nombre = "Claudia Flores"; //diferente clase a la principal
		persona.edad = 25; //edad es privada
		persona.domicilio = "Ciudad de México"; //diferente clase a la principal
		persona.estatura = 1.60f; //f de número flotante FLOAT 


	}

}
