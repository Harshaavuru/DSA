class Solution {
    public boolean exist(char[][] board, String word) {
        int rows=board.length ; 
        int cols=board[0].length ;
        for(int i=0;i<rows;i++){ 
            for(int j=0;j<cols;j++){ 
                if(board[i][j]==word.charAt(0)){
                    if(solve(board,word,i,j,0)){ 
                        return true ;
                    }
                }
            }
        }
      return false ;
    }
    boolean solve(char[][] board,String word,int rows,int cols,int index){ 
        if(index==word.length()){
            return true ;
        }
        if(rows<0||rows>=board.length||cols<0||cols>=board[0].length){ 
            return false ;
        } 
        if(board[rows][cols]!=word.charAt(index)){ 
            return false ;
        } 
        char curr=board[rows][cols]; 
        board[rows][cols]='#' ; 
        boolean found=  
            solve(board,word,rows-1,cols,index+1)||
            solve(board,word,rows+1,cols,index+1)||
            solve(board,word,rows,cols-1,index+1)||
            solve(board,word,rows,cols+1,index+1) ; 

        board[rows][cols]=curr ; 
        return found; 
    }
}