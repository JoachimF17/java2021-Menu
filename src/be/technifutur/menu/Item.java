package be.technifutur.menu;

public class Item implements MenuNode
{
    //attributs
    private String name;
    private Runnable action;

    //methodes
    //getters
    // renvoie le String 'name' de l'instance
    @Override public String getName()
    {
        return this.name;
    }
    //renvoie le Runnable 'action' de l'instance
    @Override public Runnable getAction()
    {
        return this.action;
    }
    //fin getters

    //setters
    // affecte le 'name' en parametre au 'name' de l'instance
    public void setName(String name)
    {
        this.name = name;
    }
    //affecte le 'action' en parametre au 'action' de l'instance
    public void setAction(Runnable action)
    {
        this.action = action;
    }
    //fin setters
}