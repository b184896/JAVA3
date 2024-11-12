package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {

	protected String tekst;
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		
		this.id = id;
		
		this.bruker = bruker;
		
		this.dato = dato;
		
		this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		
		this.id = id;
		
		this.bruker = bruker;
		
		this.dato = dato;
		
		this.likes = likes;
		
		this.tekst = tekst;
	}
	
	public String getTekst() {
		
		String s = this.tekst;
		
		return s;

	}

	public void setTekst(String tekst) {
		
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		
		String s;
		
		s = "TEKST" + "\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + getTekst() + "\n";
		
		return s;

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
