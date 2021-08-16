package listas;

import excecoes.EstruturaCheiaException;
import excecoes.EstruturaVaziaException;

/**
 * Classe que representa uma lista encadeada
 *
 * @author Vilmar César Pereira Júnior
 *
 */
public class ListaEncadeada {

	// Atributos
	//TODO definir

	// Construtores
	public ListaEncadeada() {
		// Construtor vazio
		// TODO definir
	}

	// Métodos da lista

	/**
	 * Insere um novo item no final da lista
	 *
	 * @param novoItem
	 * @throws EstruturaCheiaException
	 */
	public void inserirNoFinal(Object novoItem) throws EstruturaCheiaException {
		//TODO implementar
	}

	/**
	 * Insere um novo item no inicio da lista
	 *
	 * @param novoItem
	 * @throws EstruturaCheiaException
	 */
	public void inserirNoInicio(Object novoItem) throws EstruturaCheiaException {
		// TODO implementar
	}

	/**
	 * Verifica se um determinado item consta na lista encadeada
	 *
	 * @param item
	 *            o item a ser buscado na lista
	 * @returns se ele existe ou não na lista
	 *
	 */
	public boolean existeElemento(Object item) {
		// TODO implementar

		return false;
	}

	public void excluir(Object itemParaExcluir) throws EstruturaVaziaException {

	}

	public void obterPrimeiroElemento() throws EstruturaCheiaException {
		// TODO exercicio
	}

	public void obterUltimoElemento() throws EstruturaCheiaException {
		// TODO exercicio
	}


}
