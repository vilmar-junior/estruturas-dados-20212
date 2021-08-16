package excecoes;

/**
 * Classe que representa uma exceção disparada quando uma estrutura dados
 * estiver cheia
 *
 * @author Vilmar César Pereira Júnior
 *
 */
public class EstruturaVaziaException extends Exception {

	public EstruturaVaziaException(String mensagem) {
		super(mensagem);
	}

}
