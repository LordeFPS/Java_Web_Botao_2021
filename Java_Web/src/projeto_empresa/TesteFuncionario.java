package projeto_empresa;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Impressor ip1 = new Impressor(2000, "Adriano", 1);
		ip1.promocao = true;
		ip1.promocao();
		ip1.aumento= 0.1;
		ip1.aumentoSalario();
		
		
		System.out.println();
		
		Ajudante aj1 = new Ajudante(1000, "Matheus", 2);
		aj1.promocao = true;
		aj1.promocao();
		
		System.out.println();
		
		Recepcao rc1 = new Recepcao(1500, "Ana", 3);
		rc1.promocao = true;
		rc1.promocao();
		
		
	}
}
