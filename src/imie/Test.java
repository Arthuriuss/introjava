package imie;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) 
	{		
		int a = 1; //ma modif
		
		while(a != 4)
		{
			listerMenu();
			a = saisirEntier();
			menu2(a);
		}
	}
	
	public static int saisirEntier()
	{		
		Scanner sc = new Scanner(System.in);
		int choix;

		choix = sc.nextInt();
		
		return choix;
	}
	
	public static void listerMenu()
	{
		System.out.println("######### MENU ##########");
		System.out.println("1 - Addition");
		System.out.println("2 - Soustraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Rien, je veux glander !");
		System.out.println("\nQue voulez-vous faire : ");
	}
	
	public static void menu1(int choix)
	{
		if(choix < 1 || choix > 4)
			System.out.println("Mauvais choix !");
		else
			System.out.println("Option numéro " + choix);
	}
	
	public static void menu2(int choix)
	{
		switch(choix)
		{
			case 1:
				System.out.println("Vous avez choisi une addition !");
				break;
			case 2:
				System.out.println("Vous avez choisi une soustraction !");
				break;
			case 3:
				System.out.println("Vous avez choisi une multiplication !");
				break;
			case 4:
				System.out.println("Vous voulez glander ? Aurevoir !");
				break;
			default:
				System.out.println("Vous avez choisi une mauvaise option ! Veuillez saisir un chiffre entre 1 et 4.");
				break;
		}
	}
}
