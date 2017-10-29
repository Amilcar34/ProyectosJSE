

public final class Algoritmo1 {

	public static void main(String args[]) {

		int c = 0;
		boolean flag = true;

		for (int i = 0; i < 3; i++) {
			while (flag) {
				c++;								// la sentencia i>c || c>5 arranca con valores 0>1 || 1>5
													// y va a dar false hasta que 'c' -> 6
				if (i > c || c > 5)	flag = false;	//i>c simepre es falso, solo se modifica c>5
			}
		}
		System.out.println(c);
	}
}
