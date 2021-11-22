package ordenadores;

import excecoes.EstruturaVaziaException;
import listas.ListaVetor;

public class OrdenadorDeVetorQuickSort extends OrdenadorDeVetor {

	public OrdenadorDeVetorQuickSort(ListaVetor v) throws EstruturaVaziaException {
		super(v);
	}

	@Override
	public void ordenar() {
		this.quickSort(this.listaVetor.getItens(), 0, this.tamanhoVetor-1);
	}

	private void quickSort(Integer[] vetor, int esquerda, int direita) {
		int pivo;

		if(direita - esquerda <= 0) {
			//já ordenado, não faz nada (return é desnecessário)
		}else {
			pivo = particionar(vetor, esquerda, direita);
			quickSort(vetor, esquerda, pivo);
			quickSort(vetor, pivo + 1, direita);
		}
	}

	public int particionar(Integer[] vetor, int esquerda, int direita) {
		//TODO implementar
		return 0;
	}

	public void troca(Integer[]vetor, int i, int j){
		int temp = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = temp;
	}
}
