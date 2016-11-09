package imie;

import java.util.Random;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) 
	{		
		int a = 1; //ma modif
		
		menu3();
		//notes();
		//ajout de ça !
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
	
	public static void menu()
	{
		Scanner sc = new Scanner(System.in);
		int choix = 1;
		while(choix != 4)
		{
			System.out.println("\n######### MENU ##########");
			System.out.println("1 - Addition");
			System.out.println("2 - Soustraction");
			System.out.println("3 - Multiplication");
			System.out.println("4 - Rien, je veux glander !");
			System.out.println("\nQue voulez-vous faire : ");


			choix = sc.nextInt();

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
	
	public static void notes()
	{
		//double [][] notesClasse = { {5,3,15}, {20,15,6}, {18,15,10}, {9,15,14}, {15,10,8} };
		double som, moy;
		Scanner sc = new Scanner(System.in);
		
		double [][] notesClasse = new double[5][3];
		for(int i=0; i<notesClasse.length; i++)
		{
			System.out.println("Saisie des notes de l'élève " + (i+1));
			//Parcours des 3 notes de l'élève i
			for(int j=0; j<notesClasse[i].length; j++)
			{
				System.out.println("Note n°" + (j+1)+ " ");
				notesClasse[i][j] = sc.nextDouble();
			}
		}
		
		//Parcours des 5 lignes (les 5 élèves)
		for(int i=0; i<notesClasse.length; i++)
		{
			som = 0;
			//Parcours des 3 notes de l'élève i
			for(int j=0; j<notesClasse[i].length; j++)
			{
				som = som + notesClasse[i][j]; //addition des notes de l'élève i
			}
			moy = (double)Math.round((som/notesClasse[i].length)*10)/10; //calcule de la moyenne de l'élève i
			//moy = som/notesClasse[i].length; //calcule de la moyenne de l'élève i
			System.out.println("La moyenne de l'élève " + (i+1) + " est : " + moy);
		}
	}
	
	public static void menu3()
	{
		Scanner sc = new Scanner(System.in);
		int choix;

		do
		{
			//Affichage du menu
			System.out.println("\n########## MENU ############");
			System.out.println("1 - Jeu du nombre mystère");
			System.out.println("2 - Convertisseurs miles en km");
			System.out.println("3 - Quitter");

			System.out.print("Choisir une option : ");
			do{
				choix = sc.nextInt();
				if(choix < 1 || choix > 3)
					System.out.print("Option invalide, saisir un chiffre entre 1 et 3 : ");
			}while(choix < 1 || choix > 3);

			//Traitement du choix
			switch (choix) {
				case 1:
					jeuNombreMystere();
					break;
				case 2:
					conversionMilesKm();
					break;
				default:
					break;
			}
			
		}while(choix != 3);
		
		System.out.println("Bye bye !");
	}
	
	public static void jeuNombreMystere()
	{
		int nombrePropose, nombreMystere, nbTentatives;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n####### JEU DU NOMBRE MYSTERE #######");
		System.out.println("But du jeu : trouver le nombre mystère (entre 1 et 1000) le plus rapidement possible.");
		System.out.println("Tapez 0 si vous souhaitez abandonner.");
		
		//Initialisation du nombre mystere
		Random rand = new Random();
		nombreMystere = rand.nextInt(1000)+1;
		nbTentatives = 0;
		
		do{
			System.out.print("Proposez un nombre : ");
			nombrePropose = sc.nextInt();
			nbTentatives++;
			
			//Je verifie que le joueur ne veut pas abandonner
			if(nombrePropose != 0)
			{
				if(nombrePropose < 1 || nombrePropose > 1000) {
					System.out.println("Vous devez choisir un nombre entre 1 et 1000 !");
					nbTentatives--; //on annule cette tentative
				}
				else if(nombrePropose < nombreMystere)
					System.out.println("C'est + !");
				else if(nombrePropose > nombreMystere)
					System.out.println("C'est moins !");
			}
			
		}while(nombreMystere != nombrePropose && nombrePropose != 0);
		
		if(nombreMystere == nombrePropose)
			System.out.println("Félicitations, vous avez gagné ! Vous avez trouvé le nombre mystère en " + nbTentatives + " tentatives.");
		else
			System.out.println("Vous êtes un GROS NUL ! Bye.");
	}
	
	public static void conversionMilesKm()
	{
		Scanner sc = new Scanner(System.in);
		double miles;

		System.out.println("\n\n####### CONVERTISSEUR #######");
		System.out.print("Entrez le nombre de miles à convertir en kilomètres : ");
		miles = sc.nextDouble();
		
		System.out.println(miles + " miles ==> " + (miles*1.60934) + " km");
	}
	
}
