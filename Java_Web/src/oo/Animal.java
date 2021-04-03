package oo;

public abstract class Animal {
	private String nome;
	private String especie;
	protected int idade;
	protected boolean verificaVivoMorto;
	
	public Animal() {
		
	}
	
	public Animal(String nome, String especie) {
		this(nome, especie, 0);
	}
	
	
	public Animal(String nome, String especie, int idade) {
		super();
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
		this.verificaVivoMorto = true;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public boolean isVerificaVivoMorto() {
		return verificaVivoMorto;
	}

	public abstract void emitirSom();
	
	public abstract boolean isAdulto();
	
	public abstract boolean verificaVivoMorto();
	
	public abstract void morrer();
	
	
}
