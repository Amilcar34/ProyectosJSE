import java.util.ArrayList;

public class Array {
	public static void main(String[] args) {

	int temporal = 0;;
	int banderaF = 0;
	int masCaro = 0;
	
	//cambia el orden de los valores, siepre se te tiene que imprimir 5 en la consola
	  
	  int i[]={2,4,5,3};
	
	do{
		banderaF = 0;
		
		for(int a =0; a < i.length -1 ; a++)
		{
			if(i[a] < i[ a + 1 ] )
			{
				temporal = i[a];
				
				i[a] = i[a + 1];
				
				i[a+1] = i[a];
				
				banderaF = 1;
			}
		}
	} while(banderaF == 1);
	
	masCaro = i[0];
	
	System.out.println(masCaro);
	
	}
}

