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
		lista.inserirNoFinal("Valor 1");
		lista.inserirNoFinal("Valor 2");
		lista.inserirNoInicio("Novo primeiro");

		// Percorre a lista e mostra os valores no console
		Elemento elementoAtual = lista.getInicio();
		int contadorItens = 0;
		while (elementoAtual != null) {
			contadorItens++;
			System.out.println("Item #" + contadorItens + " da lista: " + elementoAtual.getDado());
			elementoAtual = elementoAtual.getProximo();
		}
	}
}
