package be.technifutur.menu;

import be.technifutur.menu.Item;
import be.technifutur.menu.actions.Factorielle;
import be.technifutur.menu.actions.Helloworld;

public class MenuFactory
{
    private Item createItem(String name, Runnable action)
    {
        Item create = new Item();

        create.setAction(action);
        create.setName(name);

        return create;
    }

    public Item getItemHelloWorld()
    {
        return createItem("Hello world", new Helloworld());
    }

    public Item getItemFactorielle()
    {
        return createItem("Factorielle", new Factorielle());
    }
}
