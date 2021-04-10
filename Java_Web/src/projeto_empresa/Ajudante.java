package projeto_empresa;

public class Ajudante extends Funcionario implements IFuncionario {

	public Ajudante(float salario, String nome, int id_unico) {
		super("Ajudante", salario, nome, id_unico);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void promocao() {

		if (promocao) {
			
			String cargoPromocao = "Impressor";
			aumento= (salario * 0.05) + salario;

			System.out.printf("Cargo " + cargo + " com promocao: %s\n" + "Salario com promocao: %.2f%n", cargoPromocao, aumento);
		} else {
			System.out.println("Não teve promoção");
		}

	}

	@Override
	public void aumentoSalario() {

		double aumentoSituacional = (salario * aumento) + salario;
		
		System.out.println("Aumento Salario Situacional: " + aumentoSituacional);
		
		
	}

}
