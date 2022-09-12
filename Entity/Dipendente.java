package Entity;

import java.util.ArrayList;
import java.util.HashMap;

public class Dipendente {

	private String nome;
	private String orario;
	private boolean presenza;

	private Mansione mansione;

	public Dipendente() {}

	public Dipendente(String nome, String orario, boolean presenza, Mansione mansione) {
		this.nome = nome;
		this.orario = orario;
		this.presenza = presenza;
		this.mansione = mansione;
	}

	public String getNome() {
		return nome;
	}

	public String getOrario() {
		return orario;
	}

	public boolean getPresenza() {
		return presenza;
	}

	public String getMansione() {
		String man = mansione.getTipo() + String.valueOf(mansione.getTempoLimite());
		return man;
	}

}