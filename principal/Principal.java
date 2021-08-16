package principal;

import excecoes.EstruturaCheiaException;
import excecoes.EstruturaVaziaException;
import excecoes.ItemNaoConstaNaListaException;
import excecoes.OperacaoIlegalException;
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

			int posicaoBuscada = lista.obterPosicao("Valor 3");
			System.out.println("Posição: " + posicaoBuscada);
			
//			// Percorre a lista e mostra os valores no console
//			for (int i = 0; i < lista.getNumeroElementos(); i++) {
//				System.out.println("Item [" + i + "] da lista: " + lista.getItens()[i]);
//			}
		} catch (EstruturaCheiaException e) {
			// TODO Auto-generated catch block
			// Melhorar isso
			e.printStackTrace();
		} catch (EstruturaVaziaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ItemNaoConstaNaListaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
