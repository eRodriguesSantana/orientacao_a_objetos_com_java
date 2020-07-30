package jogo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class BancoDePalavras {
	
private ArrayList<String> palavras = new ArrayList<String>();
	
	// Método que lê de um arquivo cada palavra e armazena em uma ArrayList
	private void leitor() throws IOException {
		
	try {
			palavras.clear(); // Limpa a lista de palavras para um novo preenchimento		
			BufferedReader lerArq = new BufferedReader(new FileReader("arquivo.txt"));
			String linha = lerArq.readLine(); // lê a primeira linha do arquivo.
			while (linha != null)
			{
				palavras.add(linha.toLowerCase()); // adiciona cada palavra a uma posição na Lista.
				 linha = lerArq.readLine(); // continua lendo as linhas do arquivo.
			}
			lerArq.close();

		} catch (FileNotFoundException e) {
			
			System.out.println("Arquivo não encontrado");
		}
	}
	

	// Retorna lista com palavras lidas do arquivo
	private ArrayList <String> getListaPalavras () throws IOException
	{
		this.leitor();
		return palavras; 

	}

	
	// Metodo que retorna uma palavra aleatória contida na lista de palavras obtidas do arquivo.txt
	public String getPalavraAleatoria () throws IOException
	{
		// cria uma copia da lista de palavras para não ferir o encapsulamento da mesma.
		 @SuppressWarnings("unchecked")
		ArrayList<String> palavrasCopia = (ArrayList<String>) getListaPalavras().clone(); 
		 
		Collections.shuffle(palavrasCopia); 
		String a = palavrasCopia.get(0);
		return a;
	}
	

	}

