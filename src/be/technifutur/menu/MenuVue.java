package be.technifutur.menu;

import java.util.Scanner;

public class MenuVue
{
    //attributs
    private Scanner input = new Scanner(System.in);
    private String error = null;

    //methodes
    public void setError(String error)
    {
        this.error = error;
    }

    public String saisirMenu(MenuModel menu)
    {
        //variables
        int i;
        //objets
        String afficheMenu = "-";

        //affichage
        System.out.println(menu.getName());
        System.out.println(afficheMenu.repeat(menu.getName().length()));

        //boucle qui renvoie le name de chaque node
        for(i = 0; i < menu.getSize(); i++)
            System.out.println((i+1)+". "+menu.getNode(i).getName());

        if(this.error != null)
            System.out.println("Erreur : "+error);

        //on demande l'input a l'utilisateur
        System.out.print("Entrez le nombre correspondant : ");

        //on renvoie l'input, la verif se fera dans le controller et pas dans la vue
        return this.input.nextLine();
    }
}
