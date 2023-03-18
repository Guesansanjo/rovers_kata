package Directions;

public abstract class South extends CardinalImplements implements Cardinal{
    @Override
    public void turnLeft() {
        setCardinalFacingDirection("E");

    }

    @Override
    public void turnRigth() {
        setCardinalFacingDirection("W");

    }
}
