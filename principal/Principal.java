package principal;

import java.util.Iterator;

import elementos.Elemento;
import excecoes.EstruturaCheiaException;
import excecoes.EstruturaVaziaException;
import listas.ListaEncadeada;
import listas.ListaVetor;
import ordenadores.OrdenadorDeVetorBubbleSort;
import ordenadores.OrdenadorDeVetorInsertionSort;
import ordenadores.OrdenadorDeVetorSelectionSort;

/**
 * Classe que contém o método que será chamado ao executar o programa
 *
 * @author Vilmar César Pereira Júnior
 *
 */
public class Principal {

	public static void main(String[] args) throws EstruturaCheiaException, EstruturaVaziaException {
		//Aula 2(III)
		//testarOperacoesEmListaEncadeada();
		
		// Aula 4(I)
		testarBubbleSortEmListaVetor();
		testarInsertionSortEmListaVetor();
		testarSelectionSortEmListaVetor();
	}

	private static void testarSelectionSortEmListaVetor() throws EstruturaCheiaException, EstruturaVaziaException {
		// TODO implementar a classe OrdenadorDeVetorInsertionSort e depois testar aqui
		System.out.println("## Teste selectionSort em lista vetor (desenvolver)");
		
		ListaVetor lista = new ListaVetor();
		lista.inserirNoFinal(4);
		lista.inserirNoFinal(3);
		lista.inserirNoFinal(2);
		lista.inserirNoFinal(5);
		lista.inserirNoFinal(1);
		
		System.out.println("Lista ANTES da ordenação");
		lista.mostrarValoresNoConsole();
		System.out.println("");
		
		OrdenadorDeVetorSelectionSort selectionSort = new OrdenadorDeVetorSelectionSort(lista);
		selectionSort.ordenar();
		
		System.out.println("Lista DEPOIS da ordenação");
		lista.mostrarValoresNoConsole();
		System.out.println();
	}

	private static void testarInsertionSortEmListaVetor() throws EstruturaCheiaException, EstruturaVaziaException {
		// TODO implementar a classe OrdenadorDeVetorInsertionSort e depois testar aqui
		System.out.println("## Teste insertionSort em lista vetor (desenvolver)");
		
		ListaVetor lista = new ListaVetor();
		lista.inserirNoFinal(4);
		lista.inserirNoFinal(3);
		lista.inserirNoFinal(2);
		lista.inserirNoFinal(5);
		lista.inserirNoFinal(1);
		
		System.out.println("Lista ANTES da ordenação");
		lista.mostrarValoresNoConsole();
		System.out.println("");
		
		OrdenadorDeVetorInsertionSort insertionSort = new OrdenadorDeVetorInsertionSort(lista);
		insertionSort.ordenar();
		
		System.out.println("Lista DEPOIS da ordenação");
		lista.mostrarValoresNoConsole();
		System.out.println();
	}
	
	private static void testarBubbleSortEmListaVetor() throws EstruturaCheiaException, EstruturaVaziaException {
		System.out.println("## Teste bubbleSort em lista vetor");
		
		ListaVetor lista = new ListaVetor();
		lista.inserirNoFinal(4);
		lista.inserirNoFinal(3);
		lista.inserirNoFinal(2);
		lista.inserirNoFinal(5);
		lista.inserirNoFinal(1);
		
		System.out.println("Lista ANTES da ordenação");
		lista.mostrarValoresNoConsole();
		System.out.println("");
		
		OrdenadorDeVetorBubbleSort bubbleSort = new OrdenadorDeVetorBubbleSort(lista);
		bubbleSort.ordenar();
		
		System.out.println("Lista DEPOIS da ordenação");
		lista.mostrarValoresNoConsole();
		System.out.println();
	}
	private static void testarOperacoesEmListaEncadeada() {
		// Testar AQUI a criação e manipulação das estruturas
		System.out.println("## Teste de operações em lista encadeada");
		
		ListaEncadeada lista = new ListaEncadeada();
		lista.inserirNoFinal(1);
		lista.inserirNoFinal(2);
		lista.inserirNoFinal(3);
		
		System.out.println("Existe o elemento 3? " 
				+ (lista.existeElemento("3") ? "Sim" : "Não"));
		
		System.out.println("Existe o elemento 4? " 
				+ (lista.existeElemento("4") ? "Sim" : "Não"));
		
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
		System.out.println();
	}
}
