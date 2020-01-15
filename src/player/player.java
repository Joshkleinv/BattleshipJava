package src.player;

import java.lang.reflect.Field;
import java.util.Scanner;

import src.draw;
import src.playingField;
import src.interfaces.interfacePlayer;



public class player implements interfacePlayer{
private static Scanner scanner = new Scanner(System.in);
private static draw Draw = new draw();

    @Override
    public void attackShip() {
        // TODO Auto-generated method stub

    }

    public int[][] numberOfShips(int[][] field) {

        field = placeShip(field, 2 ,2);
        Draw.drawField(field);

        field = placeShip(field, 3, 3);
        Draw.drawField(field);

        field = placeShip(field, 3, 4);
        Draw.drawField(field);

        field = placeShip(field, 4, 5);
        Draw.drawField(field);

        field = placeShip(field, 6, 6);

        return field;
    }

    @Override
	public int[][] placeShip(int[][] field, int size, int ShipId) {
        boolean north  = true;
        boolean east = true;
        boolean south = true;
        boolean west = true;
        

        int shipSize = size;
        System.out.println("place your ship");
        System.out.println("x cordinate");
        String x = scanner.nextLine();
        System.out.println("y cordinate");
        int y = scanner.nextInt();
        int xCordinate = 0;
        int yCordinate = y;
        if( x.equals("a")  || x.equals("A")){
            xCordinate = 0;
        }
        if( x.equals("b")  || x.equals("B")){
            xCordinate = 1;
        }
        if( x.equals("c")  || x.equals("C")){
            xCordinate = 2;
        }
        if( x.equals("d")  || x.equals("D")){
            xCordinate = 3;
        }
        if( x.equals("e")  || x.equals("E")){
            xCordinate = 4;
        }
        if( x.equals("f")  || x.equals("F")){
            xCordinate = 5;
        }
        if( x.equals("g")  || x.equals("G")){
            xCordinate = 6;
        }
        if( x.equals("h")  || x.equals("H")){
            xCordinate = 7;
        }
        if( x.equals("i")  || x.equals("I")){
            xCordinate = 8;
        }
        if( x.equals("j")  || x.equals("J")){
            xCordinate = 9;
        }    

        System.out.println(yCordinate + " y");
        System.out.println(xCordinate + " x");

        field[yCordinate][xCordinate] = 1; 
        Draw.drawField(field);
        System.out.println(xCordinate);
        if (xCordinate - shipSize +1 >= 0){
            System.out.println("west");
            for(int i = 1; i < shipSize; i++){
                if(field[yCordinate][xCordinate - i] == 1){
                    west = false;
                }
            }
        }
        else{
            west = false;
        }
        if (xCordinate + shipSize -1 < 10){
            for(int i = 1; i < shipSize; i++){
                if(field[yCordinate][xCordinate + i] == 1){
                    east = false;
                }
            }
        }
        else{
            east = false;
        }
        if (yCordinate - shipSize +1 >= 0){
            for(int i = 1; i < shipSize; i++){
                if(field[yCordinate - i][xCordinate] == 1){
                    north = false;
                }
            }
        }
        else{
            north = false;
        }
        if (yCordinate + shipSize -1 < 10){
            for(int i = 1; i < shipSize; i++){
                if(field[yCordinate + i][xCordinate] == 1){
                    south = false;
                }
            }
        }
        else{
            south = false;
        }
        
        System.out.println("Which direction");
        
        if(north){
            System.out.println("n for north");
        }
        if(east){
            System.out.println("e for east");
        }
        if(south){
            System.out.println("s for south");
        }
        if(west){
            System.out.println("w for west");
        }
        scanner.nextLine();
        String direction = scanner.nextLine();

        if(direction.equals("w")){
            for(int i = 1; i < shipSize; i++){
                field[yCordinate][xCordinate - i] = 1;      
            }
        }
        if(direction.equals("n")){
            for(int i = 1; i < shipSize; i++){
                field[yCordinate - i][xCordinate] = 1;      
            }
        }
        if(direction.equals("e")){
            for(int i = 1; i < shipSize; i++){
                field[yCordinate][xCordinate + i] = 1;      
            }
        }if(direction.equals("s")){
            for(int i = 1; i < shipSize; i++){
                field[yCordinate + i][xCordinate] = 1;      
            }
        }
        

        return field;
    }
}