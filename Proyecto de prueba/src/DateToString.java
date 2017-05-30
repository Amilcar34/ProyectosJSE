import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {

  public static void main(String[] args) {

		// Date puede se convertido a String con el método toString()
		// Usa una sintaxis general del tipo DD MM dd HH:mm:ss
		Date date = new Date();
		System.out.println(date.toString());

		// Se pueden definir formatos diferentes con la clase DateFormat
		// Obtenemos la fecha y la hora con el formato yyyy-MM-dd HH:mm:ss
		DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String convertido = fechaHora.format(date);
		System.out.println(convertido);

		// Obtenemos solamente la fecha pero usamos slash en lugar de guiones
		DateFormat fecha = new SimpleDateFormat("yyyy/MM/dd");
		convertido = fecha.format(date);
		System.out.println(convertido);

		// Tambien se puede obtener solo la hora
		DateFormat hora = new SimpleDateFormat("HH:mm:ss");
		convertido = hora.format(date);
		System.out.println(convertido);

	}

}