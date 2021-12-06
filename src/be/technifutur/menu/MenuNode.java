package be.technifutur.menu;

public interface MenuNode
{
    //getters
    // renvoie le String 'name' de l'instance
    String getName();

    //renvoie le Runnable 'action' de l'instance
    Runnable getAction();
}
