package finalProject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ManipuladorArquivo {
	public static void leitor(String path) throws IOException {
		BufferedReader leitor = new BufferedReader(new FileReader(path));
		String ProjetoSocial = "";
		while (true) {
			if (ProjetoSocial != null) {
				System.out.println(ProjetoSocial);

			} else
				break;
			ProjetoSocial = leitor.readLine();
		}
		leitor.close();
	}

	public static void escritor(String path) throws IOException {
		BufferedWriter escrever = new BufferedWriter(new FileWriter(path));

	}
}
