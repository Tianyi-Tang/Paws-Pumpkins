package cmpt276.group4.Player;

import cmpt276.group4.Movement;
import cmpt276.group4.Position;
import cmpt276.group4.GameMap.RecordUsedPlace;
import cmpt276.group4.GameMap.RoomLayout;
import cmpt276.group4.Logic.WindowConfig;

/**
 * Class the judge whether player can move to the center position
 */
public class PlayerMovement implements Movement {
    private RoomLayout roomLayout;

    public PlayerMovement(){
        roomLayout = RoomLayout.getInstance();
    }
    /**
     * Moves the player to the target position
     * @param position The target position that player want to move 
     * @return If this position is avaliable for player return true, else return false
     */
    @Override
    public boolean moveTo(Position position) {
        return isPositionAvailable(position);
    }

    /**
     * Check the target position is aviable to player or not 
     * @param position The target position for player moving
     * @return If this position is avaliable for player return true, else return false
     */
    @Override
    public boolean isPositionAvailable(Position position) {
        if(roomLayout.isPositionAviable(position)){
            return true;
        }
        else
            return false;
    }
    
}
