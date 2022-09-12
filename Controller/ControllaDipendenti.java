package Controller;

import Entity.Azienda;

import java.util.HashMap;

public class ControllaDipendenti {

	public static HashMap<String, String> controllaDipendenti() {
		return Azienda.getIstanza().getInfoDipendenti();
	}

}