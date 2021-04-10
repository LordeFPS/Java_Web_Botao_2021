package projeto_empresa;

public class Recepcao extends Funcionario implements IFuncionario {

	public Recepcao(float salario, String nome, int id_unico) {
		super("Secretaria", salario, nome, id_unico);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void promocao() {

		if (promocao) {
			
			String cargoPromocao = "Gerente";
			aumento= (salario * 0.1) + salario;

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
