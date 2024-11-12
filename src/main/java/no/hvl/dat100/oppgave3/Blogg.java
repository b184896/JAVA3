package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.Tekst;

public class Blogg {

	private Innlegg[] innleggtabell;
	
	private int nesteledig;
	
	public Blogg() {
		
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		
		int i = this.nesteledig;
		
		return i;
	}
	
	public Innlegg[] getSamling() {
		
		Innlegg[] i = this.innleggtabell;
		
		return i;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		int t = -1;
		
		for(int i = 0; i < getAntall(); i++) {
			if(innlegg.erLik(innleggtabell[i]) == true) {
				t = i;
			}
		}
		return t;
	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean b = false;
		
		if(finnInnlegg(innlegg) > - 1) {
			b = true;
		}
		return b;	
	}

	public boolean ledigPlass() {
		
		return innleggtabell.length > getAntall();
		
//		boolean b = false;
//		
//		if(getAntall() < innleggtabell.length) {
//			b = true;
//		}
//		return b;
	}
	
	public boolean leggTil(Innlegg innlegg) {

		boolean b = false;
		
		if(ledigPlass() == true && finnes(innlegg) == false) {
			innleggtabell[getAntall()] = innlegg;
			this.nesteledig ++;
			b = true;
		}
		return b;
	}
	
	public String toString() {
		
		String b = getAntall() + "\n";
		
		for(int i = 0; i < getAntall(); i++) {
			b += innleggtabell[i].toString();
		}
		
		return b;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}
