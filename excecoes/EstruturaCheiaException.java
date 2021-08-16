package excecoes;

/**
 * Classe que representa uma exceção disparada quando uma estrutura dados
 * estiver cheia
 *
 * @author Vilmar César Pereira Júnior
 *
 */
public class EstruturaCheiaException extends Exception {

	public EstruturaCheiaException(String mensagem) {
		super(mensagem);
	}

}
