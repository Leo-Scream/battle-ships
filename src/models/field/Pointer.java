package models.field;

/**
 * Указатель на сектор поля
 */
public class Pointer
{
    private int horizontalOffset;
    private int verticalOffset;

    public Pointer(int verticalOffset, int horizontalOffset)
    {
        this.verticalOffset = verticalOffset;
        this.horizontalOffset = horizontalOffset;
    }

    public void setOffset(int vertical, int horizontal)
    {
        this.verticalOffset = vertical;
        this.horizontalOffset = horizontal;
    }
}