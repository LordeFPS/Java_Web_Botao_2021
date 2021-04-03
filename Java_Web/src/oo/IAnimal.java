package oo;

public interface IAnimal {
	/*
	 * Tudo que for declarado em interface � PUBLICO 
	 * por esse motivo N�O possui o atributo de visibilidade 
	 * 
	*/
	
	void emitirSom();
	
	boolean isAdulto();
	
	void morrer();
	
	boolean verificaVivoMorto();
	
}
