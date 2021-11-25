//root 13
package es2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		
		
		char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	    

	    System.out.println("Inserisci gli input: ");

	    String input = tastiera.nextLine();

	    String output = "";

	    int index = 0;

	    for(int i=0; i != input.length(); i++){

	      for(int j=0; j != alfabeto.length; j++){

	        if(input.charAt(i)==alfabeto[j]){

	          index = j;
	          break;
	        }
	        
	      }

	      if(index<13)
	        output += alfabeto[index + 13];
	      else
	        output += alfabeto[(index+13) %13];
	    }

	    System.out.println(output);

	}
}
