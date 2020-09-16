





public class TicTacToe{
   public static final char SPACE = ' ';
   private static final int SIZE = 3;
   private static final int NUM_POSSIBLE_MOVES = SIZE * SIZE;
   private char board[][];
   private static int numMove;
   public TicTacToe(){
       board = new char[SIZE][SIZE];
      for(int row=0; row<board.length; row++){
         for(int col=0; col<board[row].length; col++){
            board[row][col] = SPACE;
            toString();
         }
      }
      
   }
   public boolean makeMove(int row, int col, char playerSymbol){
      if(row<3 && col<3 && board[row][col]==SPACE){
         board[row][col]= playerSymbol;
         numMove++;
         return true;
      }
      return false;
   }
   
   private boolean markedBySamePlayer(char i, char j, char k){
      if(i==j && j==k && j != SPACE){
         return true;
      }
      return false;
   }
   
   public char winner(){
      for(int row=0; row<board.length;row++){
         if(markedBySamePlayer(board[row][0],board[row][1],board[row][2])==true){
            return board[row][0];
         }
      }
      for(int col=0; col<board.length; col++){ //?
         if(markedBySamePlayer(board[0][col], board[1][col], board[2][col])==true){
            return board[0][col] ; 
         }
      }
      if(markedBySamePlayer(board[0][0],board[1][1],board[2][2])==true){
         return board[0][0]; 
      }
      if(markedBySamePlayer(board[0][2],board[1][1],board[2][0])==true){
         return board[0][2]; 
      }       
      return SPACE;
   }
   
   public boolean isDraw(){
      if(numMove==NUM_POSSIBLE_MOVES){
               return true;
         }
      
      return false;
   }
   
   public String toString(){
      String str = "-------\n";
      
      for(int row=0; row<SIZE;row++){
         for (int col=0; col<board[row].length;col++){
            str+="|"+board[row][col];
            
         }
         str+="|\n-------\n";
      }
      return str;
   }








}


