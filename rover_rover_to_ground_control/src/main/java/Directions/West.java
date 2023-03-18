package Directions;

public abstract class West extends CardinalImplements implements Cardinal{
    @Override
    public void turnLeft() {
        setCardinalFacingDirection("N");

    }

    @Override
    public void turnRigth() {
        setCardinalFacingDirection("S");

    }
}
