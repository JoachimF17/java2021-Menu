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
		System.out.println("Menu des programmes");
		System.out.println("-------------------");

		control.getAction().run();
	}
}