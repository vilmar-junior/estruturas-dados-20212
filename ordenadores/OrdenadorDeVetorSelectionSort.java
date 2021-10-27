package ordenadores;

import excecoes.EstruturaVaziaException;
import listas.ListaVetor;

public class OrdenadorDeVetorSelectionSort extends OrdenadorDeVetor {

	public OrdenadorDeVetorSelectionSort(ListaVetor v) throws EstruturaVaziaException {
		super(v);
	}

	@Override
	public void ordenar() {
		int i, j = 0;
		int n = this.listaVetor.getNumeroElementos();
		Integer[] vetor = this.listaVetor.getItens();
		
		for(i = 0; i < n; i++) {
			int indiceDoMenorValor = i;
			for(j = i+1; j < n; j++) {
				//funcionará apenas para tipos numéricos
				int valorJ = vetor[j];
				int valorMenor = vetor[indiceDoMenorValor];
				
				if(valorJ < valorMenor) {
					indiceDoMenorValor = j;
				}
			}
			this.troca(i, indiceDoMenorValor);
		}
	}
}
