import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Veuiller entrer un nombre : ");
		int saisi = sc.nextInt();
		//Converssion de la saisi en chaine se caractere
		String str = String.valueOf(saisi);
		String t = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);//recuperation de chactere 
			t = convertir(ch);//convertir en format LDC
			System.out.println(t);
		}
				
				
	}
	public static String convertir(char chaine) {
		String res = "";
		switch(chaine) {
		case '1': res = "|\n|";
				break;
	
		case '2':  res = " _\n";
			res+= " _|\n" + "|" + "_";
			break;
			
		case '3': res = "_\n" + "_|\n_|\n"; break;	
		
		case '4':  res = "|_|\n  |"; break;	
		
		case '5':  
				res += " _\n" + "|_\n _|"; 
				break;
				
		case '6':  res = " _\n|_\n"; 
				res += "|_|";
				break;
				
		case '7':  res = "_\n |\n |"; break;	
		
		case '8':  res = " _\n|_|\n|_|"; break;
				
		case '9':  res = " _\n|_|\n _|"; break; 
				
		case '0':  res = " _\n| |\n|_|"; break;
		
		}
		return res;
		
		
	}

		
}
