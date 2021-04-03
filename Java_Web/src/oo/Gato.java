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
		if (verificaVivoMorto) {
			System.out.println("Som: Miau Miau");
		}else {
			System.out.println("Som: Nao emite som morto");
		}
	}

	@Override
	public boolean isAdulto() {
		return idade > 2;
	}

	@Override
	public boolean verificaVivoMorto() {
		return true;
	}

	@Override
	public void morrer() {
		verificaVivoMorto = false;
	}
	
	
}
