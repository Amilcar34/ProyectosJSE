import javax.swing.JOptionPane;

public class Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String segundoNumero;
		
		String nombre = JOptionPane.showInputDialog("ingrese nombre");
		
		String primerNumero = JOptionPane.showInputDialog("Introduce 1er numero");
		int a = Integer.parseInt(primerNumero);
		
		segundoNumero = JOptionPane.showInputDialog("Introduce 2do numero");		
		int b = Integer.parseInt(segundoNumero);

		int r = a + b;

		System.out.println("Sr: " + nombre + "la suma es: " + r);
	}

}
