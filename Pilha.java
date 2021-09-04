package atividade3;

import java.util.Scanner;

public class Pilha {
	
	String elementos[];
	int ultimoElemento;
	Scanner sc = new Scanner(System.in);
	
	public Pilha() {
		elementos = new String[10];
		ultimoElemento = -1; 
	}
	
	public void adicionarElemento(String e) {
		if(estaCheia()) {
			throw new RuntimeException("Pilha cheia");
			}
		ultimoElemento++;
		elementos[ultimoElemento] = e;
	}
	
	public void desempilhar() {
		if(estaVazia()) {
			throw new RuntimeException("Pilha vazia");
		}
		elementos[ultimoElemento] = null;
		ultimoElemento--;
	
	}
	
	public boolean estaVazia() {
		if(ultimoElemento == -1) {
			return true;
		}
		return false;
	}
	
	public boolean estaCheia() {
		if(ultimoElemento == 9) {
			return true;
		}
		return false;
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
