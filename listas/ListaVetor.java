package listas;

import java.util.ArrayList;

import excecoes.EstruturaCheiaException;
import excecoes.EstruturaVaziaException;
import excecoes.ItemNaoConstaNaListaException;
import excecoes.OperacaoIlegalException;

/**
 * Classe que representa uma lista em um vetor
 *
 * @author Vilmar César Pereira Júnior
 *
 */
public class ListaVetor {

	// Atributos
	private Integer[] itens;
	private int numeroElementos;

	// Construtores
	public ListaVetor(Integer[] itens, int numeroElementos) {
		super();
		this.itens = itens;
		this.numeroElementos = numeroElementos;
	}

	public ListaVetor() {
		itens = new Integer[10];
		numeroElementos = 0;
	}

	// Métodos da lista

	/**
	 * Insere um novo item no final da lista
	 *
	 * @param novoItem
	 * @throws EstruturaCheiaException
	 */
	public void inserirNoFinal(Integer novoItem) throws EstruturaCheiaException {
		if (numeroElementos == itens.length) {
			//Lança uma exceção --> o método termina aqui
			throw new EstruturaCheiaException("A lista j� atingiu o seu tamanho m�ximo (" 
					+ numeroElementos + "), logo n�o permite a inclus�o de novo item");
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
	 * @throws OperacaoIlegalException 
	 * @throws EstruturaCheiaException 
	 */
	public void inserirAntes(Integer novoItem, int posicao) throws OperacaoIlegalException, EstruturaCheiaException {
		if(posicao < 0 || posicao >= numeroElementos) {
			throw new OperacaoIlegalException("Posição inválida");
		}
		
		if(numeroElementos == itens.length) {
			throw new EstruturaCheiaException("Lista está cheia");
		}
		
		for(int i = numeroElementos; i > posicao; i--) {
			//Desloca o valor para a direita (faz uma cópia)
			itens[i] = itens[i-1];
		}
		
		itens[posicao] = novoItem;
		numeroElementos++;
	}

	public void excluirDoFinal() throws EstruturaVaziaException {
		if(numeroElementos == 0) {
			throw new EstruturaVaziaException("Lista está vazia");
		}
		
		itens[numeroElementos - 1] = null;
		numeroElementos--; //é o mesmo que numeroElementos = numeroElementos - 1
	}

	public void excluirDaPosicao(int posicao) throws OperacaoIlegalException, EstruturaCheiaException {
		if(posicao < 0 || posicao >= numeroElementos) {
			throw new OperacaoIlegalException("Posição inválida");
		}
		
		if(numeroElementos == itens.length) {
			throw new EstruturaCheiaException("Lista está cheia");
		}
		
		for(int i = posicao; i < numeroElementos; i++) {
			//Desloca o valor para a esquerda (sobrepondo o valor anterior)
			itens[i] = itens[i+1];
		}
		
		itens[numeroElementos - 1] = null;
		numeroElementos--;
	}

	public Object consultarPorPosicao(int posicao) throws EstruturaVaziaException, OperacaoIlegalException {
		if(numeroElementos == 0) {
			throw new EstruturaVaziaException("Lista está vazia");
		}
		
		if(posicao < 0 || posicao >= numeroElementos) {
			throw new OperacaoIlegalException("Posição inválida");
		}
		
		return itens[posicao];
	}

	public int obterPosicao(Object item) throws EstruturaVaziaException, ItemNaoConstaNaListaException {
		if(numeroElementos == 0) {
			throw new EstruturaVaziaException("Lista está vazia");
		}
		
		int i = 0;
		while(i < numeroElementos) {
			if(itens[i] == item) {
				return i;
			}
			i++;
		}
		
		return -1;
	}

	public Object encontrar(Object objetoComparavel) {
		Object objetoBuscado = null;
		
		for (int i = 0; i < itens.length; i++) {
			if(itens[i] == objetoComparavel) {
				objetoBuscado = objetoComparavel;
				break;
			}
		}
		
		return objetoBuscado;
	}

	// Métodos de acesso aos atributos (getters e setters)
	public Integer[] getItens() {
		return itens;
	}

	public void setItens(Integer[] itens) {
		this.itens = itens;
	}

	public int getNumeroElementos() {
		return numeroElementos;
	}

	public void setNumeroElementos(int numeroElementos) {
		this.numeroElementos = numeroElementos;
	}

	public void mostrarValoresNoConsole() {
		Object[] vetor = this.getItens();
		for (int i = 0; i < this.getNumeroElementos(); i++) {
			System.out.println("Item #" + i + " do vetor: " + vetor[i]);
		}
	}
}
