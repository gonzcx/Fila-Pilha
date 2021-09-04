package atividade3;

import java.util.Scanner;

public class Fila {
	
	String elementos[];
	int ultimoElemento;
	int primeiroElemento;
	int total;
	Scanner sc = new Scanner(System.in);
	
	public Fila() {
		elementos = new String[10];
		ultimoElemento = 0;
		primeiroElemento = 0;
		total = 0;
		
	}
	
	public void adicionarElemento(String e) {
		if(estaCheia()) {
			throw new RuntimeException("Pilha cheia");
			}
		elementos[ultimoElemento] = e;
		ultimoElemento = (ultimoElemento + 1) % elementos.length;
		total++;
	}
	
	public void retirar() {
		if(estaVazia()) {
			throw new RuntimeException("Pilha vazia");
		}
		elementos[primeiroElemento] = null;
		primeiroElemento = (primeiroElemento + 1) % elementos.length;
		total--;
	}
	
	public boolean estaVazia() {
		return total == 0;
	}
	
	public boolean estaCheia() {
		return total == elementos.length;
	}
	
	public void pesquisar() {
		System.out.println("Qual número do elemento que quer pesquisar?");
		int p = sc.nextInt();
		System.out.println(elementos[p]);
	}

	
	public void mostrarTudo() {
		System.out.println("\n");
		for(int i = 0; i<elementos.length; i++) {
			if(elementos[i] == null) {
				elementos[i] = "";
			}
		System.out.print(elementos[i] + " ");
		}
	}

}
