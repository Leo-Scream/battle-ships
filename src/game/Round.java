package game;

import field.ship.Layout;
import field.ship.Type;

/**
 * Раунд игры
 */
public class Round // TODO сделать Serializable и сохранять в файл
{
    private Settings settings;
    private field.Player playerField;
    private field.Opponent opponentField;

    public Round(Settings settings)
    {
        this.settings = settings;
        this.playerField = new field.Player(settings.getFieldWidth(), settings.getFieldHeight());
        this.opponentField = new field.Opponent(settings.getFieldWidth(), settings.getFieldHeight());
    }

    public field.Player getPlayerField()
    {
        return this.playerField;
    }

    public field.Opponent opponentField()
    {
        return this.opponentField;
    }

    public void placeShip()
    {
        Layout layout = new Layout(Type.SINGLE_DECK, this.playerField.getPossibleSectors());

        this.playerField.placeShip(layout);
    }

    public field.ship.Type chooseShip()
    {
        // TODO
        return Type.SINGLE_DECK;
    }

    /**
     * Проверить, можно ли считать раунд завершенным.
     * @return - завершен ли раунд
     */
    public boolean isFinished()
    {
        return playerField.isDefeated();
    }
}
