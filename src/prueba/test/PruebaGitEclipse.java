package prueba.test;

import prueba.modelo.Saludo;
/*
 * Punto de entrada a la aplicaci�n
 * @author I�igo, David Burguete, Javier
 * 
 * */
public class PruebaGitEclipse {

	public static void main(String[] args) {
		Saludo saludo = new Saludo();
		System.out.println(saludo.saludar("Juan"));
		System.out.println(saludo.saludar("Javier"));
		System.out.println(saludo.saludar("Isabel"));
		System.out.println(saludo.saludar("Felipe"));
	}

}
