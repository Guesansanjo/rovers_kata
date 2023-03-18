import Directions.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rover {

  private East east;
  private North north;
  private South south;
  private West west;
  private Location location;
  private CardinalImplements cardinal;


}
