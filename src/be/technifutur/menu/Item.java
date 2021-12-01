package be.technifutur.menu;

public class Item
{
    //attributs
    private String name;
    private Runnable action;

    //getters
    public String getName()
    {
        return this.name;
    }

    public Runnable getAction()
    {
        return this.action;
    }
    //fin getters

    //setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAction(Runnable action)
    {
        this.action = action;
    }
    //fin setters
}