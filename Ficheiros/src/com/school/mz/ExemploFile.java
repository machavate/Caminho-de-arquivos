
package com.school.mz;

import java.io.File;

public class ExemploFile {
	public static void main(String[]args) {
		ExemploFile ef = new ExemploFile();
		ef.verificarCaminho("C:\\doc");
		ef.verificarCaminho("C:\\doc\\leitura.txt");
	}
	
	public void verificarCaminho(String Caminho) {
		File f = new File(Caminho);
		
		System.out.println(Caminho);
		if(f.isFile()) {
			System.out.println("Este caminho e de um arquivo");
		}else if(f.isDirectory()) {
			System.out.println("Este caminho de um directorio");
		}
	}
}
