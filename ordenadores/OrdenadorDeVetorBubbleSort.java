package ordenadores;

import excecoes.EstruturaVaziaException;
import listas.ListaVetor;

public class OrdenadorDeVetorBubbleSort extends OrdenadorDeVetor {

	public OrdenadorDeVetorBubbleSort(ListaVetor v) throws EstruturaVaziaException {
		super(v);
	}

	@Override
	public void ordenar() {
		int i, j = 0;
		int n = this.listaVetor.getNumeroElementos();
		Integer[] vetor = this.listaVetor.getItens();
		
		for(i = 0; i < n - 1; i++) { //n-1 varreduras
			for(j = 0; j < (n - 1 - i); j++) { //n-1 varreduras
				//funcionará apenas para tipos numéricos
				int valorAnterior = vetor[j];
				int valorProximo = vetor[j+1];
				
				if(valorAnterior > valorProximo) {
					this.troca(j, j+1);
				}
			}
		}
	}
}
