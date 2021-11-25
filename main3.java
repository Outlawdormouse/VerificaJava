//cesar
  package es2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("scegliere di quanto spostare: ");
		int n = tastiera.nextInt();
		char[] alfabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	    
		
	    System.out.println("Inserisci gli input");

	    String in = tastiera.next();

	    String out = "";

	    int ind = 0;

	    for(int i=0; i != in.length(); i++){

	      for(int j=0; j != alfabet.length; j++){

	        if(in.charAt(i)==alfabet[j]){

	          ind = j;
	          break;
	        }
	        
	      }

	      if(ind<alfabet.length-n)
	        out += alfabet[ind + n];
	      else
	        out += alfabet[(ind+n) %n];
	    }

	    System.out.println(out);
	}
}
