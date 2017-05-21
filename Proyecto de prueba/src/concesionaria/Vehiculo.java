package concesionaria;

public class Vehiculo {

	private int ruedas;
	int alto;
	int ancho;
	int largo;
	int puertas;
	private String color;
	
	public Vehiculo(){
		
		ruedas = 4;
		alto = 200;
		ancho = 300;
		largo = 400;
	}
	
	public int devuelve_ruedas(){  //GETTER - metodo que capta valor 
		return ruedas;}
	
	
	public void establece_color(){  //Setter - metodo que define valor
		color = "verde";}		  //podemos hacer esto inccluso sin haber dado valor en el constructor
	
	public String devuelve_color(){						//Getter 
		return "El color del Vehiculo es " + color;}  //le dijimos que devolvia un tipo de dato (String) por eso el "return"
	
	public void establese_puertas(){  //setter
		puertas = 4;}
	
	public String devuelve_puertas(){  //getter
		return "el vehiculo tiene " + puertas + " puertas";}
	
	
}
