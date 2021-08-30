package principal;

import elementos.Elemento;
import listas.ListaEncadeada;

/**
 * Classe que contém o método que será chamado ao executar o programa
 *
 * @author Vilmar César Pereira Júnior
 *
 */
public class Principal {

	public static void main(String[] args) {
		// Testar AQUI a criação e manipulação das estruturas

		ListaEncadeada lista = new ListaEncadeada();
		lista.inserirNoFinal("1");
		lista.inserirNoFinal("2");
		lista.inserirNoFinal("3");
		
		lista.excluirDoFinal();

		// Percorre a lista e mostra os valores no console
		System.out.println("Lista encadeada com tamanho: " + lista.getTamanho());
		Elemento elementoAtual = lista.getInicio();
		int contadorItens = 0;
		while (elementoAtual != null) {
			contadorItens++;
			System.out.println("Item #" + contadorItens + " da lista: "
			+ elementoAtual.getDado());
			elementoAtual = elementoAtual.getProximo();
		}
	}
}
