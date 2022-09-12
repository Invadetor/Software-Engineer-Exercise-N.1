package Entity;

public class Mansione {

	private String tipo;
	private float tempoLimite;

	public Mansione(String tipo, float tempoLimite) {
		this.tipo = tipo;
		this.tempoLimite = tempoLimite;
	}
	public String getTipo() {
		return tipo;
	}

	public float getTempoLimite() {
		return tempoLimite;
	}

}