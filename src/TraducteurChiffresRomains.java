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
		int borneMax = 0;

		String[][] correspondance = {{"I","V","X","L","C","D","M"}, {"1","5", "10","50","100","500","1000"}};

		for (int j= 0; j < correspondance[0].length; ++j) {
			System.out.println( correspondance[0][j] + " = " + correspondance[1][j]);
		}

		System.out.println("Entrez un nombre");
		nombre = myObj.nextLine();

		intNombre = Integer.valueOf(nombre);

		if (nombre.length() == 4) {
			borneMax = Character.getNumericValue(nombre.charAt(0));
			for (int j= 0; j < borneMax; ++j) {
				chiffreRomain += "M";
			}
			nombre = nombre.substring(1, nombre.length());
			System.out.println("nombre : " + nombre);
		} 

		if (nombre.length() == 3) {
			borneMax = Character.getNumericValue(nombre.charAt(0));
			System.out.println("borneMax " + borneMax);
			if (borneMax <= 3) {
				for (int j= 0; j < borneMax; ++j) { 
					chiffreRomain += "C";
				}
			}else if (borneMax == 4) {
				chiffreRomain += "CD";
			}else {
				System.out.println("borneMax 0: " + borneMax);
				System.out.println("borneMax 1: " + borneMax);
				if (borneMax == 9) {
					chiffreRomain += "CM";
				}else {
					chiffreRomain += "D";
					borneMax -= 5;
					if (borneMax >= 1) {
						for (int j= 0; j < borneMax; ++j) { 
							chiffreRomain += "C";
						}
					}
				}
			}
			nombre = nombre.substring(1, nombre.length());
			System.out.println("nombre : " + nombre);
		} 

		if (nombre.length() == 2) {
			borneMax = Character.getNumericValue(nombre.charAt(0));
			System.out.println("borneMax " + borneMax);
			if (borneMax <= 3) {
				for (int j= 0; j < borneMax; ++j) { 
					chiffreRomain += "X";
				}
			}else if (borneMax == 4) {
				chiffreRomain += "XL";
			}else {
				System.out.println("borneMax 0: " + borneMax);
				System.out.println("borneMax 1: " + borneMax);
				if (borneMax == 9) {
					chiffreRomain += "XC";
				}else {
					chiffreRomain += "L";
					borneMax -= 5;
					if (borneMax >= 1) {
						for (int j= 0; j < borneMax; ++j) { 
							chiffreRomain += "X";
						}
					}
				}
			}
			nombre = nombre.substring(1, nombre.length());
			System.out.println("nombre : " + nombre);
			
		}
		
		if (nombre.length() == 1) {
			borneMax = Character.getNumericValue(nombre.charAt(0));
			System.out.println("borneMax " + borneMax);
			if (borneMax <= 3) {
				for (int j= 0; j < borneMax; ++j) { 
					chiffreRomain += "I";
				}
			}else if (borneMax == 4) {
				chiffreRomain += "IV";
			}else {
				System.out.println("borneMax 0: " + borneMax);
				System.out.println("borneMax 1: " + borneMax);
				if (borneMax == 9) {
					chiffreRomain += "IX";
				}else {
					chiffreRomain += "V";
					borneMax -= 5;
					if (borneMax >= 1) {
						for (int j= 0; j < borneMax; ++j) { 
							chiffreRomain += "I";
						}
					}
				}
			}
		}
		
		System.out.println("Chiffre romain : " + chiffreRomain);

		myObj.close();
	}
}





