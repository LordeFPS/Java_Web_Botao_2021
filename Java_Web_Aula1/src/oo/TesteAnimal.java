package oo;

public class TesteAnimal {

	public static void main(String[] args) {
		Animal n1 = new Animal();
		
		n1.setNome("spike");
		n1.setEspecie("cachorro");
		n1.setIdade(0);
		
		
		
		System.out.println("O nome do animal e " + n1.getNome() + 
						   " e pertence a especie " + n1.getEspecie()+
						   " e tem idade de " + n1.getIdade());
		if (n1.isAdulto() == true) {
			System.out.println("Animal adulto.");
		}else {
			System.out.println("Animal filhote.");
		}
		n1.emitirSom();
		Animal n2 = new Animal("Churras", "Xauxau", 2);
		
		System.out.println("O nome do animal e " + n2.getNome() + 
				   		   " e pertence a especie " + n2.getEspecie() +
				   		   " e tem idade de " + n2.getIdade());
		if (n2.isAdulto()) {
			System.out.println("Animal adulto.");
		}else {
			System.out.println("Animal filhote.");
		}
		n2.emitirSom();

	}
}
