package cmpt276.group4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import cmpt276.group4.Enemy.Enemy;
import cmpt276.group4.Enemy.EnemyFactory;
import cmpt276.group4.Enemy.EnemyInitialization;
import cmpt276.group4.Enemy.EnemyType;
import cmpt276.group4.Player.PlayerGenerator;
import cmpt276.group4.Room.Room;
import cmpt276.group4.Room.RoomInitialization;
import cmpt276.group4.Room.Tile;
import cmpt276.group4.WindowAndInput.GamePanel;
import cmpt276.group4.WindowAndInput.keyboardListener;



public class GameManager {
    // typeOfRoom
    private int typeOfRoom;

    private JFrame window;
    private GamePanel gamePanel;
    private keyboardListener listener;
    private Room room;

    private EnemyFactory enemyFactory;

    private EnemyInitialization enemyInitialization;

    private RecordUsedPlace record;

    // getter
    public int getTypeOfRoom() {
        return typeOfRoom;
    }

    // setter
    public void setTypeOfRoom(int i) {
        this.typeOfRoom = i;
    }

    public void createWindows(){
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        window.setTitle("paws and pumpkins");
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        listener = new keyboardListener();
        listener.addPlayer(PlayerGenerator.creatPlayer());
        window.addKeyListener(listener);

        gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack();
        gamePanel.createTimeLine();

        RoomInitialization initialization_room = new RoomInitialization();
        initialization_room.setX(12);
        initialization_room.setY(12);
        room = initialization_room.createRoom();


        ArrayList<Position> tilesPosition = RecordUsedPlace.getInstance().getAviablePosition();
        int counter =0;
        for (Position position : tilesPosition) {
            RecordUsedPlace.getInstance().addElementToMap(new Tile(position));
        }
        System.out.println("number of tile:" + RecordUsedPlace.getInstance().getElemet().size());
        
    }

    public void enemyCatachPlayer(boolean moveable){
        if(moveable == true){
            // end game
        }
        else{
            // game continues
        }
    }

    //instance

    //enemyNum

    //gameRoom

    //totalRewardNum

    //initialgame

    //postGame

    //openDoor

    //endGame

    //EndGame

    //getAllReward

    //catchyByEnemy

    //getInstance
}
