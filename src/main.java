package src;

import src.player.player;

public class main {
public static void main(String[] args) {
    playingField player1Field = new playingField();
    player player = new player();
    player1Field.drawField(player1Field.field);
    player1Field.field =  player.numberOfShips(player1Field.field);
    player1Field.drawFieldWithShips(player1Field.field);
}
}