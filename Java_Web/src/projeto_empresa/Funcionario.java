package projeto_empresa;

public class Funcionario {

	protected String cargo;
	protected double  salario;
	private String nome;
	private int id_unico;
	protected double  aumento;
	protected boolean promocao; // promocao: troca de cargo;

	public Funcionario(float aumento, boolean promocao) {
		super();
		this.aumento = aumento;
		this.promocao = promocao;
	}

	public Funcionario(float aumentoSalario) {
		super();
		this.aumento = aumentoSalario;
	}

	public Funcionario(String cargo, double  salario, String nome, int id_unico) {
		super();
		this.cargo = cargo;
		this.salario = salario;
		this.nome = nome;
		this.id_unico = id_unico;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double  getSalario() {
		return salario;
	}

	public void setSalario(double  salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId_unico() {
		return id_unico;
	}

	public void setId_unico(int id_unico) {
		this.id_unico = id_unico;
	}

	public boolean getPromocao() {
		return promocao;
	}

	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}

	public double  getAumento() {
		return aumento;
	}

	public void setAumento(double  aumento) {
		this.aumento = aumento;
	}

}
