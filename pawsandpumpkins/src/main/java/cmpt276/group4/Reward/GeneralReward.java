package cmpt276.group4.Reward;

import cmpt276.group4.Position;

public abstract class GeneralReward implements Reward {
    private long displayStartTime;
    private long displayDuration;
    private int score;
    private Position position;
    private boolean available;

    public abstract void setPosition(Position position);
}
