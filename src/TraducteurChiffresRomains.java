import java.util.Scanner;

public class TraducteurChiffresRomains {

	public static void main(String[] args) {
		/*
		 * Exercice 4 : "Le traducteur de chiffres romains" Votre client vous demande de
		 * concevoir un programme capable de convertir des chiffres arabes (par exemple
		 * 1987) en chiffres romains (par exemple MCMLXXXVII). Le programme doit
		 * demander à l"utilisateur un nombre et ensuite afficher son équivalent en
		 * chiffres romains.
		 */

		Scanner myObj = new Scanner(System.in);
		String nombre = "";
		String chiffreRomain = "";
		int intNombre = 0;
		int cpt = 0;

		String[][] correspondance = {{"I","V","X","L","C","D","M"}, {"1","5", "10","50","100","500","1000"}};

		for (int j= 0; j < correspondance[0].length; ++j) {
			System.out.println( correspondance[0][j] + " = " + correspondance[1][j]);
		}
		
		System.out.println("Entrez un nombre");
		nombre = myObj.nextLine();
		
		intNombre = Integer.valueOf(nombre);
		
//		switch (intNombre){
//		case 
//		
//		}
//		
		
//		while(!nombre.equals(correspondance)) {
//			if (nombre.equals(correspondance))
//		}
		
		if (nombre.length() < 2) {
			if (intNombre < 5) {
				for (int j= 0; j < intNombre; ++j) {
					chiffreRomain += "I";
				}
			}else {
				for (int j= 0; j < intNombre; ++j) {
					chiffreRomain += "V";
				}
			}
		}else if (nombre.length() < 3) {

			if (intNombre < 50) {
				char prefix = nombre.charAt(0);
				int cpt2 = nombre.charAt(0);
				intNombre = prefix;
				System.out.println("   " + intNombre + "      " + nombre.charAt(0) + "  " + prefix);
				chiffreRomain = " ";
				for (int j= 0; j < nombre.charAt(0); ++j) {
					System.out.print("=");
					chiffreRomain += "X";
				}
			}else {
				System.out.println(" ==>  " + nombre.charAt(0));
				int cpt2 = Character.getNumericValue(nombre.charAt(0));
				System.out.println(" cpt 2 ==>  " + cpt2);
				while (cpt2 > 0) {
					chiffreRomain += "L";
					cpt2--;
				}
			}
		}else if (nombre.length() < 4) {
			if (intNombre < 500) {
				for (int j= 0; j < intNombre; ++j) {
					chiffreRomain += "C";
				}
			}else {
				for (int j= 0; j < intNombre; ++j) {
					chiffreRomain += "D";
				}
			}	
		}else {
			for (int j= 0; j < intNombre; ++j) {
				chiffreRomain += "M";
			}
		}
		
		System.out.println("Chiffre romain : " + chiffreRomain);
		
		myObj.close();
		
	} 


}


