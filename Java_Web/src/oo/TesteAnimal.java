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
		
		// metodo construtor, o new ele inicializa o nosso objeto
		Cachorro n2 = new Cachorro("Churras", "Xauxau", 2);
		
		// tudo que for obrigat�rio na classe � preciso colocar no constutor
		System.out.println("O nome do animal se chama " + n2.getNome() + 
				   		   " e pertence a especie " + n2.getEspecie() +
				   		   " e tem idade de " + n2.getIdade());
		if (n2.isAdulto()) {
			System.out.println("Animal adulto.");
		}else {
			System.out.println("Animal filhote.");
		}
		n2.emitirSom();
		*/
		
		// Cadastrando um gato Aula 2 
		Gato gt1 = new Gato("Lorde");
		System.out.println("O nome do animal se chama " + gt1.getNome() + 
				   " e pertence a especie " + gt1.getEspecie() +
				   " e tem idade de " + gt1.getIdade());
		if (gt1.isAdulto()) {
			System.out.println(gt1.getEspecie() + " adulto.");
		}else {
			System.out.println(gt1.getEspecie() + " filhote.");
		}
		

	}
}
