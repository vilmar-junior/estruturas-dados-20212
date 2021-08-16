package listas;

import excecoes.EstruturaCheiaException;

/**
 * Classe que representa uma lista em um vetor
 *
 * @author Vilmar César Pereira Júnior
 *
 */
public class ListaVetor {

	// Atributos
	private Object[] itens;
	private int numeroElementos;

	// Construtores
	public ListaVetor(Object[] itens, int numeroElementos) {
		super();
		this.itens = itens;
		this.numeroElementos = numeroElementos;
	}

	public ListaVetor() {
		// Construtor vazio

		// TODO o tamanho é fixo?
		itens = new Object[10];
		numeroElementos = 0;
	}

	// Métodos da lista

	/**
	 * Insere um novo item no final da lista
	 *
	 * @param novoItem
	 * @throws EstruturaCheiaException
	 */
	public void inserirNoFinal(Object novoItem) throws EstruturaCheiaException {
		if (numeroElementos == itens.length) {
			throw new EstruturaCheiaException("A lista já atingiu o seu tamanho máximo (" + numeroElementos + "), logo não permite a inclusão de novo item");
		}

		itens[numeroElementos] = novoItem;
		numeroElementos++;
	}

	/**
	 * Insere um novo item imediatamente antes da posicao informada
	 *
	 * @param posicao
	 *            o indice de referencia que será o item posterior do novo item
	 * @param novoItem
	 *            o novo item a ser inserido na lista
	 */
	public void inserirAntes(Object novoItem, int posicao) {
		// TODO implementar
	}

	public void excluirDoFinal() {
		// TODO implementar
	}

	public void excluirDaPosicao(int posicao) {
		// TODO implementar
	}

	public Object consultarPorPosicao(int posicao) {
		// TODO implementar
		return null;
	}

	public Object obterPosicao(Object item) {
		// TODO implementar
		return null;
	}

	public Object encontrar(Object objetoComparavel) {
		// TODO implementar
		return null;
	}

	// Métodos de acesso aos atributos (getters e setters)
	public Object[] getItens() {
		return itens;
	}

	public void setItens(Object[] itens) {
		this.itens = itens;
	}

	public int getNumeroElementos() {
		return numeroElementos;
	}

	public void setNumeroElementos(int numeroElementos) {
		this.numeroElementos = numeroElementos;
	}

}
