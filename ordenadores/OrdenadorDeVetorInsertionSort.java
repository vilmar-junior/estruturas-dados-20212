package ordenadores;

import excecoes.EstruturaVaziaException;
import listas.ListaVetor;

public class OrdenadorDeVetorInsertionSort extends OrdenadorDeVetor {

	public OrdenadorDeVetorInsertionSort(ListaVetor v) throws EstruturaVaziaException {
		super(v);
	}

	@Override
	public void ordenar() {
		int n = this.listaVetor.getNumeroElementos();
		Integer[] vetor = this.listaVetor.getItens();
		
        for (int i = 1; i < n; ++i) {
            int valorAtual = vetor[i];
            int j = i - 1;
 
            /* Move os elementos do vetor que são
                maiores que que o valor atual para uma posição à frente (à direita) */
            while (j >= 0 && vetor[j] > valorAtual) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = valorAtual;
        }
	}
}
