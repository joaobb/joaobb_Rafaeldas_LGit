package hotel;

public class Estadia {
	private Animal animal;
	private Double valor;
	private int dias;
	
	public Estadia(String nome, String tipo, int idade, int dias, Double valor) {
		this.valor = valor;
		this.dias = dias;
		animal = new Animal(nome, tipo, idade);
	}
	public Double getValor() {
		return valor;
	}
	public int getDias() {
		return dias;
	}
	public int getIdade() {
		return this.animal.getIdade();
	}
	public String getNome() {
		return this.animal.getNome();
	}
	public String getTipo() {
		return this.animal.getTipo();
	}
	@Override
	public String toString() {
		return animal.getNome() + ", " + animal.getTipo() + ", " + dias + " com o preço de R$ " + valor;
	}
	
}
