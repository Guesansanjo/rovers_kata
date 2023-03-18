package Directions;

public abstract class East  extends CardinalImplements implements Cardinal{
    @Override
    public void turnLeft() {
        setCardinalFacingDirection("S");
    }

    @Override
    public void turnRigth() {
        setCardinalFacingDirection("N");
    }
}
