package imie;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) 
	{		
		int a = 1; //ma modif
		
		notes();
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
			System.out.println("######### MENU ##########");
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
	
	
	
	
	
	
}
