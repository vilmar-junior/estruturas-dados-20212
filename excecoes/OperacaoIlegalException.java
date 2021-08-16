package excecoes;

/**
 * Classe que representa uma exceção disparada quando operação ilegal é
 * executada em uma estrutura de dados
 *
 * @author Vilmar César Pereira Júnior
 *
 */
public class OperacaoIlegalException extends Exception {

	public OperacaoIlegalException(String mensagem) {
		super(mensagem);
	}

}
