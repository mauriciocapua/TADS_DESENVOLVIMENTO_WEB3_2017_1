package web3_06032017;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Scanner;

public class Encoder {

	protected String livro;	
	protected static String[] itens = { "Codigo", "Lingua", "Titulo", "Data de publicacao (ddmmaaaa)", "Editora",
			"Autor" };
	protected static Integer[] sizes = { 10, 20, 100, 8, 50, 100 };
	private static Scanner ler;

	public String leitura() {

		livro = "";

		for (int i = 0; i < itens.length; i++) {
			if (i == itens.length - 1) {
				System.out.printf("Informe a Quantidade de autores:");
				String qtdeautores = formata(2);
				livro = livro + qtdeautores;
				for (int j = 0; j < Integer.parseInt(qtdeautores.trim()); j++) {
					System.out.printf("Informe o " + itens[i] + " " + (j + 1) + " do livro: ");
					livro = livro + (formata(sizes[i]));
				}
				i++;
			} else {
				System.out.printf("Informe o " + itens[i] + " do livro: ");
				livro = livro + (formata(sizes[i]));
			}
		}

		System.out.printf("Informe o formato do arquivo para capa:");
		String formato = formata(3);
		livro = livro + formato;

		System.out.printf("Informe o arquivo para capa:");
		ler = new Scanner(System.in);
		String capa = ler.nextLine();

		File file = new File(capa.trim() + "." + formato.trim());
		livro = livro + base64(file);

		System.out.printf(livro);

		return livro;
	}

	public String formata(int tamanho) {
		ler = new Scanner(System.in);
		String string = ler.nextLine();

		if (string.length() > tamanho) {
			return string.substring(0, tamanho);
		}

		if (string.length() < tamanho) {
			while (string.length() < tamanho) {
				string = string + " ";
			}
		}

		return string + " ";
	}

	public String base64(File file) {
		String base64 = null;

		try {
			FileInputStream fileInputStreamReader = new FileInputStream(file);
			byte[] bytes = new byte[(int) file.length()];
			fileInputStreamReader.read(bytes);
			base64 = new String(Base64.getEncoder().encode(bytes));
			fileInputStreamReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return base64;
	}

}
