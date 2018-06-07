package hotel;

public class Animal {
	private String nome;
	private String tipo;
	private int idade;
	
	public Animal(String nome, String tipo, int idade) {
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	public String getTipo() {
		return tipo;
	}
	public int getIdade() {
		return idade;
	}
}
