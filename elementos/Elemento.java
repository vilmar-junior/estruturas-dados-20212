package elementos;

/**
 * Classe que representa uma elemento que será armazenado em uma lista encadeada
 *
 * @author Vilmar César Pereira Júnior
 *
 */
public class Elemento {
	// Atributos
	private Object dado;
	private Elemento proximo;
	
	// Construtores
	public Elemento(Object dado, Elemento proximo) {
		super();
		this.dado = dado;
		this.proximo = proximo;
	}
	
	public Elemento() {
	}

	public void inserirApos(Object novoDado) {
		Elemento novoElementoSeguinte = new Elemento();
		novoElementoSeguinte.setDado(novoDado);
		// o próximo é o novo elemento
		this.setProximo(novoElementoSeguinte); 
	}
	
	//Exercício 1
	public void inserirAntes(Object novoDado) {
		Elemento novoElementoAnterior = new Elemento();
		novoElementoAnterior.setDado(novoDado);
		
		//this: eu mesmo (o objeto que está executando o método)
		novoElementoAnterior.setProximo(this);
	}
	
	// Métodos de acesso aos atributos (getters e setters)
	public Object getDado() {
		return dado;
	}

	public void setDado(Object dado) {
		this.dado = dado;
	}

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
}
