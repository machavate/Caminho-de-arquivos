package com.school.mz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExemploFileInputStream {
	public static void main (String[]args) {
		
		ExemploFileInputStream caso = new ExemploFileInputStream();
		caso.lerArquivo("C:\\doc\\leitura.txt");
	}
	
	public void lerArquivo(String caminho) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(caminho);
			
			int c;
			
			while((c = fis.read()) != -1) {
				System.out.println((char) c);
			}
		}catch(FileNotFoundException ex) {
			System.out.println("Erro! ao abrir o aequivo");
		}catch (IOException ex){
			System.out.println("Erro ao ler arquivo");
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
			}catch(IOException ex) {
				System.out.println("Erro ao fechar arquivo");
			}
		}
	}
}
