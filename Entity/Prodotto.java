package Entity;

public class Prodotto {

	private String nome;
	private double prezzo;
	private String codice;

	private String descrizione;

	public Prodotto(String nome, double prezzo, String descrizione) {
		String s = nome + String.valueOf(prezzo);
		this.nome = nome;
		this.prezzo = prezzo;
		this.descrizione = descrizione;
		int hashCode = s.hashCode();
		if(hashCode < 0) {
			hashCode = -hashCode;
		}
		this.codice = String.valueOf(hashCode);
	}

	public String getDescrizione() { return descrizione; }

	public String getNome() {
		return nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public String getCodice() {
		return codice;
	}

}