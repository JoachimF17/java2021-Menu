package be.technifutur.menu;

import be.technifutur.menu.actions.Factorielle;
import be.technifutur.menu.actions.Helloworld;
import be.technifutur.menu.actions.Moyenne;

public class MenuFactory
{
    //template de creation d'item
    private Item createItem(String name, Runnable action)
    {
        //objets
        Item create = new Item();

        create.setAction(action); //passe le parametre 'action' de createItem() en param de setAction()
        create.setName(name); //passe le parametre 'name' de createItem() en param de setName()

        return create; //renvoie la valeur apres affectation
    }

    //template de creation de l'itemList qu'on appelle lors de l'init du MenuController
    private void initMenu(MenuModel menu)
    {
        menu.addItem(getItemHelloWorld());
        menu.addItem(getItemFactorielle());
        menu.addItem(getItemMoyenne());

        menu.addItem(getItemQuitter());
    }

    //cree un objet avec les parametres voulus
    public Item getItemHelloWorld()
    {
        return createItem("Programme Hello world", new Helloworld());
    }

    //cree un objet avec les parametres voulus
    public Item getItemFactorielle()
    {
        return createItem("Programme Factorielle", new Factorielle());
    }

    //cree un objet avec les parametres voulus
    public Item getItemMoyenne()
    {
        return createItem("Programme Moyenne", new Moyenne());
    }

    //action quitter
    public Item getItemQuitter()
    {
        return createItem("Quitter", null);
    }

    //creation d'un MenuController sur base des MenuVue et MenuModel
    public MenuController getMenu()
    {
        //declaration des objets
        MenuController controller = new MenuController();
        MenuModel model = new MenuModel();

        initMenu(model); //on ajoute les items depuis la fonction initMenu

        //on passe le MenuModel et MenuVue en attributs du MenuController
        controller.setModel(model);
        controller.setVue(new MenuVue());

        return controller; //on renvoie le controller tel quel
    }

}
