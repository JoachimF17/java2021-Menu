package be.technifutur.menu;

import java.util.Scanner;
import be.technifutur.menu.actions.Helloworld;
import be.technifutur.menu.actions.Factorielle;
import be.technifutur.menu.actions.Input;

public class Main
{
	public static void main(String[] args) 
	{
		//variables
		int input;
		int nbChoix = 2;
		//objets
		Scanner sc = new Scanner(System.in);
		Helloworld hw = new Helloworld();
		Factorielle facto = new Factorielle();
		Input ipt = new Input();
		
		//programme
		System.out.println("Menu des fonctions");
		System.out.println("------------------");
		System.out.println("1. Afficher Hello World");
		System.out.println("2. Calcul factorielle");
		
		input = ipt.run(nbChoix);
		
		switch(input)
		{
			case 1:
				hw.run();
				break;
			case 2:
				facto.run();
				break;
		}
	}
}