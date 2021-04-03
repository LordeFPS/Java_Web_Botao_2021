package oo;

// Criando Classe Gato Aula 2
public class Gato extends Animal{

	public Gato(String nome) {
		super(nome, "Gato");
	}
	
	public Gato(String nome, String especie, int idade) {
		super(nome, especie, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println("Som: Miau Miau");
		
	}

	@Override
	public boolean isAdulto() {
		return idade > 2;
	}
}
