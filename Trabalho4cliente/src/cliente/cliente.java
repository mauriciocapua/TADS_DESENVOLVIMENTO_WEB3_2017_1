package cliente;

import java.util.Scanner;

import com.sun.xml.rpc.processor.generator.InterfaceSerializerGenerator;

import trab.*;

public class cliente {
	public static void main(String args[]) {
		ServerService ss = new ServerService();
		Server s = ss.getServerPort();

		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		do {
			System.out.println("Informe a opção desejada: 1 - buscar região 2 - buscar UF");
			opcao = (Integer.parseInt(scanner.nextLine()));
			switch (opcao) {
			case 1:
				System.out.println("Informe o UF:");
				System.out.println(s.obtemRegiao(scanner.nextLine()));
				break;
			case 2:
				System.out.println("Informe a região:");
				System.out.println(s.obtemUF(scanner.nextLine()));
				break;
			}
		} while (opcao != -1);

	}
}
