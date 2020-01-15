package src;
public class draw {

public void drawField(int[][] playerfield){
    for (int i = 0; i < playerfield[0].length; i++){
      for (int j = 0; j < playerfield[1].length; j++){
        if(i == 0 && j == 0){
          System.out.print("   a b c d e f g h i j");
          System.out.println();
          System.out.println();
        }
        if(j == 0){
          System.out.print(i + "  ");
        }
          
          System.out.print(playerfield[i][j] + " ");
          if(j == 9){
            System.out.println();
          }
      }
    }
  }

  public void drawFieldWithShips(int[][] playerfield){
    for (int i = 0; i < playerfield[0].length; i++){
      for (int j = 0; j < playerfield[1].length; j++){
        if(i == 0 && j == 0){
          System.out.print("   a b c d e f g h i j");
          System.out.println();
          System.out.println();
        }
        if(j == 0){
          System.out.print(i + "  ");
        }
          if(playerfield[i][j] == 1){
            System.out.print("X" + " ");
          }
          else{
          System.out.print(0 + " ");
          }
          if(j == 9){
            System.out.println();
          }
      }
    }
  }
}