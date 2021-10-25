package ordenadores;

import excecoes.EstruturaVaziaException;
import listas.ListaVetor;

/**
 * Classe ABSTRATA (não permite instanciar objetos a partir dela) para representar
 * atributos comuns a todos os ordenadores
 * 
 * @author Vilmar César Pereira Júnior
 *
 */
public abstract class OrdenadorDeVetor {

	//Atributos
	ListaVetor listaVetor;
	int tamanhoVetor;
	
	//Construtor
	public OrdenadorDeVetor(ListaVetor v) throws EstruturaVaziaException {
		super();
		this.listaVetor = v;
		this.tamanhoVetor = v.getNumeroElementos();
		
		if(this.tamanhoVetor < 1) {
			throw new EstruturaVaziaException("Não é possível ordenar um vetor vazio");
		}
	}
	
	//Método abstrato, deve ser implementado pelas subclasses concretas
	public abstract void ordenar();
	
	public void troca(int x, int y) {
		Object aux;
		Object[] vetor = this.listaVetor.getItens();
		
		aux = vetor[x];
		vetor[x] = vetor[y];
		vetor[y] = aux;
	}
	
}
