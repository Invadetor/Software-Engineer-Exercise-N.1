import Boundary.MainPageManager;
import Controller.ControllerCatalogo;
import Entity.Azienda;
import Entity.Dipendente;
import Entity.Mansione;
import Entity.Prodotto;

import java.util.HashMap;

public class Main {

    public static void main(String[]args) {
        /* HashMap<String, String> infoCatalogo = new HashMap<>();
        Prodotto p1 = new Prodotto("mela", 1.01);
        Prodotto p2 = new Prodotto("pera", 2.21);
        Prodotto p3 = new Prodotto("anguria", 5.50);
        ControllerCatalogo.aggProddoto(p1);
        ControllerCatalogo.aggProddoto(p2);
        ControllerCatalogo.aggProddoto(p3);
        ControllerCatalogo.infoCatalogo();
        System.out.println(infoCatalogo.toString()); */

        Mansione m1 = new Mansione("fisico", 1200);
        Mansione m2 = new Mansione("transporto", 2400);
        Mansione m3 = new Mansione("scrittura", 1000);

        Dipendente d1 = new Dipendente("Marco", "lunedi = 10:00 alle 14:00, mercoledi = 9:00 alle 13:00", true, m1);
        Dipendente d2 = new Dipendente("Giovanni", "Martedi = 13:30 alle 20:00", false, m2);
        Dipendente d3 = new Dipendente("Riccardo", "Giovedi = 7:00 alle 14:00", false, m3);

        Azienda azienda = Azienda.getIstanza();
        azienda.listaDipendenti.add(d1);
        azienda.listaDipendenti.add(d2);
        azienda.listaDipendenti.add(d3);

        MainPageManager mainPageManager = new MainPageManager();
        mainPageManager.run();
    }

}
