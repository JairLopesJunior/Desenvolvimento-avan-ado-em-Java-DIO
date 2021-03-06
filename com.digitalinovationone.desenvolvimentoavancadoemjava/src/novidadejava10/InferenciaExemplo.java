package novidadejava10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class InferenciaExemplo {

	public static void main(String[] args) throws IOException {
		var url = new URL("http://jairlopesjr.000webhostapp.com/"); // Pega o nome da URL a ser feito o GET
		var urlConnection = url.openConnection(); // Abre uma conexão e realiza o GET no EndPoint
		var bf = new BufferedReader(new InputStreamReader(urlConnection.getInputStream())); // Pegar todas informações e coloca dentro do getInputStream 
		
		System.out.println( bf.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));

	}

}
