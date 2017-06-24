import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UsoDeSteam {

	public static void main(String[] args) {

		EscribiendoNuevo notaEscrita = new EscribiendoNuevo();
		notaEscrita.escribir();
		
		Lectura notaLectura = new Lectura();
		notaLectura.leer();
		
	}}

class EscribiendoNuevo{
	
	//esta clase crea un block de notas NUEVO(en el disco C) y le escribe una frace
	
	public void escribir(){
		
		String oracion = "Esto se va a imprimir";
		
		try {
			FileWriter escritura = new FileWriter("C:docJava.txt");
			
			for (int j = 0; j < oracion.length(); j++){
				escritura.write(oracion.charAt(j));
				}
			escritura.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}}}

class Lectura{
	
	public void leer(){
		
		//lee el archivo que creo la clase anterior mostrandolo por consola
		
		try {
			FileReader lectura = new FileReader("C:docJava.txt");
			
			int ascci = 0;
			
			while (ascci != -1){
				ascci = lectura.read();
				//el metodo read() devuelve en ascci lo que va lleyendo y al no encontrar nada devuelve un -1
				
				char letraHumana = (char)ascci;  
				
				System.out.print(letraHumana);
			}
			lectura.close();		
			
		} catch (IOException e) {

			System.out.println("ruta inexistente");
		}}}
