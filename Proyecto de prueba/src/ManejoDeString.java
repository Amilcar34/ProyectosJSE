
public class ManejoDeString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String str = "Typing Code";
	
	char letra = str.charAt(2);
	System.out.println("Caracter en la posicion indicada " + letra);
	
	String nombre = "Tue May 30 00:00:00 ART 2017"; 
	String dia = nombre.substring(0, 3);
	String mes = nombre.substring(4, 7);
	String ano = nombre.substring(24, 28);
	String nDia = nombre.substring(8, 10);
	
	System.out.println(nDia);
	System.out.println(mes);
	System.out.println(ano);
	System.out.println(dia);
	}
}
