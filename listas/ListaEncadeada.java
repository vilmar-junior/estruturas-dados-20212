package listas;

import elementos.Elemento;
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
	private Elemento inicio;
	private Elemento fim;

	private int tamanho;

	// Construtores
	public ListaEncadeada() {
		inicio = null;
		fim = null;
		tamanho = 0;
	}

	// Métodos da lista

	/**
	 * Insere um novo item no final da lista
	 *
	 * @param novoDado
	 */
	public void inserirNoFinal(Object novoDado) {
		// Cria um novo elemento, sem item seguinte (próximo é nulo)
		Elemento novoElemento = new Elemento(novoDado, null);

		if (inicio == null) {
			inicio = novoElemento;
			fim = novoElemento;
		} else {
			fim.setProximo(novoElemento);
			fim = novoElemento;
		}

		tamanho++;
	}

	/**
	 * Insere um novo item no inicio da lista
	 *
	 * @param novoDado
	 */
	public void inserirNoInicio(Object novoDado) {
		// Cria um novo elemento, e o item seguinte é o antigo primeiro item
		Elemento novoElemento = new Elemento(novoDado, inicio);

		if (inicio == null) { // Lista vazia
			inicio = novoElemento;
			fim = novoElemento;
		} else {
			novoElemento.setProximo(inicio);
			inicio = novoElemento;
		}

		tamanho++;
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

	public Elemento getInicio() {
		return inicio;
	}

	public void setInicio(Elemento inicio) {
		this.inicio = inicio;
	}

	public Elemento getFim() {
		return fim;
	}

	public void setFim(Elemento fim) {
		this.fim = fim;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

}
