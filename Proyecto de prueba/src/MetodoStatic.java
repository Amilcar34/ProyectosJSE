
public class MetodoStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(contador(-4, 2));


}

	private static int contador(int dato, int date) {
		// TODO Auto-generated method stub
		
		int n = dato + date;
		
		while (n != 7){
			// System.out.println(n);
			n++;
		}
		return n;
	}
}