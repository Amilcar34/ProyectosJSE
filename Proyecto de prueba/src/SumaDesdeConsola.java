import javax.swing.*;
import java.util.*; //importo esto para crear un objeto del tipo Scanner


public class SumaDesdeConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada_de_consola = new Scanner(System.in); //como es dinamico creamos un objeto del tipo Scanner
															 //tipo Scanner = instanciar una clase (clase Scanner)
		System.out.println("ingresa tu nombre");		
		String nombre = entrada_de_consola.nextLine();
		
		System.out.println("ingresa el primer numero");
		int primerNumero = entrada_de_consola.nextInt();
		
		System.out.println("pone el segundo numero");		
		int segundoNumero = entrada_de_consola.nextInt();
		//int a = Integer.parseInt(segundoNumero);  //esta mierda no funca y no se porque
	
		int r = primerNumero + segundoNumero;
		
		System.out.println("Sr: " + nombre + "la suma es: " + r);
	}

}
