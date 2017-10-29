
public class NPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parametro(100000000);

	}

	private static void parametro(int i) {
		// TODO Auto-generated method stub
		
		for(int recorrido=0; recorrido < i; recorrido ++ ){
			
			if(esPrimo(recorrido)){
				System.out.println(recorrido);
			}
		}
	}

	private static boolean esPrimo(int recorrido) {
		// TODO Auto-generated method stub
		if (recorrido%2 == 0 || recorrido%3 == 0 || recorrido%5 ==0 || recorrido%7 == 0 || recorrido%9 == 0){
		return false;
		}else{
		return true;}
	}

}
