package be.technifutur.menu;

import be.technifutur.menu.Item;
import be.technifutur.menu.actions.Factorielle;
import be.technifutur.menu.actions.Helloworld;
import be.technifutur.menu.actions.Moyenne;

public class MenuFactory
{
    //template de creation d'item
    private Item createItem(String name, Runnable action)
    {
        Item create = new Item();

        create.setAction(action); //passe le parametre 'action' de createItem() en param de setAction()
        create.setName(name); //passe le parametre 'name' de createItem() en param de setName()

        return create; //renvoie la valeur apres affectation
    }

    public Item getItemHelloWorld()
    {
        return createItem("Programme Hello world", new Helloworld()); //cree un objet avec les parametres voulus
    }

    public Item getItemFactorielle()
    {
        return createItem("Programme Factorielle", new Factorielle()); //cree un objet avec les parametres voulus
    }

    public Item getItemMoyenne()
    {
        return createItem("Programme Moyenne", new Moyenne());
    }
}
