package oo;

public interface IAnimal {
	/*
	 * Tudo que for declarado em interface é PUBLICO 
	 * por esse motivo NÃO possui o atributo de visibilidade 
	 * 
	*/
	
	void emitirSom();
	
	boolean isAdulto();
	
	void morrer();
	
	boolean verificaVivoMorto();
	
}
