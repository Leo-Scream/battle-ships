package models.field.sector;

/**
 * @author Verhoturov Denis - Leo.Scream.
 */
public class Occupied extends Sector
{
    private boolean intact = true;

    public Occupied() {
        super();
    }

    /**
     * @return - является ли палуба целой
     */
    public boolean isIntact()
    {
        return this.intact;
    }

    @Override
    public Occupied attacked()
    {
        super.shoot = true;
        this.intact = false;
        return this;
    }
}
