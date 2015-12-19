package models.field.sector;

/**
 * @author Verhoturov Denis - Leo.Scream.
 */
public class Empty extends Sector
{
    private boolean available;

    public Empty() {
        super();
        this.available = true;
    }

    @Override
    public Sector attacked()
    {
        super.shoot = true;
        return this;
    }

    public boolean isAvailable()
    {
        return this.available;
    }

    public void occupy()
    {
        this.available = false;
    }
}
