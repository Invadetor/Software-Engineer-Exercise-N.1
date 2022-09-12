package Entity;
import java.util.ArrayList;
import java.util.HashMap;

public class Catalogo {

	private ArrayList<Prodotto> listaProdotti = new ArrayList<>();


	public void aggProddoto(Prodotto prod) {
		listaProdotti.add(prod);
	}

	public HashMap<String, String> infoCatalogo() {
		HashMap<String, String> catalogo = new HashMap<>();
		for (Prodotto p: listaProdotti) {
			catalogo.put(p.getCodice(), p.getNome() + " " + String.valueOf(p.getPrezzo()) + " " + p.getDescrizione());
		}
		return catalogo;
	}

}