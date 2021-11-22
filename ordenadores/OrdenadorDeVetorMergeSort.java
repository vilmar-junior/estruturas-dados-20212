package ordenadores;

import excecoes.EstruturaVaziaException;
import listas.ListaVetor;

public class OrdenadorDeVetorMergeSort extends OrdenadorDeVetor {

	public OrdenadorDeVetorMergeSort(ListaVetor v) throws EstruturaVaziaException {
		super(v);
	}

	@Override
	public void ordenar() {
		this.mergeSort(this.listaVetor.getItens(), this.tamanhoVetor);
	}

	public void mergeSort(Integer[] vetor, int tamanho) {
		if (tamanho < 2) {
			return;
		}
		
		int meio = tamanho / 2;
		Integer[] vetorEsquerda = new Integer[meio];
		Integer[] vetorDireita = new Integer[tamanho - meio];

		for (int i = 0; i < meio; i++) {
			vetorEsquerda[i] = vetor[i];
		}
		for (int i = meio; i < tamanho; i++) {
			vetorDireita[i - meio] = vetor[i];
		}
		
		mergeSort(vetorEsquerda, meio);
		mergeSort(vetorDireita, tamanho - meio);
		merge(vetor, vetorEsquerda, vetorDireita, meio, tamanho - meio);
	}

	private void merge(Integer[] vetor, Integer[] vetorEsquerda, Integer[] vetorDireita, int esquerda, int direita) {
		//TODO implementar
	}
}