# Paws&Pumpkins
Paws and Pumpkins is a captivating 2D PAC-MAN game where the player controls a cute corgi dog called Paws. The objective is to collect candy in a haunted house and exit the room after gathering all the candy. Ghosts roam the room, searching for the player, who must evade the ghosts and avoid touching the stationary spiders. During the game, the player can also collect pumpkin heads that appear randomly to earn higher scores. The game ends when the player successfully leaves the room, is caught by a ghost, or the score becomes negative. At the end of the game, the player's score is displayed. The game offers three difficulty levels: easy, medium, and hard.

## Project Demonstration
When you enter the game you will see the Main Menu with start button
<br>
<img src="/Game_demonstrate_img/Game_start.png" alt="Game_start" width="350" height="350">
<br>

After clicking the start button, you can chose any difficulty you want
<br>
<img src="/Game_demonstrate_img/Difficulty_level.png" alt="Difficulty_level" width="350" height="350">
<br>

The game will load and display the game level base on the difficulty you chose
<br>
<img src="/Game_demonstrate_img/Game_scene.png" alt="Game_scene" width="350" height="350">
<br>

After you finished you game, you will able to see your performance
<br>
<img src="/Game_demonstrate_img/Fianll_score.png" alt="Fianll_score" width="350" height="350">
<br>

## Getting Started
### Perequisites
- Java JDK (Version 20 or above)
- Maven (Version 3.6.0 or above)
- Git (latest stable version)

## Installation
#### Clone the project
```bash
git clone https://github.com/Tianyi-Tang/Paws-Pumpkins.git
```

#### Go to the project directory
```bash
cd ./pawsandpumpkins
```

#### Go to source code
```bash
cd ./pawsandpumpkins/src/main/java/cmpt276/group4
```

#### GO to test case
```bash
cd ./pawsandpumpkins/test/main/java/cmpt276/group4
```

## Build and Run
#### Clean and Install Dependencies
```bash
mvn clean install
```

#### Compile the project
```bash
mvn clean compile
```

#### Run the Game
```bash
mvn exec:java
```
