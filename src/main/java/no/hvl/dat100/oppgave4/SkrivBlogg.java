package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		PrintWriter skriver = null;
		
		boolean b = true;

		try {
			skriver = new PrintWriter(filnavn);

			for (int i = 0; i < samling.getAntall(); i++) {
				skriver.println(samling.getSamling()[i].toString());
			}
		} catch (FileNotFoundException e) {
			b = false;
		}
		finally {
			if(skriver != null) {
				skriver.close();
			}
		}
		return b;
	}
}