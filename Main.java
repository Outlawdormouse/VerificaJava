package es1;

public class Main {
	public static void main(String [] args) {
		Film f1 = new Film("titanic", "Jasparetto", "italiano", "italia", 2004);
		f1.modificaTitolo();
		System.out.println(f1);
		f1.lettereNelNome();
	}
}

