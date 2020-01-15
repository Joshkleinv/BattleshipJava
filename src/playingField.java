package src;

public class playingField {
   int[][] field = new int[10][10]; // Create a class attribute

    // Create a class constructor for the MyClass class
    public playingField() {
      for (int i = 0; i < field[0].length; i++){
        for (int j = 0; j < field[1].length; j++){
            field[i][j] = 0;
        }
      };  
      // Set the initial value for the class attribute x
      
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
            if(field[i][j] == 1){
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
            
            System.out.print(field[i][j] + " ");
            if(j == 9){
              System.out.println();
            }
        }
      }
    }

}