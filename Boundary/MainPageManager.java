package Boundary;
import Controller.ControllaDipendenti;
import Controller.ControllerCatalogo;
import Entity.Prodotto;
import Entity.Catalogo;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;


public class MainPageManager {

	private JButton buttonLista;
	private JButton buttonCatalogo;

	private JButton buttonDipendenti;
	private JButton aggiungi;
	private JTextField nome;
	private JTextField prezzo;
	private JTextField descrizione;
	private JFrame frame;

	private JLabel label;




	public void run() {
		frame = new JFrame("Main Page Manager");
		frame.setVisible(true);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.setSize(500, 500);
		aggiungi = new JButton("Aggiungi Prodotto");
		aggiungi.setSize(100, 20);
		Border padding = BorderFactory.createEmptyBorder(0, 20, 0, 70);
		aggiungi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Prodotto p = new Prodotto(nome.getText(), Double.parseDouble(prezzo.getText()), descrizione.getText());
				aggProdotto(p);
				label.setText("Aggiunto " + nome.getText());
			}
		});

		buttonCatalogo = new JButton("Mostra Catalogo");
		buttonCatalogo.setSize(100, 20);
	    buttonCatalogo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.add(oggettiCatalogo());
			}
		});

		buttonDipendenti = new JButton("Mostra Dipendenti");
		buttonDipendenti.setSize(100, 20);
		buttonDipendenti.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.add(oggettiDipendenti());
			}
		});

		nome = new JTextField("Nome");
		nome.setSize(150, 50);
		nome.setBorder(padding);
		nome.setMaximumSize(new Dimension(150, 50));

		prezzo = new JTextField("Prezzo");
		prezzo.setSize(150, 50);
		prezzo.setBorder(padding);
		prezzo.setMaximumSize(new Dimension(150, 50));

		descrizione = new JTextField("Descrizione");
		descrizione.setSize(150, 200);
		descrizione.setBorder(padding);
		descrizione.setMaximumSize(new Dimension(150, 50));

		label = new JLabel();
		label.setSize(150, 200);
		label.setBorder(padding);
		label.setMaximumSize(new Dimension(300, 50));

		frame.add(nome);
		frame.add(prezzo);
		frame.add(descrizione);
		frame.add(aggiungi);
		frame.add(buttonCatalogo);
		frame.add(label);
		frame.add(buttonDipendenti);
	}


	public void controllaDipendente() {
		// TODO - implement MainPageManager.controllaDipendente
		throw new UnsupportedOperationException();
	}

	public void controllaCatalogo() {
		// TODO - implement MainPageManager.controllaCatalogo
		throw new UnsupportedOperationException();
	}

	public JComponent oggettiCatalogo() {
		JPanel panel = new JPanel();
		JScrollPane scrollPane = new JScrollPane(panel);
		Border padding = BorderFactory.createEmptyBorder(10, 20, 10, 70);
		HashMap<String, String> mappa = new HashMap<>();
		mappa = ControllerCatalogo.infoCatalogo();
		mappa.forEach((c, v) -> {
			JTextArea prodotto = new JTextArea(5, 20);
			prodotto.setText(c + ": " + v);
			prodotto.setBorder(padding);
			prodotto.setLineWrap(true);
			prodotto.setEditable(false);
			panel.add(prodotto);
		});
		return scrollPane;
	}

	public JComponent oggettiDipendenti() {
		JPanel panel = new JPanel();
		JScrollPane scrollPane = new JScrollPane(panel);
		Border padding = BorderFactory.createEmptyBorder(10, 20, 10, 70);
		HashMap<String, String> mappa = new HashMap<>();
		mappa = ControllaDipendenti.controllaDipendenti();
		mappa.forEach((c, v) -> {
			JTextArea dipendente = new JTextArea(5, 20);
			dipendente.setText(c + ": " + v);
			dipendente.setBorder(padding);
			dipendente.setLineWrap(true);
			dipendente.setEditable(false);
			panel.add(dipendente);
		});
		return scrollPane;
	}

	public void aggProdotto(Prodotto p) {
		ControllerCatalogo.aggProddoto(p);
	}

}