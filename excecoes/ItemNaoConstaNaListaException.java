package excecoes;

/**
 * Classe que representa uma exceção disparada quando operação ilegal é
 * executada em uma estrutura de dados
 *
 * @author Vilmar César Pereira Júnior
 *
 */
public class ItemNaoConstaNaListaException extends Exception {

	public ItemNaoConstaNaListaException(String mensagem) {
		super(mensagem);
	}

}
