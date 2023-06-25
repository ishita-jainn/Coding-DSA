import java.util.*;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> seen = new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ele = board[i][j];
                if(ele!='.'){
                    if(!seen.add(ele + "in row" + i)||
                        !seen.add(ele + "in col" + j)||
                        !seen.add(ele+ "in block" + i/3 + '-' + j/3)){
                            return false;
                        }
                }
            }
        }
        return true;
        
    }
    
}
