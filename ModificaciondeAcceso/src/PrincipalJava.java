import paquete1.persona1;
public class PrincipalJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		persona1 persona = new persona1();
		//Todas las que marcan error porque desde aqu� no se pueden modificar
		//debido a que est�n en otra clase, a excepci�n de ESTATURA, que es p�blica
		persona.nombre = "Claudia Flores"; //diferente clase a la principal
		persona.edad = 25; //edad es privada
		persona.domicilio = "Ciudad de M�xico"; //diferente clase a la principal
		persona.estatura = 1.60f; //f de n�mero flotante FLOAT 


	}

}
