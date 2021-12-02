package be.technifutur.menu;

public class Main
{
	public static void main(String[] args) 
	{
		//variables
		int input;
		int nbChoix;
		int i;
		//objets
		MenuFactory factory = new MenuFactory();
		MenuController control = factory.getMenu();
		
		//programme
		if(control.getAction() != null) //on lance le run() que si on n'a pas recu 'null'
			control.getAction().run();
		else
			System.out.println("Input invalide");
	}
}