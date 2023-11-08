package cmpt276.group4.Room;

import java.awt.Graphics2D;

import cmpt276.group4.CharacterAvaliablePosition;
import cmpt276.group4.Position;

public class Door implements CharacterAvaliablePosition{
    // open variable
    private boolean open;

    public Door(boolean IsOpen) {
        this.open = IsOpen;
    }
    // getter for open
    public boolean getOpen() {
        return open;
    }

    // setter for open
    public void setOpen(boolean i) {
        this.open = i;
    }

    // this function opens door by setting open to true
    public void openDoor() {
        this.open = true;
    }

    @Override
    public boolean getPlayerAvaliable() {
        throw new UnsupportedOperationException("is player avaliable");
    }

    @Override
    public Position getPosition() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPosition'");
    }
    @Override
    public boolean getTakenPlace() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTakenPlace'");
    }
    @Override
    public void draw(Graphics2D g2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'draw'");
    }
}
