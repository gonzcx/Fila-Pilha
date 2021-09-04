package atividade3;

public class Main {

	public static void main(String[] args) {
		Fila f = new Fila();
		Pilha p = new Pilha();
		
		System.out.print("********Estrutura de Pilha********");
		
		p.adicionarElemento("Eduardo");
		p.adicionarElemento("Paulo");
		p.adicionarElemento("Marcio");
		p.adicionarElemento("Renato");
		
		p.mostrarTudo();
		
		p.adicionarElemento("Iago");
		
		p.mostrarTudo();
		
		p.adicionarElemento("Reginaldo");

		p.mostrarTudo();
		
		p.adicionarElemento("Ana Paula");
		
		p.mostrarTudo();
		
		p.adicionarElemento("Gabriela");
		
		p.mostrarTudo();
		
		p.desempilhar();
		
		p.mostrarTudo();
		
		p.desempilhar();
		
		p.mostrarTudo();
		
		p.desempilhar();
		
		p.mostrarTudo();
		
		p.desempilhar();
		
		p.mostrarTudo();
		
		System.out.println("\n");
		System.out.print("********Estrutura de Fila********");
		
		f.adicionarElemento("Eduardo");
		f.adicionarElemento("Paulo");
		f.adicionarElemento("Marcio");
		f.adicionarElemento("Renato");
		
		f.mostrarTudo();
		
		f.adicionarElemento("Iago");
		
		f.mostrarTudo();
		
	    f.adicionarElemento("Reginaldo");
	    
	    f.mostrarTudo();
	    
	    f.adicionarElemento("Ana Paula");
	    
	    f.mostrarTudo();
	    
	    f.adicionarElemento("Gabriela");
	    
	    f.retirar();
	    
	    f.mostrarTudo();
	    
        f.retirar();
	    
	    f.mostrarTudo();
	    
        f.retirar();
	    
	    f.mostrarTudo();
	    
        f.retirar();
	    
	    f.mostrarTudo();
	}

}
