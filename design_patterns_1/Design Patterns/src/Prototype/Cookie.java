package Prototype;

public class Cookie implements Cloneable
{
    @Override
    public Cookie clone() 
    {
        try 
        {
            Cookie copy = (Cookie)super.clone();
            // Dans une impl�mentation r�elle de ce patron de conception, il faudrait
            // cr�er la copie en dupliquant les objets contenus et en attribuant des
            // valeurs valides (exemple : un nouvel identificateur unique pour la copie).
            return copy;
        }
        catch (CloneNotSupportedException e)
        {
            return null;
        }
    }
}

