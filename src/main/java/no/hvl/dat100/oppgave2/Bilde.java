package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	protected String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		
		this.id = id;
		
		this.bruker = bruker;
		
		this.dato = dato;
		
		this.tekst = tekst;
		
		this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		
		this.id = id;
		
		this.bruker = bruker;
		
		this.dato = dato;
		
		this.likes = likes;
		
		this.tekst = tekst;
		
		this.url = url;
	}
	
	public String getUrl() {
		
		String s = this.url;
		
		return s;

	}

	public void setUrl(String url) {
		
		this.url = url;
	}

	@Override
	public String toString() {
		
		String s;
		
		s = "BILDE" + "\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + "et bilde" + "\n" + getUrl() + "\n";
		
		return s;

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
