package Entity;

import Entity.Dipendente;

import java.util.ArrayList;
import java.util.HashMap;

public class Azienda {

	private Catalogo catalogo = new Catalogo();

	private Dipendente dipendente = new Dipendente();

	private HashMap<String, Dipendente> dipendenti = new HashMap<>();

	public ArrayList<Dipendente> listaDipendenti = new ArrayList<>();
	private static Azienda istanza;

	private Azienda() {

	}

	public static Azienda getIstanza() {
		if(istanza == null) {
			istanza = new Azienda();
		}
		return istanza;
	}

	public HashMap<String, String> getInfoDipendenti() {
		HashMap<String, String> dipendenti = new HashMap<>();
		for (Dipendente d: listaDipendenti) {
			dipendenti.put(d.getNome(), d.getNome() + " " + d.getOrario() + " " + d.getPresenza() + " " + d.getMansione());
		}
		return dipendenti;
	}

	public HashMap<String, String> infoCatalogo() {
		return catalogo.infoCatalogo();
	}

	public void aggProddoto(Prodotto prod) {
		catalogo.aggProddoto(prod);
	}

}