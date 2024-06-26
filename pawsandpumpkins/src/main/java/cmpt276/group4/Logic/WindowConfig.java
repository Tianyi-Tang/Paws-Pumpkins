package cmpt276.group4.Logic;

public class WindowConfig {
    private static final int original_tileSize = 16;
    private static final int scale = 3;
    public static final int tileSize = original_tileSize * scale;

    public static final int maxScreenCol = 16;
    public static final int maxScreenRow = 16;
    public static final int screenWidth = maxScreenCol * tileSize;
    public static final int screenHeight = maxScreenRow * tileSize;
}
