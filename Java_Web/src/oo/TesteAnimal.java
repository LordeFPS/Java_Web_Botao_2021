package oo;

public class TesteAnimal {

	public static void main(String[] args) {
		/*
		// metodo construtor, o new ele inicializa o nosso objeto
		Cachorro n1 = new Cachorro("spike");
		
		System.out.println("O nome do animal se chama " + n1.getNome() + 
						   " e pertence a especie " + n1.getEspecie()+
						   " e tem idade de " + n1.getIdade());
		if (n1.isAdulto() == true) {
			System.out.println("Animal adulto.");
		}else {
			System.out.println("Animal filhote.");
		}
		n1.emitirSom();
		*/
		// metodo construtor, o new ele inicializa o nosso objeto
		Cachorro n2 = new Cachorro("Churras", "Xauxau", 5);
		
		// tudo que for obrigatório na classe é preciso colocar no constutor
		System.out.printf("Nome: %s\n"
						+ "Especie: %s\n"
						+ "Idade: %d anos\n" , n2.getNome(),n2.getEspecie(),n2.getIdade());
		n2.emitirSom();
		//n2.isAdulto();
		if (n2.isAdulto()) {
			System.out.println(n2.getEspecie() + " adulto.\n");
		}else {
			System.out.println(n2.getEspecie() + " filhote.\n");
		}
		
		
		
		// Cadastrando um gato Aula 2 
		Gato gt1 = new Gato("Lorde");
		gt1.setIdade(3);
		System.out.printf("Nome: %s\n"
						+ "Especie: %s\n"
						+ "Idade: %d anos\n" , gt1.getNome(),gt1.getEspecie(),gt1.getIdade());
		
		//gt1.isAdulto();
		//System.out.println("\n");
		gt1.emitirSom();
		gt1.setVerificaVivoMorto(false);
		if (gt1.getVerificaVivoMorto()) {
			if (gt1.isAdulto()) {
				System.out.println(gt1.getEspecie() + " adulto.");
			}else {
				System.out.println(gt1.getEspecie() + " filhote.");
			}
		}else {
			System.out.println(gt1.getEspecie() + " morto.");
		}
		gt1.emitirSom();
		
		
	}
}
