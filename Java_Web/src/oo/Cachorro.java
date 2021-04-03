package oo;

public class Cachorro extends Animal {
	
	public Cachorro(String nome) {
		super(nome, "Cachorro");
	}
	
	public Cachorro(String nome, String especie, int idade) {
		super(nome, especie, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println("Som: Au Au");
		
	}

	@Override
	public boolean isAdulto() {
		return idade >= 5;
		
	}
}
