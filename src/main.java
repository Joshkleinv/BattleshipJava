package src;

import src.player.player;

public class main {
public static void main(String[] args) {
    playingField test = new playingField();
    player player = new player();
    test.drawField(test.field);
    test.field =  player.numberOfShips(test.field);
    test.drawFieldWithShips(test.field);
}
}