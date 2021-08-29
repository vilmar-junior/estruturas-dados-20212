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
		super();
	}

	public void inserirApos(Object novoDado) {
		Elemento novoElementoSeguinte = new Elemento();
		novoElementoSeguinte.setDado(novoDado);

		this.setProximo(novoElementoSeguinte); // o próximo é o novo elemento
	}


	public void inserirAntes(Object novoDado) {
		Elemento novoElementoAnterior = new Elemento();
		novoElementoAnterior.setDado(novoDado);
		novoElementoAnterior.setProximo(this); // o próximo é o elemento atual
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
