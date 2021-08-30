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
	public void inserirNoFinal(Object novoDado) {
		// Cria um novo elemento, sem item seguinte (próximo é nulo)
		Elemento novoElemento = new Elemento(novoDado, null);

		if (inicio == null) {
			inicio = novoElemento;
		} else {
			fim.setProximo(novoElemento);
		}
		fim = novoElemento;
		tamanho++;
	}

	/**
	 * Insere um novo item no inicio da lista
	 *
	 * @param novoDado
	 */
	public void inserirNoInicio(Object novoDado) {
		//1- criar o novo elemento (que será o novo primeiro)
		//2- o próximo desse novo elemento é o antigo elemento inicial
		// new Elemento(Object dado, Elemento proximo)
//		Elemento novoPrimeiro = new Elemento(novoDado, inicio);
		Elemento novoPrimeiro = new Elemento();
		novoPrimeiro.setDado(novoDado);
		novoPrimeiro.setProximo(inicio);
		
		if(tamanho == 0) {
			fim = novoPrimeiro;
		}
		
		//3- Atualizar o inicio
		inicio = novoPrimeiro;
		
		//4- Atualizar o tamanho
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
	
	public void excluirDoFinal() {
		if(tamanho == 1) {
			this.inicio = null;
			this.fim = null;
			tamanho--;
		}else if(tamanho > 1) {
			//Penúltimo item vira o fim
			Elemento penultimo;
			
			int contadorItens = 1;
			penultimo = inicio;
			
			while(contadorItens < tamanho - 1) {
				if(penultimo.getProximo() != null) {
					penultimo = penultimo.getProximo();
				}
				contadorItens++;
			}
			penultimo.setProximo(null);
			fim = penultimo;
			tamanho--;
		}
	}
	
	public void excluirDoInicio() {
		if(tamanho > 0) {
			if(tamanho == 1) {
				inicio = null;
				fim = null;
			}else {
				inicio = inicio.getProximo();
			}
			tamanho--;
		}
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
