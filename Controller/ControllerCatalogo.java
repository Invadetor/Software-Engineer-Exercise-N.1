package Controller;
import Entity.Azienda;
import Entity.Prodotto;

import java.util.HashMap;

public class ControllerCatalogo {

	private static Azienda azienda = Azienda.getIstanza();

	public static HashMap<String, String> infoCatalogo() {
		return azienda.infoCatalogo();
	}

	public static void aggProddoto(Prodotto prod) {
		azienda.aggProddoto(prod);
	}

}