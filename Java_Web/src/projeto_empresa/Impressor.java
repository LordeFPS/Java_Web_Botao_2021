package projeto_empresa;

public class Impressor extends Funcionario implements IFuncionario{

	public Impressor(double salario, String nome, int id_unico) {
		super("Impressor", salario, nome, id_unico);

	}

	@Override
	public void promocao() {

		if (promocao) {
			
			String cargoPromocao = "Coordenador";
			double aumentoSituacional = (salario * 0.25) + salario;

			System.out.printf("Cargo " + cargo + " com promocao: %s\nSalario com promocao: %.2f%n", cargoPromocao, aumentoSituacional);
			//System.out.println("Cargo com promocao: "+ cargo + "\n"+
			//				   "Salario com promocao: " + aumentoSalario);
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
