package Directions;

public abstract class North extends CardinalImplements implements Cardinal{
    @Override
    public void turnLeft() {
        setCardinalFacingDirection("W");

    }

    @Override
    public void turnRigth() {
        setCardinalFacingDirection("E");

    }
}
