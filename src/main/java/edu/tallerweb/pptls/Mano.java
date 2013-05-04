package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	
	private Forma formaJugador;
	
	public Mano(final Forma forma) {
		
	this.formaJugador=forma;
	
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	
	public Resultado jugarCon(final Mano otra) {
		
		
		
	int valorJugadorUno=this.formaJugador.getValor();
	int valorJugadorDos=otra.formaJugador.getValor();
	
	if(valorJugadorUno==valorJugadorDos){
		
		return Resultado.EMPATA;
	}
	
	if(valorJugadorUno==(valorJugadorDos+1)%5||valorJugadorUno==(valorJugadorDos+2)%5){
		
		return Resultado.GANA;
		
	}
	else return Resultado.PIERDE;
		
	}

}