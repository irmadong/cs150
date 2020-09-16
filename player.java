public class Player{
   private TicTacToe gameBoard;
   private char symbol;
   public Player(TicTacToe gameBoard, char symbol){
      this.gameBoard = gameBoard;
      this.symbol = symbol;
   }
   public void play(){
      int row;
      int col;
      do{
         
         System.out.println("Player "+ symbol + " 's turn.");
         
         
         System.out.println("Enter row (0-2):");
         String contents = StdIn.readLine();
         row = Integer.parseInt(contents);
        
         System.out.println("Enter column (0-2):");
          String contents1 = StdIn.readLine();
          col = Integer.parseInt(contents1);
       
      }
      while(gameBoard.makeMove(row,col,symbol)==false);
      
      gameBoard.makeMove(row,col,symbol);
    
      
      
   }
   
}

