package be.technifutur.menu;

import be.technifutur.menu.actions.Factorielle;
import be.technifutur.menu.actions.Helloworld;
import be.technifutur.menu.actions.Moyenne;

public class MenuFactory
{
    //methodes
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
        menu.addNode(getItemHelloWorld());
        menu.addNode(getItemFactorielle());
        menu.addNode(getItemMoyenne());

        menu.addNode(getItemQuitter());
    }

    private MenuController createMenu(MenuModel model)
    {
        //declaration des objets
        MenuController menu = new MenuController();

        //on passe le MenuModel et MenuVue en attributs du MenuController
        menu.setModel(model);
        menu.setVue(new MenuVue());

        return menu; //on renvoie le controller tel quel
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

    //menus
    private MenuModel getMenuPrincipal()
    {
        MenuModel model = new MenuModel("Menu principal");

        model.addNode(getItemHelloWorld());
        model.addNode(createMenu(getMenuExercices()));

        model.addNode(getItemQuitter());

        return model;
    }

    private MenuModel getMenuExercices()
    {
        MenuModel model = new MenuModel("Exercices");

        model.addNode(getItemFactorielle());
        model.addNode(getItemMoyenne());

        model.addNode(getItemQuitter());

        return model;
    }

    //creation d'un MenuController sur base des MenuVue et MenuModel
    public MenuController getMenu()
    {
        return createMenu(getMenuPrincipal()); //on renvoie le controller tel quel
    }

}
