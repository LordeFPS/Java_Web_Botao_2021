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
		
		if (verificaVivoMorto) {
			System.out.println("Som: Au Au");
		}else {
			System.out.println("Som: Nao emite som morto");
		}
				
	}

	@Override
	public boolean isAdulto() {
		return idade >= 5;
		
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
