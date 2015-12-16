/**
 * Выстрел
 */
public class Shot
{
    private Sector sector;
    private boolean status;

    public Shot(Sector sector)
    {
        this.sector = sector;
    }

    /**
     * @return - сектор, по которому был произведен выстрел
     */
    public Sector getSector()
    {
        return this.sector;
    }

    /**
     * @param status - результат попадания
     */
    public void setStatus(Boolean status)
    {
        this.status = status;
    }
}
