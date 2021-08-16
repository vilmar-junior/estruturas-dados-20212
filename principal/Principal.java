package principal;

import excecoes.EstruturaCheiaException;
import listas.ListaVetor;

/**
 * Classe que contém o método que será chamado ao executar o programa
 *
 * @author Vilmar César Pereira Júnior
 *
 */
public class Principal {

	public static void main(String[] args) {
		// Testar AQUI a criação e manipulação das estruturas

		ListaVetor lista = new ListaVetor();
		try {
			lista.inserirNoFinal("Valor 1");
			lista.inserirNoFinal("Valor 2");
			lista.inserirNoFinal("Valor 3");
			lista.inserirNoFinal("Valor 4");
			lista.inserirNoFinal("Valor 5");
			lista.inserirNoFinal("Valor 6");
			lista.inserirNoFinal("Valor 7");
			lista.inserirNoFinal("Valor 8");
			lista.inserirNoFinal("Valor 9");
			lista.inserirNoFinal("Valor 10");

			// Percorre a lista e mostra os valores no console
			for (int i = 0; i < lista.getNumeroElementos(); i++) {
				System.out.println("Item [" + i + "] da lista: " + lista.getItens()[i]);
			}
		} catch (EstruturaCheiaException e) {
			// TODO Auto-generated catch block
			// Melhorar isso
			e.printStackTrace();
		}
	}
}
