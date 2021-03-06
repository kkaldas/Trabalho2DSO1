import java.security.SecureRandom;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Baralho {
	ArrayList<Carta> cartas;
	Icon verso, versinho;
	
	public Baralho() {
		versinho = new ImageIcon(getClass().getResource("versinho.png"));
		verso = new ImageIcon(getClass().getResource("versoMedio.png"));
		ArrayList<Carta> cards = new ArrayList<Carta>();
		for(int i =0; i<3 ; i++) {
			cards.add(new Carta(EnumPersonagem.KANE));
			cards.add(new Carta(EnumPersonagem.JULIUS));
			cards.add(new Carta(EnumPersonagem.LAURA));
			cards.add(new Carta(EnumPersonagem.MAGNUS));
			cards.add(new Carta(EnumPersonagem.NINETA));
			cards.add(new Carta(EnumPersonagem.PISTONE));
		}
		cartas = cards;
		embaralhar();
	}
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	
	public void embaralhar() {
		ArrayList<Carta> embaralhadas = new ArrayList<Carta>();
		SecureRandom random = new SecureRandom();
		
		int cartasInicialSize = cartas.size(); 
		
		for (int i=0; i<cartasInicialSize; i++) {
			int aleat = random.nextInt(cartas.size());
			embaralhadas.add(cartas.get(aleat));
			cartas.remove(aleat);
		}
		
		setCartas(embaralhadas);
	}

	public Icon getVerso() {
		return verso;
	}

	public void setVerso(Icon verso) {
		this.verso = verso;
	}

	public Icon getVersinho() {
		return versinho;
	}

	public void setVersinho(Icon versinho) {
		this.versinho = versinho;
	}
	
	
}
