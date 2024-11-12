package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	protected int id;
	protected String bruker;
	protected String dato;
	protected int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		
		this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}
	
	public String getBruker() {
		
		String s = this.bruker;
		
		return s;

	}

	public void setBruker(String bruker) {
		
		this.bruker = bruker;
	}

	public String getDato() {
		
		String s = this.dato;
		
		return s;
		
	}

	public void setDato(String dato) {
		
		this.dato = dato;
	}

	public int getId() {
		
		int i = this.id;
		
		return i;	

	}

	public int getLikes() {
		
		int i = this.likes;
		
		return i;

	}
	
	public void doLike () {
		
		this.likes += 1;
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		boolean b = false;
		
		if(getId() == innlegg.getId()) {
			b = true;
		}
		return b;

	}
	
	@Override
	public String toString() {
		
		String s;
		
		s = getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n";
		
		return s;
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}

