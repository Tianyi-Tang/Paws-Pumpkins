package cmpt276.group4.Reward;

import cmpt276.group4.Player.Player;
import cmpt276.group4.Position;
import cmpt276.group4.GameMap.RecordUsedPlace;
import cmpt276.group4.GameMap.RoomEnvironment;
import cmpt276.group4.GameMap.RoomLayout;
import cmpt276.group4.Logic.WindowConfig;
import cmpt276.group4.WindowAndInput.GamePanel;

import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Candy extends GeneralReward {
    private Position cdposition,playerPosition;
    private boolean org_State = true;
    private int stateCounter = 0;
    private int score =1;
    private BufferedImage cd1 , cd2, currentImage;
    private RecordUsedPlace record;
    public boolean isBonusReward = false;


    GamePanel gp;

    public Candy(){
        record = RecordUsedPlace.getInstance();
        getCandyImage();
        cdposition=record.getRandomFromAvailablePosition();
        RoomEnvironment.getInstance().addReward(this);
    }
    @Override
    public int getScore() {
        return score;
    }

    @Override
    public Position getPosition() {
        return cdposition;
    }


    @Override
    public void setPosition(Position position) {
        cdposition = position;

    }

    @Override
    public boolean isAvailable() {
        return false;
    }
    @Override
    public boolean isBonusReward(){
        return isBonusReward;
    }

    @Override
    public void deleteImage() {
        this.cd1=null;
        this.cd2=null;
    }

    @Override
    public void addBenefit(Player player) {
        playerPosition = Player.getInstance().getPosition();
        if (playerPosition.equal(cdposition)) {
            addScore(player,score);
            RoomEnvironment.getInstance().removeReward(this);
        }

    }


    private void addScore(Player player, int score) {
        this.score=score;
        player.addScoreToPlayer(score,isBonusReward);

    }

    private void getCandyImage(){
        try{
            String directory = System.getProperty("user.dir");
            cd1= ImageIO.read(new File(directory +"/res/Rewards/candy1.png"));
            cd2= ImageIO.read(new File(directory +"/res/Rewards/candy2.png"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean shouldDraw(long time){
        return true;
    }
    @Override
    public void draw(Graphics2D g1){
        stateCounter++;
        if (stateCounter >= 15) {
            org_State = !org_State;
            stateCounter = 0;
        }
       if (org_State)
            currentImage = cd1;
        else
            currentImage = cd2;

        g1.drawImage(currentImage,cdposition.getX_axis(),cdposition.getY_axis(), WindowConfig.tileSize, WindowConfig.tileSize,null);
    }


}
