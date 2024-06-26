package cmpt276.group4.WindowAndInput;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

import cmpt276.group4.gameLevel;
import cmpt276.group4.Logic.WindowConfig;

/**
 * Class represent the Main menu of game 
 */
public class MainPanel extends JPanel {

    private JButton startButton;// start the game 
    private PanelController controller;

    // difficulty level
    private JButton easyLevelButton;
    private JButton middleLevelButton;
    private JButton hardLevelButton;
    private BufferedImage mainPanel_img;

    /**
     * Constructor to initla button and background for main menu
     */
    public MainPanel(){
        loadingImage();
        startButton = new JButton();
        startButton.setText("Start Game");
        startButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickStartButton();
                super.mouseClicked(e);
            }
        });
        startButton.setBounds(7* WindowConfig.tileSize,7* WindowConfig.tileSize,WindowConfig.tileSize *2,WindowConfig.tileSize);
        this.setLayout(null);

        this.setPreferredSize(new Dimension(WindowConfig.screenWidth,WindowConfig.screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);

        this.add(startButton);
        createButton();
    }

    /**
     * Setting the controller that will be used
     * @param controller the PanelControl that mainPanel going to used
     */
    public void init(PanelController controller){
        this.controller = controller;
    }

    /**
     * Action will been take after press start button
     */
    public void clickStartButton(){
        VisibleDifficultButton();
        startButton.setVisible(false);
    }

    /**
     * Set the difficulty button
     */
    private void createButton(){
        easyLevelButton = new JButton();
        easyLevelButton.setText("Easy");
        easyLevelButton.setVisible(false);
        easyLevelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 controller.transformToLoadingScreen(gameLevel.BASIC);
                super.mouseClicked(e);
            }
        });

        middleLevelButton = new JButton();
        middleLevelButton.setText("Middle");
        middleLevelButton.setVisible(false);
        middleLevelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                 controller.transformToLoadingScreen(gameLevel.MEDIUM);
                super.mouseClicked(e);
            }
        });

        hardLevelButton = new JButton();
        hardLevelButton.setText("Hard");
        hardLevelButton.setVisible(false);
        hardLevelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                controller.transformToLoadingScreen(gameLevel.HARD);
                super.mouseClicked(e);
            }
        });


        easyLevelButton.setBounds(7* WindowConfig.tileSize,7* WindowConfig.tileSize,WindowConfig.tileSize *2,WindowConfig.tileSize);
        middleLevelButton.setBounds(7* WindowConfig.tileSize, 8* WindowConfig.tileSize, WindowConfig.tileSize *2, WindowConfig.tileSize);
        hardLevelButton.setBounds(7* WindowConfig.tileSize, 9* WindowConfig.tileSize, WindowConfig.tileSize *2, WindowConfig.tileSize);

        this.add(easyLevelButton);
        this.add(middleLevelButton);
        this.add(hardLevelButton);
    }

    /**
     * laoding the background image
     */
    private void loadingImage(){
        try {
            mainPanel_img = ImageIO.read(new File("res/pop_up/game_welcome_page2.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(mainPanel_img != null)
            g.drawImage(mainPanel_img,0,0,WindowConfig.screenWidth,WindowConfig.screenHeight,this);
    }

    /**
     * make the difficlty button avaliable
     */
    private void VisibleDifficultButton(){
        easyLevelButton.setVisible(true);
        middleLevelButton.setVisible(true);
        hardLevelButton.setVisible(true);
        controller.getGameStatu();
    }
    
}