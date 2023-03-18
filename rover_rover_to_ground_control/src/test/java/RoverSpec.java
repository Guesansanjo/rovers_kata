import Directions.CardinalImplements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverSpec {

    @Test
    void roverInitialPositionX0Y0(){
        //Given
        Rover rover = new Rover();
        Location location = new Location();
        //When
        location.setPositionAxisX(0);
        location.setPositionAxisY(0);
        rover.setLocation(location);
        //Then
        assertEquals(rover.getLocation(),location);
    }

    @Test
    void roverInitialCardinalPositionNorth(){
        //Given
        Rover rover = new Rover();
        CardinalImplements cardinal = new CardinalImplements();
        //When
        cardinal.setCardinalFacingDirection("N");
        rover.setCardinal(cardinal);
        //Then
        assertEquals(rover.getCardinal(),cardinal);
    }

    @Test
    void roverInitialCardinalPositionWest(){
        //Given
        Rover rover = new Rover();
        CardinalImplements cardinal = new CardinalImplements();
        //When
        cardinal.setCardinalFacingDirection("W");
        rover.setCardinal(cardinal);
        //Then
        assertEquals(rover.getCardinal(),cardinal);
    }

    @Test
    void roverInitialCardinalPositionEast(){
        //Given
        Rover rover = new Rover();
        CardinalImplements cardinal = new CardinalImplements();
        //When
        cardinal.setCardinalFacingDirection("E");
        rover.setCardinal(cardinal);
        //Then
        assertEquals(rover.getCardinal(),cardinal);
    }

    @Test
    void roverInitialCardinalPositionSouth(){
        //Given
        Rover rover = new Rover();
        CardinalImplements cardinal = new CardinalImplements();
        //When
        cardinal.setCardinalFacingDirection("S");
        rover.setCardinal(cardinal);
        //Then
        assertEquals(rover.getCardinal(),cardinal);
    }




}
