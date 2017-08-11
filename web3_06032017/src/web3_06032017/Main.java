package web3_06032017;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		// Encoder encoder = new Encoder();
		// String livro = encoder.leitura();
		//
		// try (PrintWriter out = new PrintWriter("livro.txt")) {
		// out.println(livro);
		// }
		//
		// MessageDigest md5 = MessageDigest.getInstance("MD5");
		// md5.update(StandardCharsets.UTF_8.encode(livro));
		//
		// try (PrintWriter out = new PrintWriter("md5livro.txt")) {
		// out.println(String.format("%032x", new BigInteger(1, md5.digest())));
		// }

		List<String> texto = new Decoder().readSmallTextFile("json.txt");
		System.out.println(texto);
		
		
	}
}
