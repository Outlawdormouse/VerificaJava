package es1;

import java.util.Scanner;

public class Film {
	Scanner s1 = new Scanner(System.in);
	private String titolo, nomeRegista, linguaOriginale, nazioneProduzione;
	private int anno; 
	public Film() {}
	public Film(String titolo, String nomeRegista, String linguaOriginale, String nazioneProduzione, int anno) {
		this.titolo = titolo;
		this.nomeRegista = nomeRegista;
		this.linguaOriginale = linguaOriginale;
		this.nazioneProduzione = nazioneProduzione;
		this.anno = anno;		
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getNomeRegista() {
		return nomeRegista;
	}
	public void setNomeRegista(String nomeRegista) {
		this.nomeRegista = nomeRegista;
	}
	public String getLinguaOriginale() {
		return linguaOriginale;
	}
	public void setLinguaOriginale(String linguaOriginale) {
		this.linguaOriginale = linguaOriginale;
	}
	public String getNazioneProduzione() {
		return nazioneProduzione;
	}
	public void setNazioneProduzione(String nazioneProduzione) {
		this.nazioneProduzione = nazioneProduzione;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	public String toString() {
		return "Film [titolo=" + titolo + ", nomeRegista=" + nomeRegista + ", linguaOriginale=" + linguaOriginale
				+ ", nazioneProduzione=" + nazioneProduzione + ", anno=" + anno + "]";
	}
	
	public void modificaTitolo() {
		this.titolo = s1.next();
	}
	
	public void lettereNelNome(){
		boolean a = false;
		String b = this.nomeRegista.toLowerCase();
		for (int i = 0; i<this.nomeRegista.length(); i++) {
			if (b.charAt(i) == 'j'|| b.charAt(i) == 'x' || b.charAt(i) == 'y' || b.charAt(i) == 'w' ||b.charAt(i) == 'k'){
				a = true;
			}
		}
		System.out.println(a);
	}
}
